package ua.com.juja.core.ua.com.juja.core.lab12;

import java.util.Arrays;

/**
 * Created by derrki on 22:03.
 */
public class Test {
    public static void main(String[] args) {
        int[] array = {1,0,0,0,0};
        int[] expected = {0, 0};
        int[] actual = ArrayUtils.lookFor(array);

        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
