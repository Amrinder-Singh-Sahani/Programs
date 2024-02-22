
public class tut11prac1 {
    // Question 1 :- Write a method to print multiplication table of any n number.

    static void mul(int a) {

        for (int i = 1; i <= 10; i++) {

            System.out.format("%d X %d = %d\n", a, i, a * i);

        }

    }

    // Question 2 :- Write a method to print the following pateern:
    // *
    // * *
    // * * *
    // * * * *

    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Question 3 :- Write a recursive func to calculate sum of first n natural
    // numbers.

    static int sum(int n) {

        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }

    }

    // Question 4 :- Write a func to print the following pattern
    // * * * *
    // * * *
    // * *
    // *

    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Question 5 :- Write a func to print nth term of fibonacci series using
    // recursion

    static int fibo(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    // Question 6 :- Write a func to find the average of a set of numbers passed as
    // arguments

    static float avg(int... arr) {
        float result = 0f;
        for (int a : arr) {
            result += a;
        }
        return result / arr.length;
    }

    // Question 7 :- Repeat 2 using recursion.

    static void pat(int n) {

        if (n > 0)

        {
            pat(n - 1);
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    // pat(3)
    // pat(2) + 3 times star and new line
    // pat(1) + 2 times star and new line + 3 times star and new line
    // pat(0) + 1 times star and new line + 2 times star and new line + 3 times star
    // and new line

    // Question 8 :- Write a func to convert Celsius into fahrenheit

    static float temp(float a) {

        return a * (9f / 5f) + 32f;
    }

    public static void main(String[] args) {
        // Answer 1 :-
        // mul(5);

        // Answer 2 :-
        // pattern(4);

        // Answer 3 :-
        // int c = sum(3);
        // System.out.println(c);

        // Answer 4 :-
        // pattern2(4);

        // Answer 5 :-
        // int c = fibo(5);
        // System.out.println(c);

        // Answer 6 :-
        // System.out.println(avg(5, 10, 11));

        // Answer 7 :-
        // pat(3);

        // Answer 8 :-
        float c = temp(66);
        System.out.println(c);

    }
}