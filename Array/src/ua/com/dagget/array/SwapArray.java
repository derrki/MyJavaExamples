package ua.com.dagget.array;

public class SwapArray {

    static int [] swap (int [] arr, int index, int indexPlusOne){

            int a = arr[indexPlusOne];
            arr[indexPlusOne] = arr[index];
            arr[index] = a;
            return arr;
        }
}
