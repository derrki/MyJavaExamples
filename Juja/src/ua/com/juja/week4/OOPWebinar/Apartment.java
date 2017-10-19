package ua.com.juja.week4.OOPWebinar;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Apartment {
    private int number;

    public Apartment(int number) {
        this.number = number;
    }

    public void addOwner(Owner owner) {
        //TODO implement me
    }

    @Override
    public String toString() {
        return "Apartment number " + number;
    }
}
