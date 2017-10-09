package ua.com.juja.week2.quiz11;

public class RecursionAdvanced {
    public static boolean f0(int k){
        System.out.print("f0");
        return k == 0 ? true : f1 (k-1);
    }

    public static boolean f1 (int k){
        System.out.print("f1");
        return k == 0 ? false : f0(k - 1);
    }
}
