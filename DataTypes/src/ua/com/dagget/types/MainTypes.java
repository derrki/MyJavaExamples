package ua.com.dagget.types;

import ua.com.dagget.helpClasses.PrintMetod;

public class MainTypes {
    public static void main(String[] args) {

        int a = 2, b = 8;

        PrintMetod printMetod = new PrintMetod();
        BooleanTyp booleanTyp = new BooleanTyp();

        booleanTyp.testSyntax(a, b);
        booleanTyp.testOr(a, b);

        booleanTyp.logicsOperation(true, false);

        printMetod.println("\nУмовне І &&");
        //метод compare2 виконається
        boolean bool = booleanTyp.compare1(5) && booleanTyp.compare2(3);
        printMetod.println("bool=" + bool);
        printMetod.println("----------------------");
        //метод compare2 не виконається
        bool = booleanTyp.compare1(9) && booleanTyp.compare2(9);
        printMetod.println("bool=" + bool);
        printMetod.println("----------------------");

        printMetod.println("\nУмовне або ||");
        bool = booleanTyp.compare1(9) || booleanTyp.compare2(3);
        printMetod.println("bool=" + bool);
        printMetod.println("----------------------");
        bool = booleanTyp.compare1(9) || booleanTyp.compare2(3);
        printMetod.println("bool=" + bool);

    }
}
