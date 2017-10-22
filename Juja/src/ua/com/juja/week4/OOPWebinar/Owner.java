package ua.com.juja.week4.OOPWebinar;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Owner {
    private final String name;

    public Owner(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Owner :" +  name + "\n";
    }
}
