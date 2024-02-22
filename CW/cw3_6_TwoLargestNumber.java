import java.util.Scanner;

/* Question 6 :- Using an approach similar to question 5,
find the two largest value of the 10 values entered.
[Note: You may input each number only once.]
 */

public class cw3_6_TwoLargestNumber {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int num, largest = Integer.MIN_VALUE + 1, secLargest = Integer.MIN_VALUE;
        int counter = 1;

        while (counter <= 10) {
            System.out.printf("Enter no.%d: \n", counter);
            num = input.nextInt();

            if (num > largest) {
                secLargest = largest;
                largest = num;

                System.out.println("The largest number is: " + largest);

                if (counter > 1) {

                    System.out.println("The second largest number is: " + secLargest);
                }
            } else if (num > secLargest) {
                secLargest = num;
                System.out.println("The largest number is: " + largest);
                System.out.println("The second largest number is: " + secLargest);
            } else {
                System.out.println("The largest number is: " + largest);
                System.out.println("The second largest number is: " + secLargest);
            }

            System.out.println("The last number entered was: " + num);
            counter++;
        }
    }
}