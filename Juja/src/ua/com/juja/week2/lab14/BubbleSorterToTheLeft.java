package ua.com.juja.week2.lab14;

import java.util.Arrays;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class BubbleSorterToTheLeft {
    public static void sort(int[] arr) {
        System.out.println("Input date 2");
        System.out.println(Arrays.toString(arr));
        System.out.println("Output date 2");
        for (int barrier = 0; barrier < arr.length; barrier++) {
            for (int index = arr.length-1; index >0; index--) {
                if (arr[index] < arr[index - 1]) {
                    int tmp = arr[index-1];
                    arr[index-1] = arr[index];
                    arr[index] = tmp;
                }
                System.out.println(Arrays.toString(arr));
            }

        }
    }
}