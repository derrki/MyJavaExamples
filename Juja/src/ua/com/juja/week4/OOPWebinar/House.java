package ua.com.juja.week4.OOPWebinar;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */

public class House {
    private Floor[] floors;

    public House(int floorsCount, int apartmensOnFloor) {
        floors = new Floor[floorsCount];
        for (int index = 0; index < floorsCount; index++) {
            floors[index] = new Floor(index + 1, apartmensOnFloor);
        }
    }

    public void settle(Owner owner){
        for (Floor floor : floors){
           Apartment apartment = floor.getFreeApartment();
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
}
