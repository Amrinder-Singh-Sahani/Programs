/* Question 2 :- Write an application that displays the following 
patterns separately, one below the other. All asterisks(*) should be 
printed by a single statement of the form System.out.print('*'); which
causes the asterisks to print side by side.
 */

public class cw4_2_TrianglePrinting {
    public static void main(String args[]) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for (int i = 10; i > 0; i--) {

            for (int a = 10; a > i; a--) {
                System.out.print(' ');
            }
            for (int b = 0; b < i; b++) {
                System.out.print('*');
            }

            System.out.println();

        }
        System.out.println();
        System.out.println();
        for (int i = 10; i > 0; i--) {

            for (int b = 0; b < i; b++) {
                System.out.print(' ');
            }

            for (int a = 10; a > i; a--) {
                System.out.print('*');
            }

            System.out.println();

        }
    }
}