package ua.com.juja.week2.algoritthm;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class WhiteCrow {

    public static final int ERROR_CODE = -1;

    public static int find(int[] array) {

        for (int first = 0; first < array.length; first++) {
            if (!found(array, first)){
                return first;
            }
        }
        return ERROR_CODE;
    }

    private static boolean found(int[] array, int givenNumbPosition) {
        int foundNumber = array[givenNumbPosition];

        for (int index = 0; index < array.length; index++) {

            if (givenNumbPosition == index){
                continue;
            }
            if (array[index] == foundNumber) {
                return true;
            }
        }
        return false;
    }
}
