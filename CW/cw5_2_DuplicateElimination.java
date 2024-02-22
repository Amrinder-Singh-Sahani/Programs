/* Question 1: Use a one dimensional array to solve the following problem.
Write an application that inputs ten numbers, each between 10
and 100, both inclusive. Save each number that was read in array
that was initialized to a value of -1 for all elements. Assume
a value of -1 indicates an array containing the numbers you input.
Display the contents of the array to demonstrate that the duplicate
input values were actually removed. [Note: do not display the array 
elements where the value is -1.]
 */

/* Question 2: Assuming that the elements of a four by four two dimensional
array mat are initialized with the sum of its row index and column index.
What will be the values in the two dimensional array mat after execution of 
the following program segment?

        for (int col = 0; col < 4; col++) {
            for (int row = 0; row < 4; row++) {
                mat[row][col] = row + col;
            }
        }
 */

import java.util.Scanner;

public class cw5_2_DuplicateElimination {
    public static void main(String args[]) {

        // Answer 1:

        Scanner input = new Scanner(System.in);
        int a[] = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter element: ");
            a[i] = input.nextInt();
        }
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    a[j] = -1;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {

            if (a[i] != -1) {
                System.out.println(a[i]);
            }

        }

        // Answer 2:

        int[][] mat = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mat[i][j] = 12;
                System.out.printf("mat[%d][%d] = %d\n", i, j, mat[i][j]);
            }
        }

        for (int col = 0; col < 4; col++) {
            for (int row = 0; row < 4; row++) {
                mat[row][col] = row + col;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("mat[%d][%d] = %d\n", i, j, mat[i][j]);
            }
        }
    }
}