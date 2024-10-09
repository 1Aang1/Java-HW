import java.util.Random;


public class Application {
    private InputDevice inputDevice;

    public Application(InputDevice inputDevice) {
        this.inputDevice = inputDevice;
    }

    public void run() {
        System.out.println("Application started");
        System.out.println("Today’s lucky numbers are: " + this.inputDevice.nextInt() + ", " + inputDevice.nextInt());
        playGame();
    }
    public void playGame() {
        int player1Wins = 0, player2Wins = 0;

        for (int round = 1; round <= 5; round++) {
            int num1 = this.inputDevice.nextInt();
            int num2 = this.inputDevice.nextInt();

            System.out.println("Round " + round + ": Player 1 chose " + num1 + ", Player 2 chose " + num2);

            if (num1 == num2) {
                player1Wins += 2;
                player2Wins += 2;
                System.out.println("It's a draw! Both players get 2 points.");
            } else {
                int higherNum = Math.max(num1, num2);
                int smallerNum = Math.min(num1, num2);

                if (higherNum % smallerNum == 0 && smallerNum >= 10) {
                    if (num1 == smallerNum) player1Wins++;
                    else player2Wins++;
                    System.out.println("The smaller number wins this round!");
                } else {
                    if (num1 == higherNum) player1Wins++;
                    else player2Wins++;
                    System.out.println("The higher number wins this round!");
                }
            }

            System.out.println("Score after round " + round + ": Player 1 - " + player1Wins + ", Player 2 - " + player2Wins);
        }

        if (player1Wins > player2Wins) System.out.println("Player 1 wins the game!");
        else if (player1Wins < player2Wins) System.out.println("Player 2 wins the game!");
        else System.out.println("The game is a draw!");
    }}