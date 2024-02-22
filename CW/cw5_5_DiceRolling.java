/* Write an application to simulate the rolling of two
dice. The application should use an object of class Random
once to roll the first die and again to roll the second die.
The sum of the two values should then be calculated. Each die can
show an integer value from 1 to 6, so the sum of the two values will
vary from 2 to 12, with 7 being the most frequent sum and 2 and 12 the 
least frequent. Your application should roll the dice 36,000,000 times.
Use a one dimensional array to tally the number of times each possible
sum appears. Display the results in tabular format.
 */

import java.util.Random;

public class cw5_5_DiceRolling {
    public static void main(String args[]) {
        Random random = new Random();
        int die1, die2;
        double frequency[] = new double[13];

        for (double i = 0; i <= 36000000; i++) {
            die1 = random.nextInt(1, 7);
            die2 = random.nextInt(1, 7);
            ++frequency[(die1 + die2)];
        }
        System.out.println("\t\t1\t\t2\t\t3\t\t4\t\t5\t\t6");
        for (int i = 1; i <= 6; i++) {
            System.out.print(i + "\t");
            for (int j = i + 1; j <= i + 6; j++) {
                System.out.print(frequency[j] + "\t");
            }
            System.out.println();
        }
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        for (double i : frequency) {
            if (i > 0) {
                if (i > max) {
                    max = i;
                }
                if (i < min) {
                    min = i;
                }
            }
        }
        System.out.printf("max = %f     min = %f", max, min);

    }
}