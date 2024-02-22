/* Write an application that simulates coin tossing.
Let the program toss a coin each time the user chooses the
"Toss Coin" menu option. Count the number of times each side 
of the coin appears. Display the results. The program should 
call a separate method 'flip' that takes no arguments and
returns a value from a coin enum (HEADS and TAILS).
 */

import java.util.Random;
import java.util.Scanner;

public class cw4_14_CoinTossing {

    static int countH = 0, countT = 0;

    public enum coin {
        HEADS, TAILS
    };

    static void flip() {
        coin status;
        Random flipper = new Random();
        int a = flipper.nextInt(2);

        if (a == 0) {
            status = coin.HEADS;
            countH = countH + 1;
            System.out.println(status);
        } else {
            status = coin.TAILS;
            countT = countT + 1;
            System.out.println(status);
        }

    }

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int a;

        do {
            System.out.println("1) Toss Coin\n2) Exit");
            a = input.nextInt();
            if (a == 2) {
                break;
            }
            flip();

        } while (a != 2);

        System.out.println("Head appeared " + countH + " times.");
        System.out.println("Tails appeared " + countT + " times.");

    }
}