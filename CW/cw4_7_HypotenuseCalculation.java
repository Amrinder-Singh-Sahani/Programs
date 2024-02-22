/* Define a method hypotenuse that calculates the hypotenuse of a 
right angle triangle when the lengths of the other two sides are given.
The method should take two arguments of type double and return the 
hypotenuse as a double. Incorporate this method into an application 
that reads values for side1 and side2 and perfoms the calculations 
with the hypotenuse method. Use Math methods pow and sqrt to 
determine the length of the hypotenuse for each of the triangles

 */

import java.util.Scanner;

public class cw4_7_HypotenuseCalculation {

    static double hypotenuse(double side1, double side2) {
        double a = (side1 * side1) + (side2 * side2);
        a = Math.sqrt(a);
        return a;
    }

    public static void main(String args[]) {

        // int a[][] = { { 3, 4 }, { 5, 12 }, { 13, 12 } };
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side length 1: ");
        int a = input.nextInt();
        System.out.println("Enter side length 2: ");
        int b = input.nextInt();

        System.out.println(hypotenuse(a, b));

        // for (int i = 0; i < 3; i++) {
        // System.out.println(hypotenuse(a[i][0], a[i][1]));
        // }

    }

}