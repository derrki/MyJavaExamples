package ua.com.juja.week4.OOPWebinar.staff;

import ua.com.juja.week4.OOPWebinar.apartment.Apartment;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class RoboCleaner implements Cleaner {
    private final String nick;

    public RoboCleaner(String nick) {
        this.nick = nick;
    }

    @Override
    public void clean(Apartment apartment) {
        System.out.println("RoboboboClean " + nick + " Cleaning");
        System.out.println("Done!");
    }
}
