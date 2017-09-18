package ua.com.dagget.types;

public class MainTypes {
    public static void main(String[] args) {


        int a = 2, b = 8;


        BooleanTyp booleanTyp = new BooleanTyp();


        BooleanTyp.testSyntax(a, b);
        BooleanTyp.testOr(a, b);

        BooleanTyp.logicsOperation(true, true);
//        System.out.println(booleanTyp.b1);
//        System.out.println(booleanTyp.b2);
//        System.out.println(booleanTyp.b3);
    }
}
