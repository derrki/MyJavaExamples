package ua.com.juja.week4.OOPWebinar;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Floor {
    private int number;
    private Apartment [] apartments;

    public Floor(int number, int floorsCount) {
        this.number = number;
        this.apartments = new Apartment[floorsCount];
        for (int index = 0; index < floorsCount ; index++) {
            apartments[index] = new Apartment();

        }
    }

    public Apartment getFreeApartment() {
        return null;// TODO implement me
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
