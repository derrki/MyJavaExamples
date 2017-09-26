package ua.com.juja.core.ua.com.juja.core.lab12;

/**
 * Created by derrki on 21:58.
 */
public class ArrayUtils {
    public static int[] lookFor(int[] array) {
        int[] arr = new int[2];
        int[] arr2 = new int[2];
        int[] arr3 = new int[]{};

        int counter = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > 0 && counter == 0) {
                arr[0] = i;
                counter++;
            } else if (array[i] > 0) {
                arr[1] = i;
            } else if (array[i] <= 0 && arr[1] != 0) {

                for (int k = i; k < array.length; k++) {
                    if (array[k] > 0 && arr2[0] == 0) {
                        arr2[0] = k;
                    } else if (array[k] > 0) {
                        arr2[1] = k;
                        i = k;
                        counter = 0;
                    }
                }
            }
        }

        if (arr[1] - arr[0] > arr2[1] - arr2[0] || counter != 0) {
            return arr;
        } else if ((arr[1] - arr[0] == arr2[1] - arr2[0]) && (arr[1] - arr[0]) != 0) {
            return arr;
        } else if (arr2[1] - arr2[0] > arr[1] - arr[0]) {
            return arr2;
        } else {
            return arr3;
        }

        //return arr;

    }
}
