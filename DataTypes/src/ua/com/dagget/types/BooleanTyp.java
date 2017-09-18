package ua.com.dagget.types;

/*
  Java boolean Example
  This Java Example shows how to declare and use Java primitive boolean variable
  inside a java class.
*/
public class BooleanTyp {
    /*
     * boolean is simple Java type which can have only of two values; true or false. - boolean - це простий тип Java, який може мати лише два значення; Правда чи неправда.
     * All rational expressions retrun this type of value. - Всі раціональні вирази повертають цей тип значення.
     *
     * Declare boolean varibale as below - Оголосіть булеву змінну, як показано нижче
     *
     * boolean <variable name> = <default value>; - <ім'я змінної> = <значення за замовчуванням>;
     *
     * here assigning default value is optional. - тут призначення значення за замовчуванням є необов'язковим.
     */



//    boolean b1 = true;
//    boolean b2 = false;
//    boolean b3 = 2 > 3;

    static void testSyntax (int a, int b){
        //можна написати ((a<10) && (b > 10)), але логічні оператори мають
        //менший пріоритет порівняно з операторами порівняння. Крім унарного !
        //все залежить від зручності читання
        if (a < 10 && b > 10){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    static void testOr(int a, int b){
        if (a < 5 || b > 5){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    static void logicsOperation (boolean a, boolean b){

        System.out.println("a = "+a+"   b = "+b);
        System.out.println("a && b = " + (a&&b));
        System.out.println("!a && b = " + (!a&&b));
        System.out.println("a && !b = " + (a&&!b));
        System.out.println("!a && !b = " + (!a&&!b));

        System.out.println("a || b = " + (a||b));
        System.out.println("!a || b = " + (!a||b));
        System.out.println("a || !b = " + (a||!b));
        System.out.println("!a || !b = " + (!a||!b));

        System.out.println("a & b = " + (a&b));
        System.out.println("!a & b = " + (!a&b));
        System.out.println("a & !b = " + (a&b));
        System.out.println("!a & !b = " + (a&b));


    }

}
