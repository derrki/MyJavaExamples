package ua.com.juja.week5.lab24;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Test {
    public static void main(String[] args) {
        String testNameBook = "TestNameBook";
        String testAuthorBook = "TestBookAuthor";
        int countPages = 100;
        String expectedBookPrint = "Book{name=TestNameBook,countPages=100,author=TestBookAuthor}";

        Issue book = new Book(testNameBook, countPages, testAuthorBook);

        String actualBookPrint = book.toPrint();

        //check
        if (actualBookPrint == null)
            throw new AssertionError("Result cannot be null");

        if (actualBookPrint.equals(expectedBookPrint))
            System.out.print("OK");
        else
            throw new AssertionError("Expected " + expectedBookPrint + " but found " + actualBookPrint);

    }
}
