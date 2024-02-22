import java.util.Scanner;

/* Question 10 :- Write an application that reads in a five digit
integer and determines whether it's a palindrome. If the number is not
five digits long, display an error message and allow the user to 
enter a new value.
 */

public class cw3_10_Palindrome {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int b = 0, b2 = 1, b3 = 0, b4 = 3, b5 = 4, a;
        boolean c = true;
        // System.out.println("Enter a 5 digit number: ");
        // a = input.nextInt();
        while (c) {
            System.out.println("Enter a 5 digit number: ");
            a = input.nextInt();
            if (a < 10000 || a > 99999) {
                System.out.println("The entered number is not a 5 digit number.");
            } else {
                c = false;
                if (a % 10 >= 0) {
                    b = a % 10;
                    // System.out.print(b + "\t");
                    a = (a - b) / 10;

                }

                if (a % 10 >= 0) {
                    b2 = a % 10;
                    // System.out.print(b2 + "\t");
                    a = (a - b2) / 10;

                }

                if (a % 10 >= 0) {
                    b3 = a % 10;
                    // System.out.print(b3 + "\t");
                    a = (a - b3) / 10;

                }

                if (a % 10 >= 0) {
                    b4 = a % 10;
                    // System.out.print(b4 + "\t");
                    // a = (a - b4) / 10;
                    a = (a - b4) / 10;
                }

                if (a % 10 >= 0) {
                    b5 = a % 10;
                    // System.out.print(b4 + "\t");
                    // a = (a - b4) / 10;

                }
            }
        }
        if (b4 == b2 && b5 == b) {
            System.out.printf("%d%d%d%d%d is a palindrome", b5, b4, b3, b2, b);
        } else {
            System.out.printf("%d%d%d%d%d is not a palindrome", b5, b4, b3, b2, b);
        }

    }
}