package ua.com.dagget.insertSorting;

import ua.com.dagget.bubbleSorting.BubbleSorting;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int [] array = new int[10];
        for (int i = 0; i < array.length; i++){
            array[i] = (int) Math.round(Math.random()*100);
        }
        System.out.println("Input date");
        System.out.println(Arrays.toString(array));


        InsertSorting insertSorting = new InsertSorting(array);
        array = insertSorting.insert();

        System.out.println("Output date");
        System.out.println(Arrays.toString(array));
    }
}
