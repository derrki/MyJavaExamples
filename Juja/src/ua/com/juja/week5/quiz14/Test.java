package ua.com.juja.week5.quiz14;
/**
*1.Make it work. 2.Make it right. 3.Make it fast
*/

public class Test {
    public static void main(String[] args) {

        StaticFields staticFields1 = new StaticFields();
        StaticFields staticFields2 = new StaticFields();
        StaticFields staticFields3 = new StaticFields();

        System.out.println("Id " + staticFields1.getClass().getSimpleName() + " = " + staticFields1.id);
        System.out.println("Id " + staticFields1.getClass().getSimpleName() + " = " + StaticFields.counter);
        System.out.println("Id " + staticFields2.getClass().getSimpleName() + " = " + staticFields2.id);
        System.out.println("Id " + staticFields2.getClass().getSimpleName() + " = " + StaticFields.counter);
        System.out.println("Id " + staticFields3.getClass().getSimpleName() + " = " + staticFields3.id);
        System.out.println("Id " + staticFields3.getClass().getSimpleName() + " = " + StaticFields.counter);

        System.out.println("---------------------------------------");

        StaticTestApp staticTestApp1 = new StaticTestApp();
        System.out.println(StaticTestApp.a);
        StaticTestApp staticTestApp2 = new StaticTestApp();
        System.out.println(staticTestApp2.b);
        StaticTestApp staticTestApp3 = new StaticTestApp();
        System.out.println(staticTestApp3.c);

        System.out.println("---------------------------------------");

        System.out.println(StaticTestApp.get());
        System.out.println(StaticTestApp.get());
        System.out.println(StaticTestApp.get());
    }
}
