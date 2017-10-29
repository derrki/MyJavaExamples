package ua.com.juja.week5.lab25;

/**
*1.Make it work. 2.Make it right. 3.Make it fast
*/

class Issue {

    protected String testNameIssue;
    protected int countPages;

    public Issue (String testNameIssue, int countPages){
        this.testNameIssue = testNameIssue;
        this.countPages = countPages;
    }

    String toPrint(){
       
       return "name=" + testNameIssue + ",countPages=" + countPages;
   }
}
