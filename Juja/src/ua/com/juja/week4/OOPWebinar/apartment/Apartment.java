package ua.com.juja.week4.OOPWebinar.apartment;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public abstract class Apartment {

    private int number;

    public Apartment(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " number " + number + "\n";
    }

    public boolean isFree() {
        return false;
    }

    public int getNumber() {
        return number;
    }
}
