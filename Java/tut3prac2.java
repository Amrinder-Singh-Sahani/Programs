import java.util.Scanner;

public class tut3prac2 {
    public static void main(String args[]) {
        // System.out.print("hello");
        // Question1 :- Give a greeting to the person with their name.

        /*
         * Scanner name = new Scanner(System.in);
         * System.out.println("What is your name?");
         * String n = name.next();
         * System.out.println("Hello " + n + " have a good day!"); // Concatenation
         */
        // Question2 :- Check whether the entered number is an integer or not.
        // There are two ways to check whether the entered number is an integer or not.

        System.out.println("Enter your number: ");
        Scanner num = new Scanner(System.in);
        boolean num2 = num.hasNextInt();
        System.out.println(num2);

        System.out.println("Enter your number: ");
        Scanner newnum = new Scanner(System.in);
        System.out.println(newnum.hasNextInt());

    }
}