package ua.com.juja.week4.OOPWebinar;

import ua.com.juja.week4.OOPWebinar.staff.Housemaid;
import ua.com.juja.week4.OOPWebinar.staff.RoboCleaner;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Main {
    public static void main(String[] args) {
        House house = new House(8, 3);

        Owner owner1 = new Owner("Stiven Pupkin");
        Owner owner2 = new Owner("Selena Pupkina");
        Owner owner3 = new Owner("Eva Pupkina");
        Owner owner4 = new Owner("Adam Pupkin");
        Owner owner5 = new Owner("Bob Marley");
        Owner owner6 = new Owner("Bil Pupkin");
        Owner owner7 = new Owner("Eric Marley");
        Owner owner8 = new Owner("Mr X");

        Housemaid housemaid = new Housemaid("Ewa Marley");
        house.addCleaner(housemaid);
        house.addCleaner(new RoboCleaner("nick"));
        house.addCleaner(new RoboCleaner("tick"));
        house.addCleaner(new RoboCleaner("bick"));
        house.addCleaner(new RoboCleaner("aick"));
        house.addCleaner(new RoboCleaner("vick"));
        house.addCleaner(new RoboCleaner("wick"));

        house.settle(owner1);
        house.settle(owner2);
        house.settle(owner3);
        house.settle(owner4);
        house.settle(owner5);
        house.settle(owner6);
        house.settle(owner7);
        house.settle(owner8);
        house.settle(housemaid);

        System.out.println(house.toString());

    }
}
