package ua.com.juja.week5.lab31;

public class Test2 {
    public static void main(String[] args) {
        //check delete in empty  queue
        int expectedStatusRemoveShipInQueueEmpty = -1;
        OdessaSeaPort odessaSeaPort = new OdessaSeaPort();

        int actualResultRemoveShipInQueueEmpty = odessaSeaPort.removeShipFromBeginQueue();
        if (actualResultRemoveShipInQueueEmpty != expectedStatusRemoveShipInQueueEmpty)
            throw new AssertionError("Queue is empty expected return -1 but found " + actualResultRemoveShipInQueueEmpty);

        System.out.print("OK");
    }
}
