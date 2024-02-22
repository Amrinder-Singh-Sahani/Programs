/* Write a method distance to calculate the distance 
between two points (x1,y2) and (x2,y2). All numebrs and
return values should be of type double. Incorporate this method 
into an application that enables the user to enter the 
coordinates of the points.
 */

import java.util.Scanner;

import javax.tools.Diagnostic;

public class cw4_18_DistanceBetweenPoints {

    static double distance;

    static double Distance(double x1, double y1, double x2, double y2) {
        double power1, power2;
        power1 = Math.pow((x2 - x1), 2);
        power2 = Math.pow((y2 - y1), 2);

        distance = Math.sqrt((power1 + power2));
        return distance;
    }

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter point x1: ");
        double x1 = input.nextDouble();
        System.out.println("Enter point x2: ");
        double x2 = input.nextDouble();
        System.out.println("Enter point y1: ");
        double y1 = input.nextDouble();
        System.out.println("Enter point y2: ");
        double y2 = input.nextDouble();

        System.out.println(Distance(x1, y1, x2, y2));

    }
}