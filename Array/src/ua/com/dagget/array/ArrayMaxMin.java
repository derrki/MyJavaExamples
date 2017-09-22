package ua.com.dagget.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by press on 21.09.2017.
 */
public class ArrayMaxMin {


    void maxMin (int arr[]) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int max = 0 , min = 0;

        for (int i = 0; i < arr.length; i++){

            String st = reader.readLine();
            arr[i] = Integer.parseInt(st);

            if (max < arr[i]){
                max= arr[i];
            }

        }
        System.out.println(max);

    }

}
