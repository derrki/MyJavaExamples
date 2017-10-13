package ua.com.dagget.javaLangPackageClasses.objectClass;

import java.util.GregorianCalendar;

public class Test {
    public static void main(String[] args) {

        //обєкт що будемо копіювати
        GregorianCalendar calendar = new GregorianCalendar();

        //клонуємо обєкт
        GregorianCalendar calendarClone = (GregorianCalendar) calendar.clone();

        //результат два однакові обєкти
        System.out.println(calendar.getTime());
        System.out.println(calendarClone.getTime());
        System.out.println(calendar.equals(calendarClone));
        System.out.println(calendar == calendarClone);
        System.out.println(calendar.toString());
        System.out.println(calendarClone.toString());
    }
}
