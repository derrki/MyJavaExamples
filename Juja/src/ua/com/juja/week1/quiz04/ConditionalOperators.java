package ua.com.juja.week1.quiz04;

class ConditionalOperators {

    static void app1() {

        String s = null;

        if (s != null && !s.isEmpty()) {
            System.out.println("not empty");
        } else {
            System.out.println("empty");
        }
    }

    static void app2() {

        String s = null;

        if (s != null & !s.isEmpty()) {
            System.out.println("not empty");
        } else {
            System.out.println("empty");
        }
    }

    static void app3() {

        String s = null;

        if (s == null || !s.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println("not empty");
        }
    }

    static void app4() {

        String s = null;

        if (s == null | !s.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println("not empty");
        }
    }
}
