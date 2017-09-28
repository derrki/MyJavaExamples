package ua.com.juja.week1.quiz05;

public class BitOperationAnd {

    static void f (int x, int y, int z, int t){
        if ((x++ != 0 && y++ != 0) & (z++ != 0 & t++ != 0)){
            /*NOP*/
        }
        System.out.println(x + "" + y + "" + z + "" + t);
    }

    static void f1 (int x, int y, int z, int t){
        if ((x++ != 0 & y++ != 0) & (z++ != 0 && t++ != 0)){
            /*NOP*/
        }
        System.out.println(x + "" + y + "" + z + "" + t);
    }

    static void f2 (int x, int y, int z, int t){
        if ((x++ != 0 & y++ != 0) & (z++ != 0 & t++ != 0)){
            /*NOP*/
        }
        System.out.println(x + "" + y + "" + z + "" + t);
    }

    static void f3 (int x, int y, int z, int t){
        if ((x++ != 0 && y++ != 0) & (z++ != 0 && t++ != 0)){
            /*NOP*/
        }
        System.out.println(x + "" + y + "" + z + "" + t);
    }

    static void f4 (int x, int y, int z, int t){
        if ((x++ != 0 & y++ != 0) && (z++ != 0 & t++ != 0)){
            /*NOP*/
        }
        System.out.println(x + "" + y + "" + z + "" + t);
    }

    static void f5 (int x, int y, int z, int t){
        if (((x++ != 0) && (y++ != 0)) && ((z++ != 0) && (t++ != 0))){
            /*NOP*/
        }
        System.out.println(x + "" + y + "" + z + "" + t);
    }
}
