// Question 9 contd :- Write a separate application that inputs an encrypted four digit 
// integer and decrypts it(by reversing the encryption scheme) to form the 
// original number.

import java.util.Scanner;

public class cw3_9_Decryption {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the encrypted number: ");
        int a = input.nextInt();
        int b = 0, b2 = 0, b3 = 0, b4 = 0;

        if (a % 10 >= 0) {
            b = a % 10;
            // System.out.print(b + "\t");
            a = (a - b) / 10;
            b = b + 3;
            if (b >= 10) {
                b = b % 10;
            }

        }

        if (a % 10 >= 0) {
            b2 = a % 10;
            // System.out.print(b2 + "\t");
            a = (a - b2) / 10;
            b2 = b2 + 3;
            if (b2 >= 10) {
                b2 = b2 % 10;
            }
        }

        if (a % 10 >= 0) {
            b3 = a % 10;
            // System.out.print(b3 + "\t");
            a = (a - b3) / 10;
            b3 = b3 + 3;
            if (b3 >= 10) {
                b3 = b3 % 10;
            }
        }

        if (a % 10 >= 0) {
            b4 = a % 10;
            // System.out.print(b4 + "\t");
            // a = (a - b4) / 10;
            b4 = b4 + 3;
            if (b4 >= 10) {
                b4 = b4 % 10;
            }
        }

        System.out.println("The original number is: ");
        System.out.printf("%d\t%d\t%d\t%d", b2, b, b4, b3);
    }
}