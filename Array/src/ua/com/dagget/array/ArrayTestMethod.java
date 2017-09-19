package ua.com.dagget.array;

/**
 * Created by press on 19.09.2017.
 */
public class ArrayTestMethod {

    int[] addDataArray (int number){

        int [] array = new int[number];
        for (int i = 0; i< array.length; i++ ){
            array[i] = 9 - i;
            System.out.print(array[i]);
        }
        return array;
    }

    void invertArray (int[] arr){
        for (int i = 0; i <= arr.length/2;i++){
            int tmp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = tmp;
        }

        for (int i = 0; i< arr.length; i++ ){
            System.out.print(arr[i]);
        }
    }


}
