/* Use random-number generation to enable the knight
to walk around the chessboard (in its legitimate 
L-shaped moves) at random. Your application should
run one tour and display the final chessboard. How far 
did the knight get?
Use a one dimensional array to keep track of the number of
tours of each length. Let the application run until it produces
a full tour. Display the table when the first full tour is found.
*/

import java.util.Random;
import java.util.Arrays;

public class cw5_12_KnightTour4 {

    static char returnfile(int file) {
        char fileChar = 'e';
        switch (file) {
            case 0: {
                fileChar = 'a';
                break;
            }
            case 1: {
                fileChar = 'b';
                break;
            }
            case 2: {
                fileChar = 'c';
                break;
            }
            case 3: {
                fileChar = 'd';
                break;
            }
            case 4: {
                fileChar = 'e';
                break;
            }
            case 5: {
                fileChar = 'f';
                break;
            }
            case 6: {
                fileChar = 'g';
                break;
            }
            case 7: {
                fileChar = 'h';
                break;
            }

        }
        return fileChar;
    }

    static int getMove(int[] checkMoveNumber) {
        Random random = new Random();
        do {
            int move = random.nextInt(8);
            for (int i = 0; i < checkMoveNumber.length; i++) {
                if (checkMoveNumber[i] == move) {
                    return move;
                }
            }
        } while (true);
    }

    public static void main(String args[]) {

        int countTours = 0, chessboard[][] = new int[8][8], movesplayed[] = new int[64];

        do {
            // for (int b = 0; b < 8; b++) {
            int currentRank = 0, currentFile = 0; // Knight set to location a1
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    chessboard[i][j] = 1;
                }
            }

            int count = 0, checkLegalMoves = 8;

            int file[] = { 2, 1, -1, -2, -2, -1, 1, 2 }; // Here file and rank are literal reference to the use of
                                                         // chess
            int rank[] = { -1, -2, -2, -1, 1, 2, 2, 1 };// notations used to locate a piece's location
            do {

                // System.out.printf("The knight is at location: %c %d\n",
                // returnfile(currentFile), currentRank + 1);

                count += 1;
                int checkMoveNumber[] = { 9, 9, 9, 9, 9, 9, 9, 9 };

                // int moveNumber = input.nextInt(); // moveNumber will be assigned by the
                // program, not by user input.
                int checkRank;
                int checkFile;
                checkLegalMoves = 8;

                for (int i = 0; i < 8; i++) {
                    checkRank = currentRank; // checkRank and checkFile checks whether the moveNumber
                                             // is available.
                    checkFile = currentFile;
                    checkRank = checkRank + rank[i];
                    checkFile = checkFile + file[i];
                    if (checkRank > 7 || checkRank < 0 || checkFile > 7 || checkFile < 0) {

                        checkLegalMoves -= 1;

                    } else if (chessboard[checkRank][checkFile] == 11) {

                        checkLegalMoves -= 1;

                    } else {
                        chessboard[checkRank][checkFile] -= 1;
                        checkMoveNumber[i] = i;
                    }

                }
                if (checkLegalMoves == 0) {
                    // System.out.println("No legal moves available.");
                    // System.out.printf("The knight is at location: %c %d\n",
                    // returnfile(currentFile),
                    // currentRank + 1);
                    // System.out.println("Total moves played: " + (count - 1));
                    break;

                } else {
                    chessboard[currentRank][currentFile] = 11;
                    int moveNumber = getMove(checkMoveNumber);
                    currentRank += rank[moveNumber];
                    currentFile += file[moveNumber];
                    // System.out.println("Movenumber: " + moveNumber);
                    // System.out.printf("The knight is at location: %c %d\n",
                    // returnfile(currentFile),
                    // currentRank + 1);
                    chessboard[currentRank][currentFile] = 11;

                }

            } while (count != 64);

            countTours += 1;
            movesplayed[count] += 1;
            int max = Integer.MIN_VALUE, turnNumber = 0;

            if (count == 63) {
                System.out.println("Total tours: " + countTours);
                for (int i = 0; i < 64; i++) {

                    if (movesplayed[i] > max) {
                        turnNumber = i;
                        max = movesplayed[i];
                    }
                    System.out.printf("Move No. %d = %d\n", (i), movesplayed[i]);
                }
                System.out.printf("Move number: %d = %d", turnNumber, movesplayed[turnNumber]);
                break;
            }
        } while (true);

        // System.out.println(countTours);
        // for (int i = 0; i < 8; i++) {
        // for (int j = 0; j < 8; j++) {
        // System.out.print("\t" + chessboard[i][j]);
        // }
        // System.out.println();
        // }

    }
}
// Least tours: 43793
// Second least: 54839