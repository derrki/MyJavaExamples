package ua.com.juja.week4.OOPWebinar.staff;

import ua.com.juja.week4.OOPWebinar.Owner;
import ua.com.juja.week4.OOPWebinar.apartment.Apartment;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Housemaid extends Owner implements Cleaner {

    public Housemaid(String name) {
        super(name);
    }

    @Override
    public void clean(Apartment apartment) {
        System.out.println("Cleaning apartment " + apartment.getNumber());
        System.out.println("Cleaning done by " + name);
    }
}
