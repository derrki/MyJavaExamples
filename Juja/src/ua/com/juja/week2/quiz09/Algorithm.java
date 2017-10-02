package ua.com.juja.week2.quiz09;

public class Algorithm {

    static int[] exchangeOfElements (int [] array, int i, int j){

        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
        return array;
    }

    static  int [] invertArray(int [] array){

        for (int k = 0; k < array.length/2; k++) {
            int tmp = array[k];
            array[k] = array[array.length - 1 -k];
            array[array.length - 1 -k] = tmp;
        }

        return array;
    }

    static int linearSearch (int [] array, int x){

        for (int j = 0; j <  array.length; j++) {
            if (array[j] == x){
                return j;
            }

        }
        return -1;
    }

   static int f(int [] array, int x){
        int low = 0;
        int high = array.length -1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = array[mid];
            if(midVal < x)
                low = mid +1;
            else  if (midVal > x)
                high = mid - 1;
            else
                return mid;
        }

        return -(low + 1);
    }
}
