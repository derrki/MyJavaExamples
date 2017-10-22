package ua.com.juja.week4.OOPWebinar.equipment;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public abstract class Equipment {

    @Override
    public String toString() {
        return "Equipment " + this.getClass().getSimpleName();
    }
}
