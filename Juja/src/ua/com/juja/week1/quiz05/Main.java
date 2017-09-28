package ua.com.juja.week1.quiz05;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int z = 0;
        int t = 0;

        BitOperationAnd.f(x, y, z, t);  //1011
        BitOperationAnd.f1(x, y, z, t); //1110
        BitOperationAnd.f2(x, y, z, t); //1111
        BitOperationAnd.f3(x, y, z, t); //1011
        BitOperationAnd.f4(x, y, z, t); //1100
        BitOperationAnd.f5(x, y, z, t); //1000
        System.out.println("");
        BitOperationOr.f(x, y, z, t);   //1100
        BitOperationOr.f1(x, y, z, t);   //1010
        BitOperationOr.f2(x, y, z, t);   //1111
        BitOperationOr.f3(x, y, z, t);   //1000
    }
}
