package ua.com.juja.week5.lab25;
/**
*1.Make it work. 2.Make it right. 3.Make it fastpublic
*/

class Journal extends  Issue{

    private String yearJournal;
    private String numberJournal;



    public Journal(String testNameIssue, int countPages, String yearJournal, String numberJournal) {
        super(testNameIssue, countPages);
        this.yearJournal = yearJournal;
        this.numberJournal = numberJournal;
    }

    @Override
   public String toPrint(){
        return "Journal{name=" + testNameIssue + ",countPages=" + countPages + ",year=" + yearJournal + ",number=" + numberJournal + "}";
    }
}
