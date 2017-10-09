package ua.com.juja.week2.quiz11;

public class RecursionAdvancedTwo {
    public static boolean f0(int k){
        System.out.print("f0");
        return k % 3 == 0 || f1 (k-1);
    }

    public static boolean f1 (int k){
        System.out.print("f1");
        return k % 3 == 1 || f2 (k - 1);
    }

    public static boolean f2 (int k){
        System.out.print("f2");
        return k % 3 == 2 || f0 (k - 1);
    }
}
