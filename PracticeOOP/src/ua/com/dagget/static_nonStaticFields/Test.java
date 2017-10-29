package ua.com.dagget.static_nonStaticFields;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Test {

    public static void main(String[] args) {
        Cat cat = new Cat("vasa", "red");
        Cat cat1 = new Cat("vasa", "red");
        Cat cat2 = new Cat("vasa", "red");
        Cat cat3 = new Cat("vasa", "red");

        System.out.println(cat3);
    }

}
