package ua.com.juja.week2.quiz08;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class ExchangeArray {

    int [] swap(int [] arr, int index, int indexPlusOne){

        if (indexPlusOne < arr.length){
            int temp = arr[index];
            arr[index] = arr[indexPlusOne];
            arr[indexPlusOne] = temp;
        }
        return arr;
    }
}
