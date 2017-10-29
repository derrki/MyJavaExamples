package ua.com.dagget.static_nonStaticFields;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Cat {
    static int counterCat;
    String name;
    String color;

    public Cat() {
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
        counterCat++;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}' + " CounterCat = " + counterCat;
    }
}
