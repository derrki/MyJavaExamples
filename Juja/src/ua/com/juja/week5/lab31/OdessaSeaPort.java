package ua.com.juja.week5.lab31;

class OdessaSeaPort implements SeaPortQueue {

    private static final int NO_SHIP_IN_ARRAY = -1;
    private int indexShipInPort = NO_SHIP_IN_ARRAY;
    private AbstractShip[] arrayShip = new AbstractShip[LENGTH_QUEUE_SHIP];

    @Override
    public int addShipToEndQueue(AbstractShip ship) {

        if (indexShipInPort == LENGTH_QUEUE_SHIP - 1) {
            return indexShipInPort = NO_SHIP_IN_ARRAY;
        }

        arrayShip[++indexShipInPort] = ship;
        return indexShipInPort;
    }

    @Override
    public int removeShipFromBeginQueue() {
        int resultRemove;
        arrayShip = removeArrayElement(arrayShip);

        if (indexShipInPort > 0) {
            resultRemove = 1;
        } else {
            resultRemove = NO_SHIP_IN_ARRAY;
        }
        return resultRemove;
    }

    @Override
    public String printQueueShip() {

        String resultStringShip = "";

        if (0 > indexShipInPort) {
            resultStringShip = "QueueEmpty";
        } else {
            for (int index = 0; index < arrayShip.length; index++) {
                resultStringShip += "{" + arrayShip[index].toPrint() + "};";
            }
        }
        return resultStringShip;
    }

    private AbstractShip[] removeArrayElement(AbstractShip[] abstractShips) {
        AbstractShip[] tempObjectsArray = new AbstractShip[abstractShips.length - 1];

        System.arraycopy(abstractShips, 1, tempObjectsArray, 0, tempObjectsArray.length);

        abstractShips = tempObjectsArray;
        indexShipInPort--;

        return abstractShips;
    }
}
