package ua.com.juja.week4.OOPWebinar;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Main {
    public static void main(String[] args) {
        House house = new House(16, 4);

        Owner owner1 = new Owner("Stiven Pupkin");
        Owner owner2 = new Owner("Selena Pupkina");
        Owner owner3 = new Owner("Eva Pupkina");
        Owner owner4 = new Owner("Adam Pupkin");
        Owner owner5 = new Owner("Bob Marley");

        house.settle(owner1);
        house.settle(owner2);
        house.settle(owner3);
        house.settle(owner4);
        house.settle(owner5);

        System.out.println(house.toString());

    }
}
