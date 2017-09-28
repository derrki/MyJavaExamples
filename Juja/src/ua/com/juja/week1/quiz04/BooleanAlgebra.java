package ua.com.juja.week1.quiz04;


public class BooleanAlgebra {

    static boolean f(String str) {
        return (str == null) & (str.isEmpty());
    }

    static boolean f1(String str) {
        return (str == null) && (str.isEmpty());
    }

    static boolean f2(String str) {
        return (str == null) | (str.isEmpty());
    }

    static boolean f3(String str) {
        return (str == null) || (str.isEmpty());
    }

    static boolean f4(String str) {
        return (str.isEmpty()) & (str == null);
    }

    static boolean f5(String str) {
        return (str.isEmpty()) && (str == null);
    }

    static boolean f6(String str) {
        return (str.isEmpty()) | (str == null);
    }

    static boolean f7(String str) {
        return (str.isEmpty()) || (str == null);
    }

    static boolean f8(String str) {
        return (str != null) & (str.isEmpty());
    }

    static boolean f9(String str) {
        return (str != null) && (str.isEmpty());
    }

    static boolean f10(String str) {
        return (str != null) | (str.isEmpty());
    }

    static boolean f11(String str) {
        return (str != null) || (str.isEmpty());
    }

    static boolean f12(String str) {
        return (str != null) && (str.isEmpty());
    }

}
