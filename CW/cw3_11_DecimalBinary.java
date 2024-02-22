import java.util.Scanner;

/* Question 11 :- Write an application that inputs an integer
containing only 0s and 1s (i.e., a binary number) and prints
its decimal equivalent.[Hint: Use the remainder and division 
operators to pick off the binary number's digits one at a time,
from right to left.]
 */

public class cw3_11_DecimalBinary {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 10 digit binary number: ");
        int a = input.nextInt();
        int b1 = 0, b2 = 0, b3 = 0, b4 = 0, b5 = 0, b6 = 0, b7 = 0, b8 = 0;
        int b9 = 0, b10 = 0;
        if (a % 10 >= 0) {
            b1 = (a % 10) * 1;
            a = (a - b1) / 10;

        }

        if (a % 10 >= 0) {
            b2 = (a % 10);
            a = (a - b2) / 10;
            b2 = b2 * 2;
        }

        if (a % 10 >= 0) {
            b3 = (a % 10);
            a = (a - b3) / 10;
            b3 = b3 * 4;
        }

        if (a % 10 >= 0) {
            b4 = (a % 10);
            a = (a - b4) / 10;
            b4 = b4 * 8;
        }

        if (a % 10 >= 0) {
            b5 = (a % 10);
            a = (a - b5) / 10;
            b5 = b5 * 16;
        }
        if (a % 10 >= 0) {
            b6 = (a % 10);
            a = (a - b6) / 10;
            b6 = b6 * 32;
        }
        if (a % 10 >= 0) {
            b7 = (a % 10);
            a = (a - b7) / 10;
            b7 = b7 * 64;
        }
        if (a % 10 >= 0) {
            b8 = (a % 10);
            a = (a - b8) / 10;
            b8 = b8 * 128;
        }
        if (a % 10 >= 0) {
            b9 = (a % 10);
            a = (a - b9) / 10;
            b9 = b9 * 256;
        }
        if (a % 10 >= 0) {
            b10 = (a % 10);
            a = (a - b10) / 10;
            b10 = b10 * 512;
        }

        int res = b1 + b2 + b3 + b4 + b5 + b6 + b7 + b8 + b9 + b10;
        System.out.println("The decimal equivalent is: " + res);

    }
}