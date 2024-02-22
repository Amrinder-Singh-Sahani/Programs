import java.util.Scanner;

public class tut3 {
    public static void main(String args[]) {
        System.out.println("Taking input from the user ");
        Scanner a = new Scanner(System.in);

        System.out.println("Enter number 1");
        int a1 = a.nextInt();

        System.out.println("Enter number 2");
        int a2 = a.nextInt();

        int sum = a1 + a2;

        System.out.println("The sum of these numbers is: ");
        System.out.println(sum);

        System.out.println("Enter a decimal number: ");
        float b = a.nextFloat();

        System.out.println("This is a floating point number: ");
        System.out.println(b);

        Scanner c1 = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int c12 = c1.nextInt();

        System.out.println("Enter second decimal number: ");
        float c13 = c1.nextFloat();

        float c14 = c12 + c13; // Here the an int var c12 is added into a floating number.

        System.out.println("The decimal answer is: ");
        System.out.println(c14);

        Scanner bs = new Scanner(System.in);

        System.out.println("Enter any number: ");
        boolean z = bs.hasNextInt();

        System.out.println(z);

    }
}