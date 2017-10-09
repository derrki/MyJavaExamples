package ua.com.juja.week2.quiz10;

public class Fibonachi {
    public static int f1(int n){
        int result;
        if (n == 0 || n == 1){
            result = n;
        }else {
            result  = f1(n-2) + f1(n - 1);
        }
        System.out.print(n);
        return result;
    }

    public static int f2(int n){
        System.out.print(n);
        if (n == 0 || n == 1){
            return n;
        }else {
            return f2(n-2) + f2(n - 1);
        }
    }

    public static int f3(int n){
        System.out.print(n);
        if (n == 0 || n == 1){
            return n;
        }else {
            return f3(n-1) + f3(n - 2);
        }
    }

    public static int f4(int n){
        int result;
        if (n == 0 || n == 1){
            result = n;
        }else {
            result  = f4(n-1) + f4(n - 2);
        }
        System.out.print(n);
        return result;
    }
}
