package ua.com.dagget.array;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by press on 19.09.2017.
 */
public class MainArray {
    public static void main(String[] args) throws IOException {

        int [] arr = {1,2,3,4,5};

        for (int i = 0; i < arr.length; i++) {
            arr = SwapArray.swap(arr, i, i+1);
            System.out.println(Arrays.toString(arr));
        }

    }
}
