package ua.com.juja.week4.OOPWebinar;
/*
*1.Make it work. 2.Make it right. 3.Make it fast
*/
public class NumberGenerator {
    private int current;

    public NumberGenerator() {
        current = 1;
    }

    public int getNumber(){
        int result = current;
        current++;
        return result;
    }
}
