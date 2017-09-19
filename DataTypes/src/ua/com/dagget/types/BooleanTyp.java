package ua.com.dagget.types;

import ua.com.dagget.helpClasses.PrintMetod;

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


    PrintMetod printMethod = new PrintMetod();

//    boolean b1 = true;
//    boolean b2 = false;
//    boolean b3 = 2 > 3;

    void testSyntax (int a, int b){
        //можна написати ((a<10) && (b > 10)), але логічні оператори мають
        //менший пріоритет порівняно з операторами порівняння. Крім унарного !
        //все залежить від зручності читання
        if (a < 10 && b > 10){
            printMethod.println("true");
        }
        else {
            printMethod.println("false");
        }
    }

    void testOr(int a, int b){
        if (a < 5 || b > 5){
            printMethod.println("true");
        } else {
            printMethod.println("false");
        }
    }

    void logicsOperation (boolean a, boolean b){

        printMethod.println("a = "+a+"   b = "+b);
        printMethod.println("a && b = " + (a&&b));
        printMethod.println("!a && b = " + (!a&&b));
        printMethod.println("a && !b = " + (a&&!b));
        printMethod.println("!a && !b = " + (!a&&!b));

        printMethod.println("a || b = " + (a||b));
        printMethod.println("!a || b = " + (!a||b));
        printMethod.println("a || !b = " + (a||!b));
        printMethod.println("!a || !b = " + (!a||!b));

        printMethod.println("a & b = " + (a&b));
        printMethod.println("!a & b = " + (!a&b));
        printMethod.println("a & !b = " + (a&!b));
        printMethod.println("!a & !b = " + (!a&!b));

        printMethod.println("a | b = " + (a|b));
        printMethod.println("!a | b = " + (!a|b));
        printMethod.println("a | !b = " + (a|!b));
        printMethod.println("!a | !b = " + (!a|!b));

    }

    boolean compare1(int value){

        printMethod.print("Compare ("+ value + ")");
        printMethod.println("Результат = " + (value < 7) + " тому що " + value + " < 7 це "+(value < 7));
       return value < 7;
    }

    boolean compare2(int value){

        printMethod.print("Compare ("+ value + ")");
        printMethod.println("Результат = " + (value > 7) + " тому що " + value + " > 7 це "+(value > 7));
        return value > 7;
    }

    static void testCompare(){
        //TODO
    }
}
