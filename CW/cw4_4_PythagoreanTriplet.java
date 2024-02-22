/* Write an application taht displays a table of the Pythagorean
triplets for side1, side2 and the hypotenuse, all no larger than 500.

This method is an example of "brute-force" computing. 
For many problems there's no known algorithmic approach other than 
using sheer brute force.
 */

public class cw4_4_PythagoreanTriplet {
    public static void main(String args[]) {
        for (int i = 1; i <= 500; i++) {
            for (int j = 1; j <= 500; j++) {
                for (int k = 1; k <= 500; k++) {
                    if (((i * i) + (j * j)) == (k * k)) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
    }
}