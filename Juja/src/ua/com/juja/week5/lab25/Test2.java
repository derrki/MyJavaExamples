package ua.com.juja.week5.lab25;

/**
*1.Make it work. 2.Make it right. 3.Make it fast
*/

class Test2 {

    public static void main(String[] args) {
        String testNameJournal = "TestNameJournal";
        String testYearJournal = "TestYearJournal";
        String testNumberJournal = "TestNumberJournal";
        int countPages = 100;

        String expectedJournalPrint = "Journal{name=TestNameJournal,countPages=100,year=TestYearJournal,number=TestNumberJournal}";

        Journal journal = new Journal(testNameJournal, countPages, testYearJournal, testNumberJournal);

        String actualJournalPrint = journal.toPrint();

        //check
        if (actualJournalPrint == null)
            throw new AssertionError("Result cannot be null");

        if (actualJournalPrint.equals(expectedJournalPrint))
            System.out.print("OK");
        else
            throw new AssertionError("Expected to be printed <" + expectedJournalPrint + "> but found <" + actualJournalPrint + ">");

    }
}
