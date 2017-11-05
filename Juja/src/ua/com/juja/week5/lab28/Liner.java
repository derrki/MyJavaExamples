package ua.com.juja.week5.lab28;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Liner extends AbstractShip {

    private int passengers;
    public static final float DEFAULT_RENTAL = 1000;

    public Liner(String name, float length, float width, float displacement, int passengers) {
        super(name, length, width, displacement);
        this.passengers = passengers;
    }

    public float calculatePayment(float renta) {
        float resultRenta = 0;
        if(renta < 0 || renta == 0){
            resultRenta = calculatePayment();
        } else {
            resultRenta = passengers*renta;
        }
        return resultRenta;
    }

    @Override
    public float calculatePayment() {
        return passengers*DEFAULT_RENTAL;
    }

     /*BODY*/

}
