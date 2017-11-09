package ua.com.dagget.arrayCRUD;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        ArrayCRUD arrayCRUD = new ArrayCRUD();

        int[] arrayDefault = new int[10];
        int[] arrayCreated = arrayCRUD.creareArrey(10);

        if(arrayDefault == arrayCreated){
            System.out.println("масиви однакові");
        } else {
            System.out.println("масиви різні" );
        }

        System.out.println(Arrays.toString(arrayDefault));
        System.out.println(Arrays.toString(arrayCreated));
    }

}
