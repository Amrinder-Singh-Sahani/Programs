/* The turtle holds a pen in one of two positions,
up or down. While the pen is down, the turtle traces out
shape as it moves, and while the pen is up, the turtle moves
about freely without writing anything. In the problem, you'll
simulate the operation of the turtle and create a computerized
sketchpad.
Use a 20 by 20 array floor that's initialized to zeros. Read 
commands from an array that contains them. Keep track of the current
position of the turtle at all times and whether the pen is currently
up or down. Assume that the turtle always starts at position(0,0) of 
the floor with its pen up. The set of the turtle commands your 
application must process are shown:
    Command      Meaning
    1            Pen up
    2            Pen down
    3            Turn right
    4            Turn left
    5,10         Move forward 10 spaces(replace 10 for a different number spaces)
    6            Display the 20 by 20 grid
    9            End of data (Sentinel)

    At line 7-8, does it mean i have to create an array and store commands in it?

Suppose that the turtle is somewhere near the centre of the floor.
The following "program" would draw and display a 12 by 12 square, 
leaving the pen in the up position
2
5,12
3
5,12
3
5,12
3
5,12
1
6
9

As the turtle moves with the pen down, set the appropriate elements of array
floor to 1s. When the 6 command (display the array) is given, Wherever there's 
a 1 in the array, display an asterisk or any character you choose. Wherever
there's 0, display a blank.
Write an application the turtle graphics capabilities discussed here.
(Write several turtle graphics programs to draw interesting shapes. Add 
other commands to increase the power of your turtle graphics language.)

Should i use recursion in for this question?
 */

import java.util.Scanner;

public class cw5_9_TurtleGraphics {
    public static void main(String args[]) {

        // Scanner input = new Scanner(System.in);
        boolean pen = false;
        boolean[] ver = { false, false }, hz = { false, true };

        int x = 0, y = 0;

        int grid[][] = new int[20][20];
        int command[] = { 2, 5, 12, 3, 5, 12, 3, 5, 12, 3, 5, 12, 1, 6, 9 };

        for (int i = 0; i < command.length; i++) {
            if (command[i] == 1) {
                pen = false;
            } else if (command[i] == 2) {
                pen = true;
            } else if (command[i] == 3) {
                if (ver[0] == true && ver[1] == false) // face is up
                {
                    ver[0] = false;
                    ver[1] = false;
                    hz[0] = false;
                    hz[1] = true;
                    // face is right
                } else if (ver[0] == false && ver[1] == true) // face is down
                {
                    ver[0] = false;
                    ver[1] = false;
                    hz[0] = true;
                    hz[1] = false;
                    // face is left
                } else if (hz[0] == false && hz[1] == true) // face is right
                {
                    hz[0] = false;
                    hz[1] = false;
                    ver[0] = false;
                    ver[1] = true;
                    // face is down
                } else if (hz[0] == true && hz[1] == false) // face is left
                {
                    hz[0] = false;
                    hz[1] = false;
                    ver[0] = true;
                    ver[1] = false;
                    // face is up
                }
            } else if (command[i] == 4) {
                if (ver[0] == true && ver[1] == false) // face is up
                {
                    ver[0] = false;
                    ver[1] = false;
                    hz[0] = true;
                    hz[1] = false;
                    // face is left
                } else if (ver[0] == false && ver[1] == true) // face is down
                {
                    ver[0] = false;
                    ver[1] = false;
                    hz[0] = false;
                    hz[1] = true;
                    // face is right
                } else if (hz[0] == true && hz[1] == false) // face is left
                {
                    ver[0] = false;
                    ver[1] = true;
                    hz[0] = false;
                    hz[1] = false;
                    // face is down
                } else if (hz[0] == false && hz[1] == true) // face is right
                {
                    ver[0] = true;
                    ver[1] = false;
                    hz[0] = false;
                    hz[1] = false;
                    // face is up
                }
            } else if (command[i] == 5) {
                i += 1;
                if (ver[0]) {
                    for (int trace = 0; trace < command[i]; trace++) {

                        if (y == -1) {
                            y = 0;
                        } else if (y == 20) {
                            y = 19;
                        } else {
                            if (pen) {
                                grid[x][y] = 1;
                            }

                        }
                        y -= 1;
                        if (y == -1) {
                            y = 0;
                        }

                    }
                } else if (ver[1]) {
                    for (int trace = 0; trace < command[i]; trace++) {

                        if (y == 20) {
                            y = 19;
                        } else if (y == -1) {
                            y = 0;
                        } else {
                            if (pen) {
                                grid[x][y] = 1;
                            }
                        }
                        y += 1;
                        if (y == 20) {
                            y = 19;
                        }
                    }

                } else if (hz[0]) {
                    for (int trace = 0; trace < command[i]; trace++) {

                        if (x == -1) {
                            x = 0;
                        } else if (x == 20) {
                            x = 19;
                        } else {
                            if (pen) {
                                grid[x][y] = 1;
                            }
                        }
                        x -= 1;
                        if (x == -1) {
                            x = 0;
                        }

                    }

                } else {
                    for (int trace = 0; trace < command[i]; trace++) {

                        if (x == 20) {
                            x = 19;
                        } else if (x == -1) {
                            x = 0;
                        } else {
                            if (pen) {
                                grid[x][y] = 1;
                            }
                        }
                        x += 1;
                        if (x == 20) {
                            x = 19;
                        }

                    }
                }
            } else if (command[i] == 6) {
                for (int tracex = 0; tracex < grid.length; tracex++) {
                    for (int tracey = 0; tracey < grid.length; tracey++) {
                        if (grid[tracex][tracey] == 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
        }

    }
}