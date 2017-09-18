package ua.com.dagget.types;

public class MainTypes {
    public static void main(String[] args) {


        int a = 2, b = 8;

        BooleanTyp.testSyntax(a, b);
        BooleanTyp.testOr(a, b);

        BooleanTyp.logicsOperation(true, false);

        System.out.println("\nУмовне І &&");
        //метод compare2 виконається
        boolean bool = BooleanTyp.compare1(5) && BooleanTyp.compare2(3);
        System.out.println("bool=" + bool);
        System.out.println("----------------------");
        //метод compare2 не виконається
        bool = BooleanTyp.compare1(9) && BooleanTyp.compare2(9);
        System.out.println("bool=" + bool);
        System.out.println("----------------------");

        System.out.println("\nУмовне або ||");
        bool = BooleanTyp.compare1(9) || BooleanTyp.compare2(3);
        System.out.println("bool=" + bool);
        System.out.println("----------------------");
        bool = BooleanTyp.compare1(9) || BooleanTyp.compare2(3);
        System.out.println("bool=" + bool);

    }
}
