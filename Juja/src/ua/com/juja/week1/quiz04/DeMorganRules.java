package ua.com.juja.week1.quiz04;

class DeMorganRules {

    //(!(x*y) = !x+!y)

   static boolean f (boolean x, boolean y){
        return !(x & y);
    }

    static boolean f1(boolean x, boolean y) {
       return !x | !y;
    }

    //(!(x+y) = !x*!y)

    static boolean f2 (boolean x, boolean y){
        return !(x | y);
    }

    static boolean f3(boolean x, boolean y) {
        return !x & !y;
    }

    //(!x*!y = !(x+y))

    static boolean f4 (boolean x, boolean y){
        return !x & !y;
    }

    static boolean f5(boolean x, boolean y) {
        return !(x | y);
    }

    //(!x+!y = !(x*y))

    static boolean f6 (boolean x, boolean y){
        return !x | !y;
    }

    static boolean f7(boolean x, boolean y) {
        return !(x & y);
    }

    //(!(x+y) = !x*!y)

    static boolean f8 (boolean x, boolean y){
        return !(!x | y);
    }

    static boolean f9(boolean x, boolean y) {
        return x & !y;
    }

    //(!x*!y = !(x+y))

    static boolean f10 (boolean x, boolean y){
        return x & !y;
    }

    static boolean f11(boolean x, boolean y) {
        return !(!x | y);
    }

    //(!(x*y) = !x+!y))

    static boolean f12 (boolean x, boolean y){
        return !(!x & y);
    }

    static boolean f13(boolean x, boolean y) {
        return x | !y;
    }

    //(!x|!y) = !(x&y))

    static boolean f14 (boolean x, boolean y){
        return x | !y;
    }

    static boolean f15(boolean x, boolean y) {
        return !(!x & y);
    }
}
