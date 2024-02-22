import java.util.Scanner;

/* Question 12 :- Write an application that asks for a 
number from the user and then keeps reading integer values
from the user until the sum of those integers equals
or becomes greater than the value that was input in
the beginning
 */

public class cw3_12_ReadNumbersForSpecifiedRun {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = input.nextInt();
        int b = 0, c = 0;
        while (c < a) {
            System.out.println("Enter the numbers for addition: ");
            b = input.nextInt();
            c = b + c;
        }
    }
}