// Question 1: Write a program that takes command line arguments and computes
// the average of their maximum and minimum. Make sure there are 
// command line arguments being passed before you attempt to compute
// anything.

// Question 2: Write an application that uses an enhanced for 
// statement to find the absolute values of int numbers passed by 
// command line arguments.

public class cw5_4_CommandLineArguments {
    public static void main(String args[]) {

        /*
         * Yeh program cmd me run karna hai, kuch iss tarah --->
         * java cw5_4_CommandLineArguments arg1 arg2 arg3 and so on...
         */

        // // Answer 1:

        // if (args.length > 0) {
        // double max = Double.MIN_VALUE;
        // double min = Double.MAX_VALUE;
        // double number;

        // for (String arg : args) {
        // number = Double.parseDouble(arg);
        // if (number > max) {
        // max = number;
        // }
        // if (number < min) {
        // min = number;
        // }
        // }

        // double average = (max + min) / 2;
        // System.out.println("The average of the maximum and minimum is: " + average);
        // } else {
        // System.out.println("No command line arguments were passed.");
        // }

        // // Answer 2:

        int number;
        for (String a : args) {
            number = Integer.parseInt(a);
            System.out.printf("\nThe absolute of %d is ", number);
            if (number < 0) {
                number *= -1;

            }
            System.out.println(number);
        }

    }
}