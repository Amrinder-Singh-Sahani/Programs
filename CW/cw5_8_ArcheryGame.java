/* A group of four friends visit a sports club and they 
decide to practice archery. Each player gets 3 chances 
and in every chance they can score between 0 to 10 points.
The player with the maximum score after adding the scores
obtained in all 3 chances wins. Write an application that
simulates this game and prints the scores of all four players
in a tabular format and also prints which player won.
Each line in the table should contain the following:
    1) The player number.
    2) The first chance score
    3) Their second chance score
    4) Their third chance score
    5) Their score after all three chances

Use multidimensional arrays to store the scores of players
in each chance. Use secure random number generation to generate
scores between 0 and 10 for each player chance.
 */

import java.security.SecureRandom;

public class cw5_8_ArcheryGame {
    public static void main(String args[]) {

        SecureRandom random = new SecureRandom();
        int score;
        int pointsTable[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                pointsTable[i][j] = random.nextInt(1, 11);
                pointsTable[i][3] += pointsTable[i][j];
            }

        }

        System.out.println("Player 1\tPlayer 2\tPlayer 3");
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 3; i++) {
                // System.out.println();
                System.out.print(pointsTable[i][j] + "\t\t");
            }
            System.out.println();
        }

        int p1 = pointsTable[0][3], p2 = pointsTable[1][3], p3 = pointsTable[2][3];
        if (p1 >= p2 && p1 >= p3) {
            if (p1 == p2) {
                System.out.println("No one wins");
            } else if (p1 == p3) {
                System.out.println("No one wins");
            } else {
                System.out.println("The winner is Player 1");
            }

        } else if (p2 >= p3 && p2 >= p1) {
            if (p2 == p3) {
                System.out.println("No one wins");
            } else {
                System.out.println("The winner is Player 2");
            }

        } else {
            System.out.println("The winner is Player 3");
        }

    }
}