package ua.com.juja.week2.lab14;

import java.util.Arrays;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class BubbleSorterToTheRight {
    public static void sort(int[] arr) {
        System.out.println("Input date");
        System.out.println(Arrays.toString(arr));
        System.out.println("Output date");
        for (int barrier = arr.length - 1; barrier >= 0; barrier--) {
            for (int index = 0; index < barrier; index++) {
                if (arr[index] > arr[index + 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = tmp;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
    }
}