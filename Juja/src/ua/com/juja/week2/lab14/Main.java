package ua.com.juja.week2.lab14;

import java.util.Arrays;
import java.util.Date;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Main {
    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};
        long start = new Date().getTime();

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {

            array[i] = (int) Math.round(Math.random() * 100);
            System.out.println(Arrays.toString(array));
        }
        //BubbleSorterToTheRight.sort(arr);
        BubbleSorterToTheLeft.sort(array);

        long now = new Date().getTime() - start;
        System.out.println("run time  - " + now + " ms");


    }
}
