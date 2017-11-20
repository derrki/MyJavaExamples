package ua.com.dagget.Game;

public class GuesGame {
    Player player1;
    Player player2;
    Player player3;

    public void startGame(){
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();

        int guessPlayer1 = 0;
        int guessPlayer2 = 0;
        int guessPlayer3 = 0;

        boolean player1IsRight = false;
        boolean player2IsRight = false;
        boolean player3IsRight = false;

        int targetNumber = (int) (Math.random()*10);
        System.out.println("Я загадав число від 0 до 9...");

        while (true) {
            System.out.println("Число, котре потрібно вгвдати, - " + targetNumber);

            player1.guess();
            player2.guess();
            player3.guess();

            guessPlayer1 = player1.number;
            System.out.println("Перший гравець думає що це - " + guessPlayer1);

            guessPlayer2 = player2.number;
            System.out.println("Другий гравець думає що це - " + guessPlayer2);

            guessPlayer3 = player3.number;
            System.out.println("Третій гравець думає що це - " + guessPlayer3);

            if (guessPlayer1 == targetNumber){
                player1IsRight = true;
            }

            if (guessPlayer2 == targetNumber){
                player2IsRight = true;
            }

            if (guessPlayer3 == targetNumber) {
                player3IsRight = true;
            }

                if (player1IsRight || player2IsRight || player1IsRight){
                    System.out.println("Ура, є переможець");
                    System.out.println("Перший гравець сказав - " + player1IsRight);
                    System.out.println("Другий гравець сказав - " + player2IsRight);
                    System.out.println("Третій гравець сказав - " + player3IsRight);
                    System.out.println("Кінець гри !");
                    break;
                } else {
                    System.out.println("Гравці повинні спробувати ще раз.");
                }
        }
    }
}
