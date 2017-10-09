package ua.com.juja.week2.quiz11;

public class Recursion {

    public static int f10(int a, int b) {
        return (b == 1) ? a : a * f10(a, b - 1);
    }
}
