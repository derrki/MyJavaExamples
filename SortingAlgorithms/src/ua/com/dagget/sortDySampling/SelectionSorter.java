package ua.com.dagget.sortDySampling;

import java.util.Arrays;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class SelectionSorter {

    public static void sort (int [] arr){

        for (int index = 0; index < arr.length ; index++) {

            int temp = arr [index];
            int tenpIndex = index;
            for (int i = index+1; i < arr.length; i++) {

                if (arr[i] < temp) {
                    temp = arr[i];
                    tenpIndex = i;
                }
            }
            arr[tenpIndex] = arr[index];
            arr[index] = temp;

            System.out.println(Arrays.toString(arr));
        }

    }
}
