/* More sophisticated computer assisted instruction systems
monitor the student's performance over a period of time.
The decision to begin a new topic is often based on the 
student's success with the previous topics. Modify
the program of Exercise cw4_20 to count the number of 
correct and incorrect responses typed by the student.
After the student types 10 answers, your program should
calculate the percentage that are correct. If the percentage
is lower than 75%, display "Please ask your teacher for extra
help.", then reset the program so another student can try it.
If the percentage is 75% or higher, display "Congratulations,
you are ready to go to the next level!", then reset the program
so another student can try it.
 */

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class cw4_21_ComputerAssitedInstructions3 {

    static int a, b;

    static void generateNumbers() {

        SecureRandom random = new SecureRandom();
        a = random.nextInt(101);
        b = random.nextInt(101);
    }

    static int generateQuestion() {
        Scanner input = new Scanner(System.in);
        int answer, count = 0;

        generateNumbers();

        System.out.printf("How much is %d times %d\n", a, b);
        Random random = new Random();
        int correct = a * b;
        do {
            answer = input.nextInt();

            int a = random.nextInt(1, 5);
            if (answer == correct) {

                switch (a) {
                    case 1: {
                        System.out.println("Very Good");
                        count += 1;
                        break;
                    }
                    case 2: {
                        System.out.println("Excellent");
                        count += 1;
                        break;
                    }
                    case 3: {
                        System.out.println("Nice Work");
                        count += 1;
                        break;
                    }
                    case 4: {
                        System.out.println("Keep up the good work");
                        count += 1;
                        break;
                    }

                }
            } else {

                switch (a) {
                    case 1: {
                        System.out.println("No, Please try again");
                        count += 1;
                        break;
                    }
                    case 2: {
                        System.out.println("Wrong, Try once more");
                        count += 1;
                        break;
                    }
                    case 3: {
                        System.out.println("Don't give up");
                        count += 1;
                        break;
                    }
                    case 4: {
                        System.out.println("No, keep trying");
                        count += 1;
                        break;
                    }
                }
            }
        } while (answer != (a * b));

        return count;
    }

    public static void main(String args[]) {

        String choice;
        int count = 0, i = 0;
        do {
            System.out.println("Do you want to practice multiplication?\nYes or No");
            Scanner input = new Scanner(System.in);
            if (generateQuestion() == 1) {
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