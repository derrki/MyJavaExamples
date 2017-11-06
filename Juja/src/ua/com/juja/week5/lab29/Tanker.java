package ua.com.juja.week5.lab29;

class Tanker  extends AbstractShip{

    private float volume;
    private float rents;
    public static final float DEFAULT_RENTAL = 250;

    public Tanker(String name, float length, float width, float displacement, float volume) {
        super(name, length, width, displacement);
        this.volume = volume;
    }

    public float calculatePayment(float volume) {
        float result = 0;
        if(volume < 0 || volume == 0) {
            result = calculatePayment();
        } else {

            result = volume * DEFAULT_RENTAL;
        }
        return result;
    }

    @Override
    public float calculatePayment() {
        return volume * DEFAULT_RENTAL;
    }
}
