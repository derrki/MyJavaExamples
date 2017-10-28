package ua.com.juja.week5.lab24;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Book extends Issue{

   private String authorBook;

    public Book(String name, int countPages, String authorBook) {
        super(name, countPages);
        this.authorBook = authorBook;
    }

    @Override
    public String toPrint() {

        return null;
    }
}
