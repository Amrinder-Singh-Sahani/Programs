import java.util.Scanner;

public class tut7prac {
    public static void main(String args[]) {

        // Question 1 :- Write a program to print the following pattern
        // * * * *
        // * * *
        // * *
        // *

        /*
         * for (int i = 4; i > 0; i--) {
         * System.out.println();
         * for (int j = i; j > 0; j--) {
         * System.out.print("*");
         * }
         * }
         */

        // Question 2 :- Write a program to sum first n even numbers using while loop

        /*
         * Scanner d = new Scanner(System.in);
         * System.out.println("Enter how many even numbers do you want to add: ");
         * int d1 = d.nextInt();
         * int a = 1, b, c = 0;
         * while (a <= d1) {
         * b = (a * 2);
         * c = c + b;
         * 
         * a++;
         * }
         * System.out.println(c);
         */

        // Question 3 :- Write a program to print a multiplication table of n number

        /*
         * Scanner m = new Scanner(System.in);
         * System.out.println("Enter the number whose table you want to print: ");
         * int n = m.nextInt();
         * System.out.println("How many times you want to multiply: ");
         * int x = m.nextInt();
         * int d;
         * System.out.println("The multiplication table is: ");
         * for (int i = 1; i <= x; i++) {
         * d = n * i;
         * System.out.printf("%d X = %d", i, d);
         * System.out.println();
         * }
         */

        // Question 4 :- Write a program to print multiplication table of a number in
        // reverse order

        /*
         * Scanner m = new Scanner(System.in);
         * System.out.println("Enter the number whose table you want to print: ");
         * int n = m.nextInt();
         * int d;
         * System.out.println("The multiplication table in reverse is: ");
         * for (int i = 10; i >= 1; i--) {
         * d = n * i;
         * System.out.printf("%d X = %d", i, d);
         * System.out.println();
         * }
         */

        // Question 5 :- Write a program to find factorial of a given number using for
        // loops

        /*
         * Scanner n = new Scanner(System.in);
         * System.out.println("Upto what number you want to find the factorial: ");
         * long a = n.nextLong();
         * long b = 1L;
         * if (a == 0) {
         * System.out.println(0);
         * } else {
         * 
         * for (long i = 1L; i <= a; i++) {
         * b = i * b;
         * 
         * }
         * System.out.println(b);
         * }
         */

        // Question 6 :- Repeat question 5 using while loop

        /*
         * Scanner n = new Scanner(System.in);
         * System.out.println("Upto what number you want to find the factorial: ");
         * long a = n.nextLong();
         * long b = 1L;
         * long a1 = 1L;
         * if (a == 0) {
         * System.out.println(0);
         * } else {
         * while (a1 <= a) {
         * b *= a1;
         * a1++;
         * }
         * System.out.println("The factorial is: " + b);
         * }
         */

        // Question 7 :- Repeat question 1 using while loop

        /*
         * int i = 4;
         * while (i > 0) {
         * int j = i;
         * while (j > 0) {
         * System.out.print("*");
         * j--;
         * }
         * System.out.println();
         * i--;
         * }
         */

        // Question 7 :- Write a program to calculate the sum of the numbers occuring in
        // the
        // multiplication table of a number taking by the user.

        /*
         * Scanner a = new Scanner(System.in);
         * System.out.println("Enter the number: ");
         * int b = a.nextInt();
         * 
         * int d, c = 0;
         * for (int i = 1; i <= 10; i++) {
         * d = b * i;
         * c += d;
         * 
         * }
         * 
         * System.out.println("The addition of this multiplication table is: " + c);
         * 
         */

        // Question 9 :- Repeat question 2 using for loop

        Scanner d = new Scanner(System.in);
        System.out.println("Enter how many even numbers do you want to add: ");
        int d1 = d.nextInt();
        int b, c = 0;
        for (int a = 1; a <= d1; a++) {
            b = (a * 2);
            c = c + b;

        }
        System.out.println(c);

    }
}