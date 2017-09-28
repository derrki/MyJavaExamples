package ua.com.juja.week1.quiz04;

/**
 * Created by press on 28.09.2017.
 */
public class Distribution {

    //(x & y) | z = (x | z) & (y | z)

    static boolean f(boolean x, boolean y, boolean z) {
        return (x & y) | z;
    }

    static boolean f1(boolean x, boolean y, boolean z) {
        return (x | z) & (y | z);
    }

    //(x | y) & z = (x & z) | (y & z)

    static boolean f2(boolean x, boolean y, boolean z) {
        return (x | y) & z;
    }

    static boolean f3(boolean x, boolean y, boolean z) {
        return (x & z) | (y & z);
    }

    //(x | y) & z = (x & z) | (y & z)

    static boolean f4(boolean x, boolean y, boolean z) {
        return (x & z) | (y & z);
    }

    static boolean f5(boolean x, boolean y, boolean z) {
        return (x | y) & z;
    }

    //(x & y) | z = (x | z) & (y | z)

    static boolean f6(boolean x, boolean y, boolean z) {
        return (x | z) & (y | z);
    }

    static boolean f7(boolean x, boolean y, boolean z) {
        return (x & y) | z;
    }

}
