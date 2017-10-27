package ua.com.juja.week5.quiz14;

/**
*1.Make it work. 2.Make it right. 3.Make it fast
*/

public class StaticTestApp {
    public static int a;
    public int b;
    public int c;

    public StaticTestApp(){
        this.b = a++;
    }

    public static int get(){
        return a++ + a++;
    }
}
