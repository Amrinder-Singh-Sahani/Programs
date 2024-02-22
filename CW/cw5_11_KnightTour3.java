/* Write a version of the Knight's Tour application that,
when encountering a tie between two or more squares, decides
what square to choose by looking ahead to those squares
reachable from the "tied" squares. Your application should
move to the tied square for which the next move would arrive
at a square with the lowest accessibility number.
 */

import java.util.Random;

public class cw5_11_KnightTour3 {

    static int chessboard[][] = {
            { 2, 3, 4, 4, 4, 4, 3, 2 },
            { 3, 4, 6, 6, 6, 6, 4, 3 },
            { 4, 6, 8, 8, 8, 8, 6, 4 },
            { 4, 6, 8, 8, 8, 8, 6, 4 },
            { 4, 6, 8, 8, 8, 8, 6, 4 },
            { 4, 6, 8, 8, 8, 8, 6, 4 },
            { 3, 4, 6, 6, 6, 6, 4, 3 },
            { 2, 3, 4, 4, 4, 4, 3, 2 } };

    static int checkMoveNumber[] = { 1, 1, 1, 1, 1, 1, 1, 1 };

    static int checkLegalMoves = 8;
    static int currentRank = 0, currentFile = 0; // Knight set to location a1

    static int file[] = { 2, 1, -1, -2, -2, -1, 1, 2 }; // Here file and rank are literal reference to the use of
    // chess
    static int rank[] = { -1, -2, -2, -1, 1, 2, 2, 1 };// notations used to locate a piece's location

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
        int[] arrleast = { 11, 11, 11, 11, 11, 11, 11, 11 };
        int least = 9;
        // for (int i = 0; i < checkMoveNumber.length; i++) {
        // System.out.println(checkMoveNumber[i]);
        // }
        for (int i = 0; i < checkMoveNumber.length; i++) {
            if (checkMoveNumber[i] < 9) {
                if (checkMoveNumber[i] < least) {

                    least = checkMoveNumber[i];
                    for (int j = 0; j < i; j++) {
                        arrleast[j] = 10;
                    }
                    arrleast[i] = i;
                } else if (checkMoveNumber[i] == least) {
                    arrleast[i] = i;
                }
            }

        }
        // System.out.println("Arrleast");
        // for (int i = 0; i < arrleast.length; i++) {

        // System.out.println(arrleast[i]);
        // }
        Random random = new Random();
        do {
            int move = random.nextInt(8);
            for (int i = 0; i < checkMoveNumber.length; i++) {
                if (arrleast[i] == move) {
                    return move;
                }
            }
        } while (true);
    }

    public static void main(String args[]) {

        // for (int b = 0; b < 8; b++) {
        int count = 0;

        do {

            System.out.printf("The knight is at location: %c %d\n", returnfile(currentFile), currentRank + 1);

            count += 1;

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
                    checkMoveNumber[i] = 9;
                    checkLegalMoves -= 1;

                } else if (chessboard[checkRank][checkFile] == 11) {

                    checkMoveNumber[i] = 9;
                    checkLegalMoves -= 1;

                } else {
                    chessboard[checkRank][checkFile] -= 1;
                    checkMoveNumber[i] = chessboard[checkRank][checkFile];
                }

            }
            if (checkLegalMoves == 0) {
                System.out.println("No legal moves available.");
                System.out.printf("The knight is at location: %c %d\n", returnfile(currentFile),
                        currentRank + 1);
                System.out.println("Total moves played: " + (count - 1));
                break;

            } else {
                chessboard[currentRank][currentFile] = 11;
                int moveNumber = getMove(checkMoveNumber);
                currentRank += rank[moveNumber];
                currentFile += file[moveNumber];
                System.out.println("Movenumber: " + moveNumber);
                System.out.printf("The knight is at location: %c %d\n", returnfile(currentFile),
                        currentRank + 1);
                chessboard[currentRank][currentFile] = 11;

            }

        } while (count != 64);

    }
}