package ua.com.juja.week1.quiz06;

/**
 * Created by derrki on 0:42.
 */
public class CycleFor {

    static void f() {
        for (int k = 0; k < 4; k++) {
            System.out.println(k);
        }
    }

    static void f1() {
        for (int k = 1; k < 4; k++) {
            System.out.println(k);
        }
    }

    static void f2() {
        for (int k = 0; k <= 4; k++) {
            System.out.println(k);
        }
    }

    static void f3() {
        for (int k = 1; k <= 4; k++) {
            System.out.println(k);
        }
    }

    static void f4() {
        for (int k = 4; k > 0; k--) {
            System.out.println(k);
        }
    }

    static void f5() {
        for (int k = 4; k >= 0; k--) {
            System.out.println(k);
        }
    }
}
