package ua.com.juja.week2.quiz09;

import java.util.Arrays;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Main {

    public static void main(String[] args) {
        int [] array = {6,8,7,5,1,-2,65,48};

        System.out.println("Algorithm 1 ----------------");
        array = Algorithm.exchangeOfElements(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));

        System.out.println("Algorithm 2 ----------------");
        array = Algorithm.invertArray(array);
        System.out.println(Arrays.toString(array));

        System.out.println("Algorithm 3 ----------------");
        int index = Algorithm.linearSearch(array, 5);
        System.out.println(index);

        System.out.println("Algorithm 4 ----------------");
        int ind = Algorithm.f(array, 7);
        System.out.println(ind);

    }
}
