package ua.com.dagget.algorithm.bubblSorting;

import java.util.Arrays;

public class BubleSorting {


    public static void main(String[] args) {
        int[] array = new int[10];
        for(int i = 0; i <array.length; i++){

            array[i] =(int) Math.round(Math.random()*100);
            System.out.println(Arrays.toString(array));
        }


    }


}
