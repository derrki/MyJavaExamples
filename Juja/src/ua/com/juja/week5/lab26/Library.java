package ua.com.juja.week5.lab26;



public class Library {

    public String printCatalog(Issue[] catalog) {

        String result = "";

        if(catalog.length == 0){
            return result;
        } else {
            for (int i = 0; i<catalog.length; i++)
            {
                result += catalog[i].toPrint();
            }
        }
        return result;   /*BODY*/
    }
}
