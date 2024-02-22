/* Exercise 19-21 developed a computer assisted instruction
program to help teach an elementary school student multiplication.
Modify the program to allow the user to enter a different level.
At a difficulty level of 1, the program should use only single digit
numbers in the problems; at a difficulty level of 2, numbers as 
large as two digits, and so on.
 */

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class cw4_22_ComputerAssitedInstructions4 {

    static int a, b;

    static void generateNumbers(int difficulty) {

        SecureRandom random = new SecureRandom();

        if (difficulty == 1) {
            a = random.nextInt(1, 10);
            b = random.nextInt(1, 10);
        } else if (difficulty == 2) {
            a = random.nextInt(10, 101);
            b = random.nextInt(10, 101);
        } else {
            a = random.nextInt(100, 1000);
            b = random.nextInt(100, 1000);
        }

    }

    static int generateQuestion(int difficulty) {
        Scanner input = new Scanner(System.in);
        int answer, count = 0;

        generateNumbers(difficulty);

        System.out.printf("How much is %d times %d\n", a, b);
        Random random = new Random();
        int correct = a * b;
        do {
            answer = input.nextInt();

            int a = random.nextInt(1, 5);
            if (answer == correct) {
                count += 1;

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
                count += 1;

                switch (a) {
                    case 1: {
                        System.out.println("No, Please try again");
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
        } while (answer != correct);

        return count;
    }

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.println("Choose difficulty: 1    2   3:");
        int difficulty = input.nextInt();
        String choice;
        int count = 0, i = 0;
        do {

            if (generateQuestion(difficulty) == 1) {
                count += 1;
            }

            System.out.println(count);
            i += 1;
            System.out.println(i);
        } while (i < 10);

        if (count < 7) {
            System.out.printf("Your score is %d \nPlease ask your teacher for extra help", count);
        } else {
            System.out.printf("Your score is %d \nCongratulations, You are ready to go to the next level.", count);
        }

    }
}