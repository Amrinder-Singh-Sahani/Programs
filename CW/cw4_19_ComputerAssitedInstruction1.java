/* Write a program that will help an elementary school
student learn multiplication. Use a SecureRandom object
to produce two positive one or two-digit integers. The program should
then prompt the user with a question, such as
   
    How much is 6 times 77

The student then inputs the answer. Next, the program
checks the student's answer. If the answer is correct
display the message "Very good!" and ask another 
multiplication question. If the answer is wrong display
the message "No, Please try again." and let the student try 
the same question repeatedly until the student finally gets 
it right. A separate method should be used to generate each new
question. This method should be called once when the application
begins execution and each time the user answers the question correctly.
 */

import java.security.SecureRandom;
import java.util.Scanner;

public class cw4_19_ComputerAssitedInstruction1 {

    static int a, b;

    static void generateNumbers() {

        SecureRandom random = new SecureRandom();
        a = random.nextInt(100);
        b = random.nextInt(100);
    }

    static void generateQuestion() {
        Scanner input = new Scanner(System.in);
        int answer;
        generateNumbers();
        System.out.printf("How much is %d times %d\n", a, b);

        do {
            answer = input.nextInt();
            if (answer == (a * b)) {
                System.out.println("Very good");
            } else {
                System.out.println("Wrong, try again");
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