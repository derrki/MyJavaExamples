package ua.com.juja.week1.lab2;

/**
 * Created by press on 27.09.2017.
 */
public class EggsBread {
    public static String printPurchases(boolean hasEggs, boolean hasBread) {
       /*BODY*/
        String str = "";
        if
                (hasEggs == true && hasBread == true) {
            str = "eggs," + "bread";
            return str;
        }
        else if(hasEggs == false && hasBread == true) {
            str = "bread";
            return str;
        }
        else if(hasEggs == true && hasBread == false) {
            str = "eggs";
            return str;
        }
        else if(hasEggs == false && hasBread == false) {
            return str;
        }
        return str;
    }
}
