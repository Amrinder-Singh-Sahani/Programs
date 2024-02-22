/* Write an application that plays "guess the number"
as follows:
Your program chooses the number to be guessed by selecting
a random integer in the range 1 to 1000. The application 
displays the prompt 'guess a number between 1 and 1000'. 
The player inputs a first guess. If the player's guess is
incorrect, your program should display 'Too high. Try again'.
or 'Too low. Try again'. to help the player "zero in" on the 
correct answer. The program should prompt the user for the 
next guess. When the user enters the correct answer, display 
'Congratulations. You guessed the number!', and allow the user
to choose whether to play again.
 */

import java.util.Random;
import java.util.Scanner;

public class cw4_15_GuessTheNumber {

    public static void main(String args[]) {

        Random a = new Random();
        int ran = a.nextInt(1001);

        Scanner b = new Scanner(System.in);

        int input, choice, count = 0;

        do {
            System.out.println("1)Continue to play\n2) Exit");
            choice = b.nextInt();
            if (choice == 1) {

                do {
                    System.out.println("Guess the number: ");
                    input = b.nextInt();
                    if (input < ran) {
                        System.out.println("Too low");
                        count++;
                    } else if (input > ran) {
                        System.out.println("Too high");
                        count++;
                    } else {
                        System.out.printf("Congratulations, You guessed the correct number in %d counts\n", count);

                    }
                } while (input != ran);
            } else if (choice == 2) {
                break;
            }
        } while (choice != 2);

    }
}