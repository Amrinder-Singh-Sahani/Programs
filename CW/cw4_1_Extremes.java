/* Question 1 :- Write an application that finds the
minimum and maximum amongst several integers and then computes
the sum of the two extremes. The user will be prompted to input
how many values the application should ask the user to input.
 */

import java.util.Scanner;

public class cw4_1_Extremes {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many integers you want to enter?");
        int a = input.nextInt();
        int max = 0;
        int min = 0;
        int[] b = new int[a];

        for (int i = 0; i < a; i++) {
            System.out.println("Enter integer no." + (i + 1));
            b[i] = input.nextInt();

        }
        max = b[0];
        min = b[0];
        for (int j = 0; j < a; j++) {

            if (max < b[j]) {
                max = b[j];
            }
            if (min > b[j]) {
                min = b[j];
            }

        }
        System.out.printf("The largest integer is %d\nThe smallest integer is %d",
                max, min);
    }
}