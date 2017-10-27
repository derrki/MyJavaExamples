package ua.com.juja.week4.OOPWebinar2;

import java.util.Arrays;

/**
*1.Make it work. 2.Make it right. 3.Make it fast
*/

public class Main {
    public static void main(String[] args) {
        MultiHouse multiHouse = new MultiHouse(10);
        Floor floor = multiHouse.get(10);

        System.out.println(floor);


        System.out.println(multiHouse.toString());
        }

    }
