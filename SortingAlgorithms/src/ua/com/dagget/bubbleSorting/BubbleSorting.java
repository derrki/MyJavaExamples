package ua.com.dagget.bubbleSorting;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class BubbleSorting {

    private int [] mas;

    public BubbleSorting(int[] mas) {
        this.mas = mas;
    }

    public int [] bubbleSort(){

        int[] resMaas = mas;

        for (int i = resMaas.length-1; i >= 0 ; i--) {
            for (int j = 0; j < i ; j++) {
                if(resMaas[j] > resMaas[j+1]){
                    swap(resMaas, j);
                }
            }

        }

        return resMaas;
    }

    private void swap(int[] mas, int index) {
        int temp = mas[index];
        mas[index] = mas[index+1];
        mas[index+1] = temp;
    }
}
