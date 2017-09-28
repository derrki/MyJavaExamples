package ua.com.juja.week1.quiz04;

/**
 * Created by press on 27.09.2017.
 */
public class Main {
    public static void main(String[] args) {

        boolean x = false;
        boolean y = false;
        boolean z = true;
        String str = null;

        ConditionalOperators.app1();
        //ConditionalOperators.app2();  java.lang.NullPointerException
        ConditionalOperators.app3();
        //ConditionalOperators.app4();  java.lang.NullPointerException


        System.out.println("De Morgan rule (!(x*y) = !x+!y)  " + DeMorganRules.f(x, y) + " = " + DeMorganRules.f1(x, y) + "    x = " + x + "; y = " + y +";");
        System.out.println("De Morgan rule (!(x|y) = !x&!y)  " + DeMorganRules.f2(x, y) + " = " + DeMorganRules.f3(x, y) + "    x = " + x + "; y = " + y +";");
        System.out.println("De Morgan rule (!x&!y = !(x|y))  " + DeMorganRules.f4(x, y) + " = " + DeMorganRules.f5(x, y) + "    x = " + x + "; y = " + y +";");
        System.out.println("De Morgan rule (!x+!y = !(x*y))  " + DeMorganRules.f6(x, y) + " = " + DeMorganRules.f7(x, y) + "    x = " + x + "; y = " + y +";");
        System.out.println("De Morgan rule (!(x+y) = !x*!y)  " + DeMorganRules.f8(x, y) + " = " + DeMorganRules.f9(x, y) + "    x = " + x + "; y = " + y +";");
        System.out.println("De Morgan rule (!x*!y = !(x+y))  " + DeMorganRules.f10(x, y) + " = " + DeMorganRules.f11(x, y) + "    x = " + x + "; y = " + y +";");
        System.out.println("De Morgan rule (!(x*y) = !x+!y))  " + DeMorganRules.f12(x, y) + " = " + DeMorganRules.f13(x, y) + "    x = " + x + "; y = " + y +";");
        System.out.println("De Morgan rule (!x+!y) = !(x*y))  " + DeMorganRules.f14(x, y) + " = " + DeMorganRules.f15(x, y) + "    x = " + x + "; y = " + y +";");
        System.out.println("");
        System.out.println("Distribution (x&y)|z = (x|z)&(y|z)  " + Distribution.f(x, y, z) + " = " + Distribution.f1(x, y, z) + "    x = " + x + "; y = " + y +"; z = " + z + ";");
        System.out.println("Distribution (x|y)&z = (x&z)|(y&z)  " + Distribution.f2(x, y, z) + " = " + Distribution.f3(x, y, z) + "    x = " + x + "; y = " + y +"; z = " + z + ";");
        System.out.println("Distribution (x|y)&z = (x&z)|(y&z)  " + Distribution.f4(x, y, z) + " = " + Distribution.f5(x, y, z) + "    x = " + x + "; y = " + y +"; z = " + z + ";");
        System.out.println("Distribution (x&y)|z = (x|z)&(y|z)  " + Distribution.f6(x, y, z) + " = " + Distribution.f7(x, y, z) + "    x = " + x + "; y = " + y +"; z = " + z + ";");
        System.out.println("");
        //BooleanAlgebra.f(str);    java.lang.NullPointerException
        //BooleanAlgebra.f1(str);   java.lang.NullPointerException
        //BooleanAlgebra.f2(str);   java.lang.NullPointerException
        System.out.println(BooleanAlgebra.f3(str));
        //BooleanAlgebra.f4(str);   java.lang.NullPointerException
        //BooleanAlgebra.f5(str);   java.lang.NullPointerException
        //BooleanAlgebra.f6(str);   java.lang.NullPointerException
        //BooleanAlgebra.f7(str);   java.lang.NullPointerException
        //BooleanAlgebra.f8(str);   java.lang.NullPointerException
        System.out.println(BooleanAlgebra.f9(str));
        //BooleanAlgebra.f10(str);   java.lang.NullPointerException
        //BooleanAlgebra.f11(str);   java.lang.NullPointerException
        System.out.println(BooleanAlgebra.f12(str));


    }
}
