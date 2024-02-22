/* Write two methods myFloor and myCeil that take a positive
double num variable int myFloor(double num) and int myCeil(double num).
The myFloor method takes num and returns the largest number that is less
than or equal to x. The myCeil function takes num and finds the smallest
number that is greater than or equal to x. Do not use any Math class 
methods. Incorporate this methods into an application that sends a double 
value to the functions and tests their ability to calculate the required output.
 */
public class cw4_6_Floor_Ceil {

    static int floor(double num) {

        double b = num % 1;
        num = num - b;
        return (int) (num);
    }

    static int ceil(double num) {
        double b = num % 1;
        num = num + 1 - b;

        return (int) (num);

    }

    public static void main(String args[]) {

        double x = 12.33;
        System.out.println(floor(x));
        System.out.println(ceil(x));

    }
}