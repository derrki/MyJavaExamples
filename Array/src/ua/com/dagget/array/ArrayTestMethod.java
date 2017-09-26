package ua.com.dagget.array;

/**
 * Created by press on 19.09.2017.
 */
public class ArrayTestMethod {

    int[] addDataArray (int number){

        int [] array = new int[number];
        for (int i = 0; i< array.length; i++ ){
            array[i] = 9 - i;
            //System.out.print(array[i]);
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

    void invertArray2 (int[] arr){
        for (int k =arr.length/2; k>0; k--){
            int tmp = arr[k-1];
            arr[k-1] = arr[arr.length - k];
            arr[arr.length-k] = tmp;

        }
        for (int i = 0; i< arr.length; i++ ) {
            System.out.print(arr[i]);
        }
    }

    void invertArray3 (int[] arr){
        for (int k =arr.length/2; k>=0; k--){
            int tmp = arr[k];
            arr[k] = arr[arr.length - k-1];
            arr[arr.length-k-1] = tmp;

        }
        for (int i = 0; i< arr.length; i++ ) {
            System.out.print(arr[i]);
        }
    }

    void evenNumbers(int[] arr){

        int[] array = new int[arr.length];
        int i = 0;
        for (int k = 0; k< arr.length; k++){
            if (arr[k]%2==0){
                array[i]=arr[k];
                i++;
            }
        }
        for (int j = 0; j < array.length; j++ ){
            System.out.println(array[j]);
        }

    }

    void nullValue (){
        int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++){

            System.out.println(arr[i]);
        }
    }

}
