package ua.com.juja.week2.lab15;

import java.util.Arrays;
import java.util.Date;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Main {
    public static void main(String[] args) {

        long start = new Date().getTime();
        int[] arr = {6,9,7,8,2,4};

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {

            array[i] = (int) Math.round(Math.random() * 100);
            System.out.println(Arrays.toString(array));
        }

        SelectionSorter.sort(array);

        long now = new Date().getTime() - start;
        System.out.println("run time  - " + now + " ms");

    }
}
