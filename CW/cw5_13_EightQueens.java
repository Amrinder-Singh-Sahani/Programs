/* Use the thinking developed in cw5_12 to formulate a heuristic
for solving the Eight Queens problem.
[Hint: Assign a value to each square of the chessboard to indicate
how many squares of an empty chessboard are "eliminated" if a queen
is placed in that square. Each of the corners would be assigned the 
value of 22. Once these "elimination numbers" are placed in all 64 
squares, an appropriate heuristic might be as follows: Place the next
queen in the square with the smallest elimination number.]
 */

public class cw5_13_EightQueens {
    public static void main(String args[]) {

        int chessboard[][] = { { 22, 22, 22, 22, 22, 22, 22, 22 },
                { 22, 24, 24, 24, 24, 24, 24, 22 },
                { 22, 24, 26, 26, 26, 26, 24, 22 },
                { 22, 24, 26, 28, 28, 26, 24, 22 },
                { 22, 24, 26, 28, 28, 26, 24, 22 },
                { 22, 24, 26, 26, 26, 26, 24, 22 },
                { 22, 24, 24, 24, 24, 24, 24, 22 },
                { 22, 22, 22, 22, 22, 22, 22, 22 } };

        int checkRank = 0, checkFile = 0;
    }
}