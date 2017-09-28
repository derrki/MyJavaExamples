package ua.com.juja.week1.quiz06;

public class CycleForPlusFor {

    static void f () {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i);
            }
        }
    }

    static void f1 () {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
        }
    }

    static void f2 () {
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j >=i; j--) {
                System.out.print(i);
            }
        }
    }

    static void f3 () {
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j >=i; j--) {
                System.out.print(i);
            }
        }
    }

    static void f4 () {
        for (int i = 0; i < 2; i++) {
            for (int j = i; j >=0; j--) {
                System.out.print(i);
            }
        }
    }

    static void f5 () {
        for (int i = 0; i < 2; i++) {
            for (int j = i; j >=0; j--) {
                System.out.print(j);
            }
        }
    }

    static void f6 () {
        for (int i = 0; i < 2; i++) {
            for (int j = i; j < 2; j++) {
                System.out.print(i);
            }
        }
    }

    static void f7 () {
        for (int i = 0; i < 2; i++) {
            for (int j = i; j < 2; j++) {
                System.out.print(j);
            }
        }
    }

    static void f8 () {
        for (int i = 1; i >=0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i);
            }
        }
    }

    static void f9 () {
        for (int i = 1; i >=0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
        }
    }

    static void f10 () {
        for (int i = 1; i >= 0; i--) {
            for (int j = 1; j >= i; j--) {
                System.out.print(i);
            }
        }
    }

    static void f11 () {
        for (int i = 1; i >= 0; i--) {
            for (int j = 1; j >= i; j--) {
                System.out.print(j);
            }
        }
    }

    static void f12 () {
        for (int i = 1; i >=0; i--) {
            for (int j = i; j >=0; j--) {
                System.out.print(i);
            }
        }
    }

    static void f13 () {
        for (int i = 1; i >=0; i--) {
            for (int j = i; j >=0; j--) {
                System.out.print(j);
            }
        }
    }

    static void f14 () {
        for (int i = 1; i >=0; i--) {
            for (int j = i; j < 2; j++) {
                System.out.print(i);
            }
        }
    }

    static void f15 () {
        for (int i = 1; i >=0; i--) {
            for (int j = i; j < 2; j++) {
                System.out.print(j);
            }
        }
    }
}
