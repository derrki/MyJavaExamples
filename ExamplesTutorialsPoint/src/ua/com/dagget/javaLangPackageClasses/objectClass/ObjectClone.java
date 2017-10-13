package ua.com.dagget.javaLangPackageClasses.objectClass;

import java.util.GregorianCalendar;

public class ObjectClone {

    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();

        GregorianCalendar calendarClone = (GregorianCalendar) calendar.clone();
        System.out.println(calendar.getTime());
        System.out.println(calendarClone.getTime());
    }
}
