package ua.com.juja.week2.quiz08;

import java.util.Arrays;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Main4 {
    public static void main(String[] args) {

        int[] array1 = {2, 1, 3};
        int[] array2 = {6, 8, 5, 4};
        int[] array3 = {5, 3, 3, 4, 9};
        int[] array4 = {1, 0, 3, 5, 5, 18};
        int[] array5 = {5, 9, 3, 1, 5, 0, 7};
        int[] array6 = {1, 6, 3, 8, 5, 15, 7, 8};
        int[] array7 = {0, 10, 3, 4, 6, 6, 7, 9, 9};
        int[] array8 = {8, 2, 5, 4, 4, 6, 7, 4, 9, 10};
        int[] array9 = {8, 2, 3, 4, 6, 6, 7, 8, 9, 10, 16};
        int[] array10 = {1, 2, 8, 4, 65, 6, 7, 8, 9, 10, 1, 12};
        int[] array11 = {18, 2, 5, 4, 9, 6, 7, 8, 9, 10, 11, 12, 13};
        int[] array12 = {6, 9, 9, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        ExchangeArray exchangeArray = new ExchangeArray();

        //1
        System.out.println("Array_1---------------");
        System.out.println(Arrays.toString(array1));
        for (int i = 0; i < array1.length - 1; i++) {
            array1 = exchangeArray.swap(array1, i, i + 1);
            System.out.println(Arrays.toString(array1));
        }

        //2
        System.out.println("");
        System.out.println("Array_2---------------");
        System.out.println("");
        System.out.println(Arrays.toString(array2));

        for (int i = array2.length - 1; i > 0; i--) {
            array2 = exchangeArray.swap(array2, i, i - 1);
            System.out.println(Arrays.toString(array2));
        }

        //3
        System.out.println("");
        System.out.println("Array_3---------------");
        System.out.println("");
        System.out.println(Arrays.toString(array3));

        for (int i = 1; i < array3.length; i++) {
            array3 = exchangeArray.swap(array3, 0, i);
            System.out.println(Arrays.toString(array3));
        }

        //4
        System.out.println("");
        System.out.println("Array_4---------------");
        System.out.println("");
        System.out.println(Arrays.toString(array4));

        for (int i = 0; i < array4.length - 1; i++) {
            array4 = exchangeArray.swap(array4, i, array4.length - 1);
            System.out.println(Arrays.toString(array4));
        }

        //5
        System.out.println("");
        System.out.println("Array_5---------------");
        System.out.println("");
        System.out.println(Arrays.toString(array5));

        for (int i = 0; i < array5.length - 1; i++) {
            if (array5[i] < array5[i + 1]) {
                array5 = exchangeArray.swap(array5, i, i + 1);
                System.out.println(Arrays.toString(array5));
            }
        }

        //6
        System.out.println("");
        System.out.println("Array_6---------------");
        System.out.println("");
        System.out.println(Arrays.toString(array6));

        for (int i = array6.length - 1; i > 0 ; i--) {
            if (array6[i] < array6[i - 1]) {
                array6 = exchangeArray.swap(array6, i, i - 1);
                System.out.println(Arrays.toString(array6));
            }
        }

        //7
        System.out.println("");
        System.out.println("Array_7---------------");
        System.out.println("");
        System.out.println(Arrays.toString(array7));

        for (int i = 0; i < array7.length-1 ; i++) {
            if (array7[i] > array7[i + 1]) {
                array7 = exchangeArray.swap(array7, i, i + 1);
                System.out.println(Arrays.toString(array7));
            }
        }

        //8
        System.out.println("");
        System.out.println("Array_8---------------");
        System.out.println("");
        System.out.println(Arrays.toString(array8));

        for (int i = array8.length-1; i > 0 ; i--) {
            if (array8[i] > array8[i - 1]) {
                array8 = exchangeArray.swap(array8, i, i - 1);
                System.out.println(Arrays.toString(array8));
            }
        }

        //9
        System.out.println("");
        System.out.println("Array_9---------------");
        System.out.println("");
        System.out.println(Arrays.toString(array9));

        for (int i = 1; i < array9.length ; i++) {
            if (array9[0] < array9[i]) {
                array9 = exchangeArray.swap(array9, 0, i);
                System.out.println(Arrays.toString(array9));
            }
        }

        //10
        System.out.println("");
        System.out.println("Array_10---------------");
        System.out.println("");
        System.out.println(Arrays.toString(array10));

        for (int i = 1; i < array10.length ; i++) {
            if (array10[0] > array10[i]) {
                array10 = exchangeArray.swap(array10, 0, i);
                System.out.println(Arrays.toString(array10));
            }
        }

        //11
        System.out.println("");
        System.out.println("Array_11---------------");
        System.out.println("");
        System.out.println(Arrays.toString(array11));

        for (int i = 0; i < array11.length-1 ; i++) {
            if (array11[i] < array11[array11.length-1]) {
                array11 = exchangeArray.swap(array11, i, array11.length-1);
                System.out.println(Arrays.toString(array11));
            }
        }

        //12
        System.out.println("");
        System.out.println("Array_12---------------");
        System.out.println("");
        System.out.println(Arrays.toString(array12));

        for (int i = 0; i < array12.length-1 ; i++) {
            if (array12[i] > array12[array11.length-1]) {
                array12 = exchangeArray.swap(array12, i, array12.length-1);
                System.out.println(Arrays.toString(array12));
            }
        }
    }
}
