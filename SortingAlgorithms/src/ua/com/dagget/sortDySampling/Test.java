package ua.com.dagget.sortDySampling;

import java.util.Arrays;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Test {
    public static void main(String[] args) {
        int [] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)Math.round(Math.random()*100);
        }
        System.out.println("Input date");
        System.out.println(Arrays.toString(array));
        System.out.println("Output date");
        SelectionSorter.sort(array);
    }
}
