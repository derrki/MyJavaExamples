package ua.com.juja.week1.lab2;

/**
 * Created by derrki on 21:14.
 */
public class Test {
    public static void main(String[] args) {
        String emptyPurchases = EggsBread.printPurchases(true, false);

        if (emptyPurchases == null)
            throw new AssertionError("Result cannot be null");

        if (emptyPurchases.equalsIgnoreCase("eggs"))
            System.out.print("OK");
    }
}
