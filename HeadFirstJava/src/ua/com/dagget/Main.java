package ua.com.dagget;


public class Main {
    public static void main(String[] args) {
        String bootle = " бутилок";
        int numberBootle = 10;
        while (numberBootle > 0) {

            System.out.println(numberBootle + bootle + " пива на столі!");
            System.out.println("візьми одну,");
            System.out.println("пусти по кругу");
            numberBootle--;

            if (numberBootle > 1) {
                System.out.println(numberBootle + bootle + " пива на столі!");
                System.out.println("");
            } else if (numberBootle == 1) {
                bootle = " бутилка";
            } else if (numberBootle == 0) {
                System.out.println("немає пива на столі");
            }
        }
    }
}
