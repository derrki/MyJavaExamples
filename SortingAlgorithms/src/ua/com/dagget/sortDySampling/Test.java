package ua.com.dagget.sortDySampling;

import java.util.Arrays;
import java.util.Date;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Test {
    public static void main(String[] args) {

        long start = new Date().getTime();
        int [] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)Math.round(Math.random()*100);
        }
        System.out.println("Input date");
        System.out.println(Arrays.toString(array));
        System.out.println("Output date");
        SelectionSorter.sort(array);

        long now = new Date().getTime() - start;
        System.out.println("run time  - " + now + " ms");
    }
}
