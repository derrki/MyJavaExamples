package ua.com.juja.week4.OOPWebinar;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class SimpleHouse {
    private int floorsCount;
    private int apartmentsOnFloor;

    public SimpleHouse(int floorsCount, int apartmentsOnFloor) {
        this.floorsCount = floorsCount;
        this.apartmentsOnFloor = apartmentsOnFloor;
    }

    @Override
    public String toString() {
        String result = "House:\n";
        for (int i = 0; i < floorsCount ; i++) {
            for (int j = 0; j < apartmentsOnFloor ; j++) {
                result += "#";
            }
            result += "#";
        }
        return result;
    }
}
