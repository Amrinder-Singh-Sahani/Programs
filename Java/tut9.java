import java.util.Scanner;

// Declaring and calling an user defined func
public class tut9 {

    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;

        } else {
            z = (x + y) * 5;

        }
        return z;

    }

    public static void main(String args[]) {

        int a = 5;
        int b = 7;
        int c;
        c = logic(a, b);
        System.out.println(c);

        // A method can be called by creating an object of the class in which the method
        // exists
        // followed by the method call:

        // class_name obj = new class_name();
        // obj.logic(a,b); "Used the word (logic) and the integers in the parenthesis
        // coz they were in the example above."
        // This is the syntax to call a user defined func if you do not use (static)
        // while declaring the
        // func.

    }

}