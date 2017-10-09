package ua.com.dagget.sortDySampling;

import java.util.Arrays;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
class SelectionSorter {

    static void sort(int[] arr){

        for (int index = 0; index < arr.length ; index++) {

            int temp = arr [index];
            int tempIndex = index;
            for (int i = index+1; i < arr.length; i++) {

                if (arr[i] < temp) {
                    temp = arr[i];
                    tempIndex = i;
                }
            }
            if (arr[index] != arr[tempIndex]) {
                arr[tempIndex] = arr[index];
                arr[index] = temp;
            }

            System.out.println(Arrays.toString(arr));
        }
    }
}
