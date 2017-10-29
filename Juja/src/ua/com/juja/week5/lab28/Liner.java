package ua.com.juja.week5.lab28;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Liner extends AbstractShip {

    private int passengers;
    public static final float DEFAULT_RENTAL = 1000;

    public Liner(String name, float length, float width, float displacement) {
        super(name, length, width, displacement);
    }

    @Override
    public float calculatePayment() {
        return 0;
    }

     /*BODY*/

}
