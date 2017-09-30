package ua.com.juja.week1.lab10;

import java.util.Arrays;

/**
 * Created by derrki on 11:17.
 */
public class Test {
    public static void main(String[] args) {
        int[] result = Merger.merge(new int[]{}, new int[]{1});

        if (!Arrays.equals(result, new int[]{1})) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
