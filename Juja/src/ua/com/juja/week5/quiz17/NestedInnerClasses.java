package ua.com.juja.week5.quiz17;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class NestedInnerClasses {

    public static void main(String[] args) {
        f(new Runnable() {
            public void run() {
                System.out.println(k);
            }
        });
    }

    public static void f(Runnable ref) {
        final int k = 1;
        ref.run();
    }

    static int k = 0;
}
