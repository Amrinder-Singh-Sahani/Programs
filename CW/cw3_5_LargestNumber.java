import java.util.Scanner;

/* Question 5 :- Write a java application that inputs a series 
of 10 integers and detemines and prints the largest integer.
Your program should use at least the following three
variables: 
a) counter: A counter to count to 10 (i.e., to keep track of 
how many numbers have been input and to determine when all 10 numbers 
have been processed).
b) number: The integer most recently input by the user.
c) largest: The largest number found so far.
*/

public class cw3_5_LargestNumber {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int counter = 1, num, number, largest = Integer.MIN_VALUE;

        while (counter <= 10) {
            System.out.printf("Enter no.%d: \n", counter);
            num = input.nextInt();

            if (num > largest) {
                largest = num;
                System.out.println("The largest number entered so far is: " + largest);
            } else {
                System.out.println("The largest number entered so far is: " + largest);
            }

            number = num;
            System.out.println("The last number entered was: " + number);
            counter++;

        }
    }
}