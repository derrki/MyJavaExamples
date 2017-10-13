package ua.com.dagget.insertSorting;

public class InsertSorting {
    private final int[] array;

    public InsertSorting(int[] array) {
        this.array = array;
    }

    public int[] insert() {

        int j, temp;
        for (int i = 0; i < array.length ; i++) {
            temp = array[i];
            for (j = i - 1; j >= 0 && array[j]> temp ; j--) {

                array [j+1] = array [j];
            }
            array[j+1]= temp;
        }

        return array;
    }
}
