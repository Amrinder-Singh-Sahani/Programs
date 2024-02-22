/*  Question 9 :- Your application should read a four digit integer entered
by the user and encrypt it as follows: Replace each digit with the result 
of adding 7 to the digit and getting the remainder after dividing the 
new value by 10. Then swap the first digit with the third, and swap
the second digit with the fourth. Then print the encrypted integer.
Write a separate application that inputs an encrypted four digit 
integer and decrypts it(by reversing the encryption scheme) to form the 
original number.
 */

import java.util.Scanner;

public class cw3_9_Encryption {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a four digit number which is to be encrypted: ");
        int a = input.nextInt();
        int b = 0, b2 = 0, b3 = 0, b4 = 0;

        if (a % 10 >= 0) {
            b = a % 10;
            // System.out.print(b + "\t");
            a = (a - b) / 10;
            b = (b + 7) % 10;
        }

        if (a % 10 >= 0) {
            b2 = a % 10;
            // System.out.print(b2 + "\t");
            a = (a - b2) / 10;
            b2 = (b2 + 7) % 10;
        }

        if (a % 10 >= 0) {
            b3 = a % 10;
            // System.out.print(b3 + "\t");
            a = (a - b3) / 10;
            b3 = (b3 + 7) % 10;
        }

        if (a % 10 >= 0) {
            b4 = a % 10;
            // System.out.print(b4 + "\t");
            // a = (a - b4) / 10;
            b4 = (b4 + 7) % 10;
        }

        System.out.println("The encyrption is: ");
        System.out.printf("%d%d%d%d", b2, b, b4, b3);

    }
}