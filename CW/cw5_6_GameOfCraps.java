/* Write an application that runs 1,000,000 games
of craps and answers the following questions:
a) How many games are won on the first roll,
second roll, ....., twentieth roll and after the
twentieth roll?
b) How many games are lost on the first roll, second
roll,..., twentieth roll and after the twentieth roll?
c) What are the chances of winning at craps?
d) What is the average length of a game of craps?
e) Do the chances of winning improve with the length of 
the game?
 */

import java.security.SecureRandom;

public class cw5_6_GameOfCraps {

    private static final SecureRandom randomNumbers = new SecureRandom();

    private enum Status {
        CONTINUE, WON, LOST
    };

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die2;
        // System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

        return sum;
    }

    public static void main(String args[]) {

        int win[] = new int[22], lost[] = new int[22];
        for (int i = 0; i < 10000000; i++) {
            int myPoint = 0, count = 1;
            Status gameStatus = Status.CONTINUE;
            int sumOfDice = rollDice();

            switch (sumOfDice) {
                case SEVEN:
                case YO_LEVEN: {
                    gameStatus = Status.WON;
                    ++win[1];
                    break;

                }

                case SNAKE_EYES:
                case TREY:
                case BOX_CARS: {
                    gameStatus = Status.LOST;
                    ++lost[1];
                    break;
                }
                default: {
                    gameStatus = Status.CONTINUE;
                    myPoint = sumOfDice;
                    // System.out.println("Player point is: " + sumOfDice);
                }
            }

            while (gameStatus == Status.CONTINUE) {
                sumOfDice = rollDice();
                count += 1;
                if (sumOfDice == myPoint) {
                    gameStatus = Status.WON;
                }

                else {
                    if (sumOfDice == SEVEN) {
                        gameStatus = Status.LOST;
                    }
                }
            }

            if (gameStatus == Status.WON) {
                // System.out.println("Player wins!");
                if (count > 20) {
                    ++win[21];
                } else {
                    ++win[count];
                }

            } else {
                // System.out.println("Player loses");
                if (count > 20) {
                    ++lost[21];
                } else {
                    ++lost[count];
                }
            }
        }

        for (int i = 1; i < win.length; i++) {
            System.out.printf("Win on turn %d: %d\n", i, win[i]);
        }
        for (int i = 1; i < win.length; i++) {
            System.out.printf("Lost on turn %d: %d\n", i, lost[i]);
        }
    }
}