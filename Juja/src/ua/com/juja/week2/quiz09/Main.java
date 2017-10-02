package ua.com.juja.week2.quiz09;

import java.util.Arrays;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Main {

    public static void main(String[] args) {
        int [] array = {6,8,14,5,1,-2,65,48};
        int [] array2 = {6,8,14,5,1,-2,65,48};
        int [] array3 = {6,8,14,5,1,-2,65,48};

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

        System.out.println("Algorithm 5 ----------------");
        int [] inde = Algorithm.f2(array);
        System.out.println(inde);

        System.out.println("Algorithm 6 ----------------");
        int [] in = Algorithm.f3(array2);
        System.out.println(in);

        System.out.println("Algorithm 7 ----------------");
        int [] indexe = Algorithm.f4(array3);
        System.out.println(indexe);

        System.out.println("Algorithm 8 ----------------");
        int [] indexes = Algorithm.f5(array);
        System.out.println(indexes);

        System.out.println("Algorithm 9 ----------------");
        int [] indexesys = Algorithm.f6(array);
        System.out.println(indexesys);



    }
}
