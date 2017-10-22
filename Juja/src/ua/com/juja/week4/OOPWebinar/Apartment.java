package ua.com.juja.week4.OOPWebinar;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Apartment {
    private int number;
    private Owner[] owners;

    public Apartment(int number, int capasity) {
        this.number = number;
        owners = new Owner[capasity];
    }

    public void addOwner(Owner owner) {
        owners [getFreeRoomIndex()] = owner;
        //TODO implement me
    }

    private int getFreeRoomIndex() {
        for (int index = 0; index < owners.length ; index++) {
            if (owners[index] == null){
                return index;
            }

        }
        throw  new RuntimeException("No free rooms for owner!");
    }

    @Override
    public String toString() {
        String result = "Apartment number " + number + "\n";
        for (int index = 0; index < owners.length ; index++) {
            if (owners[index] != null){
                result += "*****************************\n";
                result += "Owner :" + owners[index].toString() + "\n";
                result += "*****************************\n";
            }
        }
        return result;
    }

    public boolean isFree() {
        return owners[owners.length - 1] == null;
    }
}
