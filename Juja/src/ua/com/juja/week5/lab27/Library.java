package ua.com.juja.week5.lab27;


public class Library {


    public String getIssueWithCountPagesMoreN(Issue[] catalog, int barrierCountPages) {

        Issue issue;
        String result = "";

        if(catalog.length == 0){
            return result;
        } else {
            for (int i = 0; i<catalog.length; i++)
            {
                issue = catalog[i];
                if(issue.getCountPages() > barrierCountPages)
                     result += catalog[i].toPrint();
            }
        }
        return result;   /*BODY*/
    }
}
