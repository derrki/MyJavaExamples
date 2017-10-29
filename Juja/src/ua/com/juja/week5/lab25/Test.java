package ua.com.juja.week5.lab25;
/**
*1.Make it work. 2.Make it right. 3.Make it fastpublic
*/

class Test {
    public static void main(String[] args) {

        String testNameIssue = "TestNameIssue";
        int countPages = 100;

        Issue issue = new Issue(testNameIssue, countPages);

        String actualBookPrint = issue.toPrint();
        String expectedBookPrint = "name=TestNameIssue,countPages=100";

        if (actualBookPrint == null)
            throw new AssertionError("Result cannot be null");

        if (actualBookPrint.equals(expectedBookPrint)) {
            System.out.println("OK");
        } else {
            System.out.println("TruText is - " + actualBookPrint + ", return text is - " + expectedBookPrint);
        }
    }
}
