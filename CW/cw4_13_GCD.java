/* Write a method that returns the greatest
common divisor of the numbers. Incorporate the 
method into an application that reads two values
from the user and displays the result.
 */

import java.util.Scanner;

public class cw4_13_GCD {

    static int gcd(int a, int b) {
        int firstsub = 0, secsub = 0;
        do {

            firstsub = a - b;
            if (firstsub < 0) {
                firstsub = firstsub * (-1);
            }
            a = b;
            b = firstsub;
            secsub = a - firstsub;

        } while (firstsub != secsub);

        return firstsub;

    }

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = input.nextInt();
        System.out.println("Enter second number: ");
        int b = input.nextInt();
        System.out.println(gcd(a, b));
    }
}