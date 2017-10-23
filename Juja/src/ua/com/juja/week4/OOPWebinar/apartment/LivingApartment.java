package ua.com.juja.week4.OOPWebinar.apartment;

import ua.com.juja.week4.OOPWebinar.Owner;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class LivingApartment extends Apartment {
    private int number;
    private Owner[] owners;

    public LivingApartment(int number, int capasity) {
        super(number);
        owners = new Owner[capasity];
    }

    public void addOwner(Owner owner) {
        owners [getFreeRoomIndex()] = owner;
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
        String result = super.toString();
        for (int index = 0; index < owners.length ; index++) {
            if (owners[index] != null){
                result += "*****************************\n";
                result += "Owner :" + owners[index].toString() + "\n";
                result += "*****************************\n";
            }
        }
        return result;
    }

    @Override
    public boolean isFree() {
        return owners[owners.length - 1] == null;
    }

    public boolean isSettled() {
        return owners[0] != null;
    }
}
