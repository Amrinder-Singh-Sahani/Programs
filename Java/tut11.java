import java.util.Scanner;
// Recursion in java
// Recursion technically means when a func makes a call to itself or
// making a func call itself.

public class tut11 {

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int factorial_iterative(int n) {
        int product = 1;
        if (n == 0 || n == 1) {
            return 1;
        } else {

            for (int i = 1; i <= n; i++) {
                product *= i;
            }
        }
        return product;
    }

    public static void main(String args[]) {

        System.out.println(factorial(5));
        System.out.println(factorial_iterative(6));

    }
}