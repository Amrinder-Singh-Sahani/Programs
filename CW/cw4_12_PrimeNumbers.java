/* Write a method that determines whether a number 
is prime.
Use this method in an application that determines 
and displays all the prime numbers less than 10,000.
How many numbers upto 10,000 do you have to test to 
ensure that you've found all the primes?
 */

public class cw4_12_PrimeNumbers {

    static int prime(int a) {

        for (int b = 2; b <= (int) (Math.sqrt(a)); b++) {
            if (a % b == 0) {
                return 0;

            }
        }
        return a;
    }

    public static void main(String args[]) {

        for (int i = 2; i <= 10000; i++) {

            if (prime(i) != 0) {
                System.out.println(prime(i));
            }
        }

    }
}