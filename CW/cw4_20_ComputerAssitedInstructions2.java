/* One problem in CAI environment is student faitgue.
This can be reduced by varying the computer's responses
to hold the student's attention. Modify the program of 
Exercise cw4_19 so that various comments are displayed
for each answer as follows:
    Possible responses to a correct answer:
        Very Good
        Excellent
        Nice Work
        Keep up the good work

    Possible responses to an incorrect answer:
        No, Please try again
        Wrong, Try once more
        Don't give up
        No, Keep trying

Use random number generation to choose a number from 
1 to 4 that will be used to select one of the four 
appropriate responses to each correct or incorrect 
answer. Use a switch statement to issue the responses.
 */

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class cw4_20_ComputerAssitedInstructions2 {

    static int a, b;

    static void generateNumbers() {

        SecureRandom random = new SecureRandom();
        a = random.nextInt(101);
        b = random.nextInt(101);
    }

    static void generateQuestion() {
        Scanner input = new Scanner(System.in);
        int answer;
        generateNumbers();
        System.out.printf("How much is %d times %d\n", a, b);
        Random random = new Random();

        do {
            answer = input.nextInt();
            int a = random.nextInt(1, 5);
            if (answer == (a * b)) {
                switch (a) {
                    case 1: {
                        System.out.println("Very Good");
                        break;
                    }
                    case 2: {
                        System.out.println("Excellent");
                        break;
                    }
                    case 3: {
                        System.out.println("Nice Work");
                        break;
                    }
                    case 4: {
                        System.out.println("Keep up the good work");
                        break;
                    }
                }
            } else {
                switch (a) {
                    case 1: {
                        System.out.println("No, Please try");
                        break;
                    }
                    case 2: {
                        System.out.println("Wrong, Try once more");
                        break;
                    }
                    case 3: {
                        System.out.println("Don't give up");
                        break;
                    }
                    case 4: {
                        System.out.println("No, keep trying");
                        break;
                    }
                }
            }
        } while (answer != (a * b));
    }

    public static void main(String args[]) {

        String choice;
        do {
            System.out.println("Do you want to practice multiplication?\nYes or No");
            Scanner input = new Scanner(System.in);
            choice = input.next();
            if (choice.equalsIgnoreCase("No")) {
                break;
            } else {
                generateQuestion();
            }

        } while (choice != "No");

    }
}