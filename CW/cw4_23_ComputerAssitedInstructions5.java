/* Modify the program of exercise cw4_22 to allow the 
user to pick a type of arithmetic problem to study.
An option of 1 means addition problems only, 2 means subtraction
problems only, 3 means multiplication problems only, 4 means
division problems only and 5 means a random mixture of all
these types.
 */

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class cw4_23_ComputerAssitedInstructions5 {
    static int a, b;

    static void generateNumbers(int difficulty) {/*
                                                  * This function generates random number based on the
                                                  * difficulty chosen by the user. This function is called in function
                                                  * generateQuestion
                                                  */

        SecureRandom random = new SecureRandom();

        if (difficulty == 1) {
            a = random.nextInt(1, 10);
            b = random.nextInt(1, 10);
        } else if (difficulty == 2) {
            a = random.nextInt(10, 101);
            b = random.nextInt(10, 101);
        } else if (difficulty == 3) {
            a = random.nextInt(100, 1000);
            b = random.nextInt(100, 1000);
        } else {
            a = random.nextInt(1001, 10000);
            b = random.nextInt(1001, 10000);
        }

    }

    static String generatePositivePrompts(int receivePrompt) {
        switch (receivePrompt) {
            case 1: {
                return "Very Good";

            }
            case 2: {
                return "Excellent";

            }
            case 3: {
                return "Nice Work";

            }
            case 4: {
                return "Keep up the good work";

            }

        }
        return "Null";
    }

    static String generateNegativePrompts(int receivePrompt) {
        switch (receivePrompt) {
            case 1: {
                return "No, Please try again";
            }
            case 2: {
                return "Wrong, Try once more";
            }
            case 3: {
                return "Don't give up";
            }
            case 4: {
                return "No, Keep trying";
            }
        }
        return "Null";
    }

    static int generateQuestion(int difficulty, int operation) {/*
                                                                 * This function takes two parameters from the main
                                                                 * function,
                                                                 * difficulty and operation. Depending on the difficulty
                                                                 * 1,2 or 3 this function calls the generateNumber() to
                                                                 * generate single, double
                                                                 * or triple digit numbers respectively.
                                                                 * According to the value passed to operation parameter
                                                                 * (1 - 5) it has 5 cases addition problems, subtraction
                                                                 * problems,
                                                                 * multiplication, division and mixed problems from all
                                                                 * of the above respectively.
                                                                 */
        Scanner input = new Scanner(System.in);
        int answer, count = 0, correct;

        generateNumbers(difficulty);

        Random random = new Random();
        switch (operation) {
            case 1: {
                System.out.printf("How much is %d plus %d\n", a, b);
                correct = a + b;
                do {
                    answer = input.nextInt();

                    int a = random.nextInt(1, 5);
                    if (answer == correct) {
                        count += 1;
                        System.out.println(generatePositivePrompts(a));

                    } else {
                        count += 1;
                        System.out.println(generateNegativePrompts(a));

                    }
                } while (answer != correct);
                break;
            }
            case 2: {
                System.out.printf("How much is %d minus %d\n", a, b);
                correct = a - b;
                do {
                    answer = input.nextInt();

                    int a = random.nextInt(1, 5);
                    if (answer == correct) {
                        count += 1;
                        System.out.println(generatePositivePrompts(a));
                    } else {
                        count += 1;
                        System.out.println(generateNegativePrompts(a));
                    }
                } while (answer != correct);
                break;
            }
            case 3: {
                System.out.printf("How much is %d times %d\n", a, b);
                correct = a * b;
                do {
                    answer = input.nextInt();

                    int a = random.nextInt(1, 5);
                    if (answer == correct) {
                        count += 1;

                        System.out.println(generatePositivePrompts(a));
                    } else {
                        count += 1;

                        System.out.println(generatePositivePrompts(a));
                    }
                } while (answer != correct);
                break;

            }
            case 4: {
                System.out.printf("How much is %d divided %d\n", a, b);
                correct = a / b;
                do {
                    answer = input.nextInt();

                    int a = random.nextInt(1, 5);
                    if (answer == correct) {
                        count += 1;

                        System.out.println(generatePositivePrompts(a));
                    } else {
                        count += 1;

                        System.out.println(generateNegativePrompts(a));
                    }
                } while (answer != correct);
                break;

            }
            case 5: {
                int mix = random.nextInt(1, 5);
                return generateQuestion(difficulty, mix);

            }
        }

        return count;
    }

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int operation;

        do {
            System.out.println("What type of questions you want to attempt:");
            System.out.println("1) Addition\n2) Subtraction\n3) Multiplication\n4) Division\n5) Mixed:");
            operation = input.nextInt();

            if (operation < 1 || operation > 5) {
                System.out.println("Enter a valid choice");
            }
        } while (operation < 1 || operation > 5);

        System.out.println("Choose difficulty: 1    2   3   4:");
        int difficulty = input.nextInt();
        int count = 0, i = 0;
        do {

            if (generateQuestion(difficulty, operation) == 1) {
                count += 1;
            } else if (generateQuestion(difficulty, operation) == 0) {
                i += -1;
            }

            i += 1;

        } while (i < 10);

        if (count < 7) {
            System.out.printf("Your score is %d \nPlease ask your teacher for extra help", count);
        } else {
            System.out.printf("Your score is %d \nCongratulations, You are ready to go to the next level.", count);
        }

    }
}