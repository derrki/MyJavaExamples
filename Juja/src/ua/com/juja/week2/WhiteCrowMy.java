package ua.com.juja.week2;

//моя реалізіція задачі

public class WhiteCrowMy {

    static void searchArray(int[] array) {

        int numberWithoutPair = 0;
        int coounter = 0;

        for (int i = 0; i < array.length; i++) {
            numberWithoutPair = array[i];
            for (int k = 0; k < array.length; k++){
                if (numberWithoutPair == array[k]){
                    coounter ++;
                }
            }
            if (coounter == 1){
                System.out.println(numberWithoutPair);
            } else {
                coounter = 0;
            }
        }
    }
}
