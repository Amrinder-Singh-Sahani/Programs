/* Intuition may suggest that you should attempt
to move the knight to the most troublesome
squares first and leave open those that are easier
to get to, so that when the board gets congested near
the end of the tour, there will be a greater chance of
success.
We could develop an "accessibility heuristic" by classifying
each of the squares according to how accessible it is and always
moving the knight(using the knight's L shaped moves) to the most
inaccessible square. We label a two dimensional array accessibility
with numbers indicating from how many squares each particular square
is accessible. On a blank chessboard, each of the 16 squares nearest 
the centre is rated as 8, each corner square is rated as 2, and the 
other squares have accessibility numbers of 3,4 or 6 as follows:
8    2   3   4   4   4   4   3   2
7    3   4   6   6   6   6   4   3
6    4   6   8   8   8   8   6   4
5    4   6   8   8   8   8   6   4
4    4   6   8   8   8   8   6   4
3    4   6   8   8   8   8   6   4
2    3   4   6   6   6   6   4   3
1    2   3   4   4   4   4   3   2

     a   b   c   d   e   f   g   h
Write a new version of the Knight's Tour using the accessibility
heuristic. The knight should always move to the square with the lowest
accessibility number. In case of a tie, the knight may move to any of
the tied squares. Therefore, the tour may begin in any of the four corners
[Note: As the knight moves around the chessboard, your program should reduce
the accessibility numbers as more squares become occupied. In this way, 
at any given time during the tour, each available square's accessibility
number will remain equal to precisely the number of squares from which 
that square may be reached.] Run this version of your application.
Did you get a full tour? Modify the application to run 64 tours, one
starting from each square of the chessboard. How many full tours did 
you get?
 */

import java.util.Random;

public class cw5_10_KnightTour2 {

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

        int countTours = 0;
        do {
            // for (int b = 0; b < 8; b++) {

            int chessboard[][] = {
                    { 2, 3, 4, 4, 4, 4, 3, 2 },
                    { 3, 4, 6, 6, 6, 6, 4, 3 },
                    { 4, 6, 8, 8, 8, 8, 6, 4 },
                    { 4, 6, 8, 8, 8, 8, 6, 4 },
                    { 4, 6, 8, 8, 8, 8, 6, 4 },
                    { 4, 6, 8, 8, 8, 8, 6, 4 },
                    { 3, 4, 6, 6, 6, 6, 4, 3 },
                    { 2, 3, 4, 4, 4, 4, 3, 2 } };

            int count = 0, checkLegalMoves = 8;
            int currentRank = 0, currentFile = 0; // Knight set to location a1

            int file[] = { 2, 1, -1, -2, -2, -1, 1, 2 }; // Here file and rank are literal reference to the use of
                                                         // chess
            int rank[] = { -1, -2, -2, -1, 1, 2, 2, 1 };// notations used to locate a piece's location
            do {

                System.out.printf("The knight is at location: %c %d\n", returnfile(currentFile), currentRank + 1);

                count += 1;
                int checkMoveNumber[] = { 1, 1, 1, 1, 1, 1, 1, 1 };

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
            countTours += 1;
            if ((currentRank == 1 && currentFile == 2) || (currentRank == 2 && currentFile == 1)) {
                System.out.println("Closed Tour complete");
                System.out.println("Tours required: " + countTours);
                break;
            }
            // if (count == 64) {
            // countTours += 1;
            // }
            // }

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