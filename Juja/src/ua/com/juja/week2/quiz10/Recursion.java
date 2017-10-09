package ua.com.juja.week2.quiz10;

public class Recursion {
    public static void f1(int n) {
        System.out.print(n);
        if (n < 7) {
            f1(2 * n);
        }
    }

    public static void f2(int n) {

        if (n < 7) {
            System.out.print(n);
            f2(2 * n);
        }
    }

    public static void f3(int n) {

        if (n < 7) {
            f3(2 * n);
        }
        System.out.print(n);
    }

    public static void f4(int n) {

        if (n < 7) {
            f4(2 * n);
            System.out.print(n);
        }
    }

    public static void f5(int n) {
        System.out.print(n);
        if (n < 7) {
            f5(2 * n);
        }
        System.out.print(n);
    }

    public static void f6(int n) {
        System.out.print(n);
        if (n < 7) {
            f6(2 * n);
            System.out.print(n);
        }
    }

    public static void f7(int n) {
        if (n < 7) {
            System.out.print(n);
            f7(2 * n);
        }
        System.out.print(n);
    }

    public static void f8(int n) {
        if (n < 7) {
            System.out.print(n);
            f8(2 * n);
            System.out.print(n);
        }
    }
}
