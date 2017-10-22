package ua.com.juja.week4.OOPWebinar.apartment;

import ua.com.juja.week4.OOPWebinar.equipment.Bucket;
import ua.com.juja.week4.OOPWebinar.equipment.Equipment;
import ua.com.juja.week4.OOPWebinar.equipment.Extinguisher;
import ua.com.juja.week4.OOPWebinar.equipment.Swob;

import java.util.Arrays;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class TechnicalApartment extends Apartment {

    private Equipment[] equipments;

    public TechnicalApartment(int number) {
        super(number);
        equipments = new Equipment[10];
        equipments[0] = new Extinguisher();
        equipments[1] = new Bucket();
        equipments[2] = new Swob();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "With objects: " + Arrays.toString(equipments);
    }
}
