package ua.com.juja.week4.OOPWebinar.apartment;

import ua.com.juja.week4.OOPWebinar.Owner;
import ua.com.juja.week4.OOPWebinar.printer.Printer;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class LivingApartment extends Apartment {
    private int number;
    private Owner[] owners;
    private Printer printer;

    public LivingApartment(int number, int capasity, Printer printer) {
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
        return printer.print(this);
    }

    @Override
    public boolean isFree() {
        return owners[owners.length - 1] == null;
    }

    public boolean isSettled() {
        return owners[0] != null;
    }

    public String [] getOwners() {
        String[] result = new String[owners.length];
        for (int index = 0; index < result.length; index++){
            if (owners[index] != null) {
                result[index] = owners[index].toString();
            } else {
                result [index] = "";
            }
        }
        return result;
    }
}
