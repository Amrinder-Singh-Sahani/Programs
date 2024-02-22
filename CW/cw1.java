import java.util.Scanner;

public class cw1 {
    public static void main(String args[]) {
        // Question 1 :-
        // int c, thisIsAVariable, q76354, number;
        // System.out.println("Enter the name: ");
        // Scanner a = new Scanner(System.in);
        // int value = a.nextInt();
        // System.out.println("This is a Java Program");
        // System.out.printf("%s%n%s%n", "This is a java program", "program");

        // if (value < 0) {
        // System.out.println("The number is negative");
        // }
        // ---------------------------------------------------------------

        // Question 2 :-

        // int t1, t2, t3;
        // Scanner a = new Scanner(System.in);
        // System.out.println("Enter the marks in test one:");
        // t1 = a.nextInt();
        // System.out.println("Enter the marks in test two: ");
        // t2 = a.nextInt();
        // System.out.println("Enter the marks in test three: ");
        // t3 = a.nextInt();
        // int total = t1 + t2 + t3;
        // System.out.println("Total marks: " + total);
        // -----------------------------------------------------------

        // Question 3 :- Write an application that asks the user to enter two
        // integers, obtains them from the user and prints the square of each,
        // the sum of their squares, and the difference of the squares.

        // int a, b;
        // Scanner c = new Scanner(System.in);
        // System.out.println("Enter your first number: ");
        // a = c.nextInt();
        // System.out.println("Enter your second number: ");
        // b = c.nextInt();
        // System.out.printf("Square of %d is %d\nSquare of %d is %d\n", a, (a * a), b,
        // (b * b));
        // System.out.printf("Sum of their squares is %d\n", ((a * a) + (b * b)));
        // System.out.printf("The difference between their squares is %d", ((a * a) - (b
        // * b)));
        // -------------------------------------------------------------------

        // Question 4 :- Write an program that asks the user to enter one integer,
        // obtains it from the user and displays whether the number and its square
        // are greater than, equal to, not equal to, or less than the number the
        // number 100

        // int i;
        // Scanner a = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        // i = a.nextInt();
        // if (i != 100) {
        // System.out.println(i + " != 100");
        // }
        // if (i > 100) {
        // System.out.printf("%d > 100\n", i);
        // }
        // if (i < 100) {
        // System.out.println(i + " < 100");
        // }
        // if (i == 100) {
        // System.out.printf("%d = 100\n", i);
        // }
        // if ((i * i) > 100) {
        // System.out.printf("The square of %d is greater than 100 ", i);
        // }
        // if ((i * i) == 100) {
        // System.out.printf("The square of %d is equal to 100", i);
        // }
        // if ((i * i) < 100) {
        // System.out.printf("The square of %d is less than 100", i);
        // }
        // --------------------------------------------------------------

        // Question 5 :- Write a program that inputs three integer from the user and
        // displays the sum, average, product, smallest and largest of the numbers.
        // Average displayed should be in integer

        // int a, b, d, avg;
        // Scanner c = new Scanner(System.in);

        // System.out.println("Enter first number: ");
        // a = c.nextInt();
        // System.out.println("Enter second number: ");
        // b = c.nextInt();
        // System.out.println("Enter third number: ");
        // d = c.nextInt();
        // int sum = a + b + d;
        // avg = sum / 3;
        // int product = a * b * d;
        // System.out.println("The sum of the numbers is: " + sum);
        // System.out.println("The product of the numbers is: " + product);
        // System.out.println("The average of the numbers is: " + avg);

        // if (a > b && a > d) {
        // System.out.println(a + " is the largest number");
        // if (b > d) {
        // System.out.println(d + " is the smallest number");
        // } else if (d > b) {
        // System.out.println(b + " is the smallest number");
        // }
        // } else if (b > a && b > d) {
        // System.out.println(b + " is the largest number");
        // if (a > d) {
        // System.out.println(d + " is the smallest number");
        // } else if (d > a) {
        // System.out.println(a + " is the smallest number");
        // }
        // } else {
        // System.out.println(d + " is the largest number");
        // if (a > b) {
        // System.out.println(b + " is the smallest number");
        // } else if (b > a) {
        // System.out.println(a + " is the smallest number");
        // }
        // }
        // ----------------------------------------------------

        // Question 6 :- Write a program that displays a box, an oval, an arrow
        // and a diamond using asterics

        // String a = "* *";

        // // Box
        // for (int i = 1; i < 10; ++i) {
        // if (i == 1 || i == 9) {
        // System.out.println(a.replace(" ", "*"));
        // } else if (i > 1 || i < 9) {
        // System.out.println(a);
        // }
        // }

        // Oval
        // for (int i = 1; i < 10; ++i) {
        // if (i == 1 || i == 9) {
        // System.out.println(" ***");
        // } else if (i == 2 || i == 8) {
        // System.out.println(" * *");
        // } else if (i >= 3 || 7 >= i) {
        // System.out.println("* *");
        // }
        // }
        // -------------------------------------------

        // Question 7 :- Write a program that reads two integers, determines whether the
        // first
        // number tripled is a multiple of the second number doubled and prints the
        // result.

        // int a, b;
        // Scanner c = new Scanner(System.in);
        // System.out.println("Enter first number: ");
        // a = c.nextInt();
        // System.out.println("Enter second number: ");
        // b = c.nextInt();

        // int a3 = 3 * a;
        // int b2 = 2 * b;
        // if (a3 % b2 == 0) {
        // System.out.printf("3 times %d is a multiple of %d doubled", a, b);
        // } else {
        // System.out.printf("3 times %d is not a multiple of %d doubled", a, b);
        // }

        // Question 8 :- Write a program that displays a checkeeboard pattern as
        // follows:
        // * * * * * * * *
        // * * * * * * * *
        // * * * * * * * *
        // * * * * * * * *
        // * * * * * * * *
        // * * * * * * * *
        // * * * * * * * *
        // * * * * * * * *

        // for (int i = 1; i < 9; i++) {
        // if (i % 2 == 0) {
        // System.out.println(" * * * * * * * *");
        // } else {
        // System.out.println("* * * * * * * *");
        // }

        // }

        // Question 9 :- Write a program that inputs from the user the radius of a
        // circle
        // as an integer and prints the circle's diameter, circumference and area using
        // the floating-point value 3.14159 for Pi.

        // float r;
        // Scanner a = new Scanner(System.in);

        // System.out.println("Enter the radius of the circle: ");
        // r = a.nextFloat();
        // System.out.printf("The diameter of the circle is %f\n", 2 * r);
        // System.out.printf("The circumference of the circle is %f\n", 2 * (float)
        // (Math.PI) * r);
        // System.out.printf("The area of the circle is %f", (float) (Math.PI) * r * r);

    }
}