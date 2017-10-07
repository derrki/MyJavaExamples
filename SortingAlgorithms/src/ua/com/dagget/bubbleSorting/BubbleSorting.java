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

        for (int i = 0; i < resMaas.length; i++) {
            for (int j = 1; j < resMaas.length ; j++) {
                if(resMaas[i]> resMaas[j]){
                    swap(resMaas, i);
                }
            }

        }

        return resMaas;
    }

    private void swap(int[] mas, int index) {
        int temp = mas[index];
        mas[index] = mas[index+1];
        mas[index] = temp;
    }
}
