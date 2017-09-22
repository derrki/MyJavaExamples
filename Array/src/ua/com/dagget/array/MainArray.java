package ua.com.dagget.array;

import java.io.IOException;

/**
 * Created by press on 19.09.2017.
 */
public class MainArray {
    public static void main(String[] args) throws IOException {
        ArrayTestMethod arrayTestMethod = new ArrayTestMethod();

        //AddArrayData.addIntData();

       // for (int i = 0; i < 10; i++){
         //   System.out.println(AddArrayData.addStringData());
        //}


       // ArrayMaxMin arrayMaxMin = new ArrayMaxMin();
        //arrayMaxMin.maxMin(AddArrayData.addIntData());

        //arrayTestMethod.addDataArray(10);

       // arrayTestMethod.invertArray( arrayTestMethod.addDataArray(25));
        arrayTestMethod.invertArray2( arrayTestMethod.addDataArray(8));
        //arrayTestMethod.invertArray3( arrayTestMethod.addDataArray(8));
        //arrayTestMethod.nullValue();
    }
}
