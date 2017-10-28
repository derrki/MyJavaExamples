package ua.com.juja.week5.lab24;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class Issue {

    protected String name;
    protected int countPages;

    public Issue(String name, int countPages) {
        this.name = name;
        this.countPages = countPages;
    }

    public String toPrint() {
        return  "name=" + name +
                ",countPages=" + countPages;
    }
}
