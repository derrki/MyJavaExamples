package ua.com.dagget.Game;

public class Player {
    int number = 0;
    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("Думаю це число " + number);
    }
}
