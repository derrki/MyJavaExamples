package ua.com.juja.week1.lab4;

public class DayWeek {

    public static String getDayOfTheWeek(int dayNum){

        String dayString;

        switch (dayNum) {
            case 1:  dayString = "Monday";
                break;
            case 2:  dayString = "Tuesday";
                break;
            case 3:  dayString = "Wednesday";
                break;
            case 4:  dayString = "Thursday";
                break;
            case 5:  dayString = "Friday";
                break;
            case 6:  dayString = "Saturday";
                break;
            case 7:  dayString = "Sunday";
                break;
            default: dayString = "";
                break;
        }
        System.out.println(dayString);
        return dayString;
    }
}

