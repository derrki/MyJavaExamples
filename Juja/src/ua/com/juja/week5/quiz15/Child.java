package ua.com.juja.week5.quiz15;

/**
*1.Make it work. 2.Make it right. 3.Make it fast
*/

public class Child extends Parent{

    @Override
    String second() {
        return thrid();
    }

  static  private String thrid() {
        return "Child";
    }
}
