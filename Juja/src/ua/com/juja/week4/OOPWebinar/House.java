package ua.com.juja.week4.OOPWebinar;

import ua.com.juja.week4.OOPWebinar.apartment.LivingApartment;
import ua.com.juja.week4.OOPWebinar.staff.Cleaner;
import ua.com.juja.week4.OOPWebinar.staff.Housemaid;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */

public class House {
    private Floor[] floors;
    private Cleaner[] cleaners;

    public House(int floorsCount, int apartmensOnFloor) {
        NumberGenerator numbers = new NumberGenerator();
        cleaners = new Cleaner[floorsCount];

        floors = new Floor[floorsCount];
        for (int index = 0; index < floorsCount; index++) {
            floors[index] = new Floor(index + 1, apartmensOnFloor, numbers);

        }
    }



    public void settle(Owner owner){
        System.out.println("Try to settle " + owner.toString() + "\n");
        for (Floor floor : floors){
           LivingApartment apartment = (LivingApartment) floor.getFreeApartment();
            if (apartment != null){
                apartment.addOwner(owner);
                break;
            }
        }
    }

    @Override
    public String toString() {
        String result = "House:\n";
        for (Floor floor : floors) {
            result += floor.toString() + "\n";
        }
        return result;
    }

    public void addCleaner(Cleaner cleaner) {
        int floor = nextCleanerPlace();
        this.cleaners[floor] = cleaner;
        this.floors[floor].setCleaner(cleaner);
    }

    private int nextCleanerPlace() {
        for (int index = 0; index < cleaners.length ; index++) {
            if (cleaners[index] == null) {
                return index;
            }

        }
        throw  new RuntimeException("No place for new cleaner");
    }


}
