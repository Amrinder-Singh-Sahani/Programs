/* a) Develop an application that will move the knight 
around a chessboard. The board is represented by an
eight by eight two dimensional array board. Each square
is initialized to zero. We describe each of the eight possible
moves in terms of its horizontal and vertical components. For
example, a move of type 0 consists of moving two squares 
horizontally to the right and one square vertically upward.
A move of type 2 consists of moving one square horizontally to 
the left and two squares vertically. Horizontal moves to the 
left and vertical moves upwards are indicated with negative numbers.
The eight moves may be described by two one dimensional array,
horizontal and vertical, as follows:
    horizontal[0] = 2        vertical[0] = -1
    horizontal[1] = 1        vertical[1] = -2
    horizontal[2] = -1       vertical[2] = -2
    horizontal[3] = -2       vertical[3] = -1
    horizontal[4] = -2       vertical[4] = 1
    horizontal[5] = -1       vertical[5] = 2
    horizontal[6] = 1        vertical[6] = 2
    horizontal[7] = 2        vertical[7] = 1

Let the variable currentRow and currentColumn indicate the row
and column respectively, of the knight's current position. To make
a move of type moveNumber where moveNumber is between 0 and 7, your
application should use the statements
    currentRow += vertical[moveNumber];
    currentColumn += horizontal[moveNumber];

Write an application to move the knight around the chessboard.
Keep a counter that varies 1 to 64. Record the latest count 
in each square the knight moves to. Test each potential move 
to see if the knight has already visited that square. Test
every potential move to ensure that the knight does not land
off the chessboard. Run the application. How many moves did 
the knight make?

*/

import java.util.Scanner;

public class cw5_10_KnightTour1 {

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

    static int chessboard[][] = new int[8][8];
    static int file[] = { 2, 1, -1, -2, -2, -1, 1, 2 }; // Here file and rank are literal reference to use of chess
    static int rank[] = { -1, -2, -2, -1, 1, 2, 2, 1 };// notations used to locate a piece's location

    static int currentRank = 4, currentFile = 4; // changed currentRow to currentRank and
    // currentColumn to currentFile for better readability.
    // Currently the knight's location is set to e5, as given in the question

    static int count = 0, checkLegalMoves = 8;

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        do {

            System.out.printf("The knight is at location: %c %d\n", returnfile(currentFile), currentRank + 1);

            count += 1;
            int checkMoveNumber[] = { 1, 1, 1, 1, 1, 1, 1, 1 };

            int moveNumber = input.nextInt();
            int checkRank;
            int checkFile;
            checkLegalMoves = 8;
            int outOfBounds[] = { 0, 0, 0, 0, 0, 0, 0, 0 };
            for (int i = 0; i < 8; i++) {
                checkRank = currentRank;
                checkFile = currentFile;
                checkRank = checkRank + rank[moveNumber];
                checkFile = checkFile + file[moveNumber];
                if (checkRank > 7 || checkRank < 0 || checkFile > 7 || checkFile < 0) {
                    checkMoveNumber[i] = 0;
                    outOfBounds[i] = 1;
                    checkLegalMoves -= 1;

                } else {
                    if (chessboard[checkRank][checkFile] != 0) {
                        checkMoveNumber[i] = 0;

                        checkLegalMoves -= 1;
                    }
                }

            }
            if (checkLegalMoves == 0) {
                System.out.println("No legal moves available.");
                System.out.printf("The knight is at location: %c %d\n", returnfile(currentFile), currentRank + 1);
                System.out.println("Total moves played: " + (count - 1));

            } else if (checkMoveNumber[moveNumber] == 0) {
                if (outOfBounds[moveNumber] == 1) {
                    System.out.println("The move goes out of bounds");
                } else {
                    System.out.println("The knight has already moved there once");
                }
                count -= 1;
            }

            else {
                currentRank += rank[moveNumber];
                currentFile += file[moveNumber];
                chessboard[currentRank][currentFile] = count;

            }

        } while (checkLegalMoves != 0 || count == 64);

        input.close();

    }
}