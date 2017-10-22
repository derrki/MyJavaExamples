package ua.com.juja.week4.OOPWebinar;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Floor {
    private static final int DEFAULT_APARTMENT_KAPASITY = 4;
    private int number;
    private Apartment [] apartments;

    public Floor(int number, int floorsCount, NumberGenerator numbers) {
        this.number = number;
        this.apartments = new Apartment[floorsCount];
        for (int index = 0; index < floorsCount ; index++) {
            apartments[index] = new Apartment(numbers.getNumber(), DEFAULT_APARTMENT_KAPASITY);

        }
    }

    public Apartment getFreeApartment() {
        for (Apartment apartment: apartments) {
            if (apartment.isFree()){
                return apartment;
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
}
