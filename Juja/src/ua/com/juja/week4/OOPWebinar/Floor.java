package ua.com.juja.week4.OOPWebinar;

import ua.com.juja.week4.OOPWebinar.apartment.Apartment;
import ua.com.juja.week4.OOPWebinar.apartment.LivingApartment;
import ua.com.juja.week4.OOPWebinar.apartment.TechnicalApartment;
import ua.com.juja.week4.OOPWebinar.printer.SimpleTextPrinter;
import ua.com.juja.week4.OOPWebinar.staff.Cleaner;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Floor {
    private static final int DEFAULT_APARTMENT_KAPASITY = 4;
    private int number;
    private Apartment[] apartments;
    private Cleaner cleaner;

    public Floor(int number, int floorsCount, NumberGenerator numbers) {
        this.number = number;
        this.apartments = new Apartment[floorsCount];
        this.apartments[0] = new TechnicalApartment(numbers.getNumber());
        for (int index = 1; index < floorsCount ; index++) {
            apartments[index] = new LivingApartment(numbers.getNumber(), DEFAULT_APARTMENT_KAPASITY, new SimpleTextPrinter());

        }
    }

    public Apartment getFreeApartment() {
        for (Apartment apartment: apartments) {
            if (apartment instanceof LivingApartment && apartment.isFree()){
                LivingApartment livingApartment = (LivingApartment) apartment;
                if (!livingApartment.isSettled() ){
                    cleaner.clean(apartment);
                }
                cleaner.clean(apartment);
                return livingApartment;
            }
        }
        return null;
    }

    @Override
    public String toString() {
       String result = "=============================\n";
        result += "Floor number " + number + "\n";
        result += "-----------------------------\n";
        for (Apartment apartment : apartments){
            result += apartment.toString() + "\n";
        }
        result += "=============================\n";
        return result;
    }

    public void setCleaner(Cleaner cleaner) {
        this.cleaner = cleaner;
    }
}
