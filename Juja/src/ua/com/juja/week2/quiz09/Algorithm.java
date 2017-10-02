package ua.com.juja.week2.quiz09;

import java.util.Arrays;

public class Algorithm {

    //1
    static int[] exchangeOfElements(int[] array, int i, int j) {

        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
        return array;
    }

    //2
    static int[] invertArray(int[] array) {

        for (int k = 0; k < array.length / 2; k++) {
            int tmp = array[k];
            array[k] = array[array.length - 1 - k];
            array[array.length - 1 - k] = tmp;
        }

        return array;
    }

    //3
    static int linearSearch(int[] array, int x) {

        for (int j = 0; j < array.length; j++) {
            if (array[j] == x) {
                return j;
            }

        }
        return -1;
    }

    //4
    static int f(int[] array, int x) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = array[mid];
            if (midVal < x)
                low = mid + 1;
            else if (midVal > x)
                high = mid - 1;
            else
                return mid;
        }

        return -(low + 1);
    }

    //5
    static int[] f2(int[] arr) {
        for (int barrier = arr.length - 1; barrier >= 0; barrier--) {
            for (int index = 0; index < barrier; index++) {
                if (arr[index] > arr[index + 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = tmp;
                    System.out.println(Arrays.toString(arr));
                }

            }

        }
        return arr;
    }

    //6
    static int[] f3(int[] arr) {
        for (int barrier = 1; barrier < arr.length; barrier++) {
            int newElement = arr[barrier];
            int location = barrier - 1;
            while (location >= 0 && arr[location] > newElement) {
                arr[location + 1] = arr[location];
                location--;
                System.out.println(Arrays.toString(arr));
            }
            arr[location + 1] = newElement;
        }
        return arr;
    }

    //7
    static int[] f4(int[] array) {
        for (int barrier = 0; barrier < array.length - 1; barrier++) {
            for (int index = barrier + 1; index < array.length; index++) {
                if (array[barrier] > array[index]) {
                    int tmp = array[index];
                    array[index] = array[barrier];
                    array[barrier] = tmp;
                    System.out.println(Arrays.toString(array));
                }
            }
        }
        return array;
    }

    //8
    static int[] f5(int[] array) {
        for (int index = 0; index < array.length - 1; index++) {
            int tmp = array[index];
            array[index] = array[index + 1];
            array[index + 1] = tmp;
            System.out.println(Arrays.toString(array));
        }
        return array;
    }

    //9
    static int[] f6(int[] array) {
        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] > array[index + 1]) {
                int tmp = array[index];
                array[index] = array[index + 1];
                array[index + 1] = tmp;
                System.out.println(Arrays.toString(array));
            }
        }
        return array;
    }
}
