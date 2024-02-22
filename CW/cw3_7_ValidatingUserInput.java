import java.util.Scanner;

/* Question 7 :- Modify the program in fig 4.12 to validate its
inputs. For any input, if the value entered is other than 1 or 
2, keep looping until the user enters a correct value.
 */

public class cw3_7_ValidatingUserInput {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int passes = 0, failures = 0, studentCounter = 1;

        while (studentCounter <= 10) {
            System.out.println("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();
            if (result == 1) {
                passes = passes + 1;
                studentCounter++;
            } else if (result == 2) {
                failures = failures + 1;
                studentCounter++;
            } else {
                System.out.println("Enter a valid value.");
            }
        }
        System.out.printf("Passed: %d\nFailed: %d", passes, failures);
    }
}