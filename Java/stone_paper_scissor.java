import java.util.Random;
import java.util.Scanner;

public class stone_paper_scissor {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter 0 for Rock \n      1 for Paper\n      2 for Scissor: ");
        int userinput = a.nextInt();

        Random random = new Random();
        int computerinput = random.nextInt(3);
        if (userinput == computerinput) {
            if (computerinput == 0) {
                System.out.println("Computer choice: Rock");
            } else if (computerinput == 1) {
                System.out.println("Computer choice: Paper");
            } else {
                System.out.println("Computer choice: Scissor");
            }
            System.out.println("Draw");
        } else if (userinput == 0 && computerinput == 2 || userinput == 1 && computerinput == 3
                || userinput == 2 && computerinput == 0) {
            if (computerinput == 0) {
                System.out.println("Computer choice: Rock");
            } else if (computerinput == 1) {
                System.out.println("Computer choice: Paper");
            } else {
                System.out.println("Computer choice: Scissor");
            }

            System.out.println("Computer Wins!");
        } else {
            if (computerinput == 0) {
                System.out.println("Computer choice: Rock");
            } else if (computerinput == 1) {
                System.out.println("Computer choice: Paper");
            } else {
                System.out.println("Computer choice: Scissor");
            }

            System.out.println("You Win!");
        }
    }
}