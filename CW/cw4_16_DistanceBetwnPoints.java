/*  Write method distance to calculate the distance
between two points(x1,y1) and (x2,y2). All numbers and
return values should be of type double. Incorporate this
method into an application that enables the user
to enter the coordinates of the points.
 */

import java.util.Scanner;

public class cw4_16_DistanceBetwnPoints {

    static double distance(double x1, double y1, double x2, double y2) {
        double d = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
        return Math.sqrt(d);
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double[] arr;
        arr = new double[4];

        System.out.println("Enter the co ordianate of x1: ");
        arr[0] = input.nextDouble();
        System.out.println("Enter the co ordianate of y1: ");
        arr[1] = input.nextDouble();
        System.out.println("Enter the co ordianate of x2: ");
        arr[2] = input.nextDouble();
        System.out.println("Enter the co ordianate of y2: ");
        arr[3] = input.nextDouble();
        System.out.println(distance(arr[0], arr[1], arr[2], arr[3]));
    }
}