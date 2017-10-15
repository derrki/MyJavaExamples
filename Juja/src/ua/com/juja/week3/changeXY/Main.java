package ua.com.juja.week3.changeXY;

/**
 * 1.Make it work. 2.Make it right. 3.Make it fast
 */
public class Main {
    public static void main(String[] args) {

    }

    private static void assertMethod(String input, String expected) {
        String actual = changeXY(input);

        String status = actual.equals(expected) ?
                "OK" :
                "FAIL expected: '" + expected + "' but was: '" + actual + "'";

        System.out.println(status);
    }

    public static String changeXY(String input) {

        char[] chars = input.toCharArray();
        char[] result = new char[input.length()];

        for (int index = 0; index < chars.length; index++) {
            if (chars[index] == 'x') {
                result[index] = 'y';
            } else {
                result[index]= chars[index];
            }

        }
        return new String(result);
    }
}
