
/* Write methods that accomplish each of the following tasks:
1) Check whether the string is terminated by a full stop,
and if not, add a full stop.
2) Check whether the string starts with a capital letter, and
if not, capitalize the first letter.
3) Use the methods developed in parts 1 and 2 and to write a method 
beautifyString that receives a string from the user, and then calls 
the methods in 1 and 2 to make sure that string is properly formatted,
in other words, the string has a full stop at the end, and a 
capitalized first letter. Make sure you output the string after it has
been beautified.
 */
import java.util.Scanner;

public class cw4_9_BeautifyString {

    static String checkEnd(String str) {
        int a = str.length() - 1;
        if (str.charAt(a) != '.') {
            return str + ".";

        } else {
            return str;

        }
    }

    static void checkStart(String str) {
        String a = str.substring(0, 1);

        if (a.equalsIgnoreCase("a")) {
            System.out.println("A" + str.substring(1, str.length()));
        } else if (a.equalsIgnoreCase("b")) {
            System.out.println("B" + str.substring(1, str.length()));
        } else if (a.equalsIgnoreCase("c")) {
            System.out.println("C" + str.substring(1, str.length()));
        } else if (a.equalsIgnoreCase("d")) {
            System.out.println("D" + str.substring(1, str.length()));
        } else if (a.equalsIgnoreCase("e")) {
            System.out.println("E" + str.substring(1, str.length()));
        } else if (a.equalsIgnoreCase("f")) {
            System.out.println("F" + str.substring(1, str.length()));
        } else if (a.equalsIgnoreCase("g")) {
            System.out.println("G" + str.substring(1, str.length()));
        } else if (a.equalsIgnoreCase("h")) {
            System.out.println("H" + str.substring(1, str.length()));
        } else if (a.equalsIgnoreCase("i")) {
            System.out.println("I" + str.substring(1, str.length()));
        } else if (a.equalsIgnoreCase("j")) {
            System.out.println("J" + str.substring(1, str.length()));
        } else if (a.equalsIgnoreCase("k")) {
            System.out.println("K" + str.substring(1, str.length()));
        } else if (a.equalsIgnoreCase("l")) {
            System.out.println("L" + str.substring(1, str.length()));
        } else if (a.equalsIgnoreCase("m")) {
            System.out.println("M" + str.substring(1, str.length()));
        } else if (a.equalsIgnoreCase("n")) {
            System.out.println("N" + str.substring(1, str.length()));
        } else if (a.equalsIgnoreCase("o")) {
            System.out.println("O" + str.substring(1, str.length()));
        } else if (a.equalsIgnoreCase("p")) {
            System.out.println("P" + str.substring(1, str.length()));
        } else if (a.equalsIgnoreCase("q")) {
            System.out.println("Q" + str.substring(1, str.length()));
        } else if (a.equalsIgnoreCase("r")) {
            System.out.println("R" + str.substring(1, str.length()));
        } else if (a.equalsIgnoreCase("s")) {
            System.out.println("S" + str.substring(1, str.length()));
        } else if (a.equalsIgnoreCase("t")) {
            System.out.println("T" + str.substring(1, str.length()));
        } else if (a.equalsIgnoreCase("u")) {
            System.out.println("U" + str.substring(1, str.length()));
        } else if (a.equalsIgnoreCase("v")) {
            System.out.println("V" + str.substring(1, str.length()));
        } else if (a.equalsIgnoreCase("w")) {
            System.out.println("W" + str.substring(1, str.length()));
        } else if (a.equalsIgnoreCase("x")) {
            System.out.println("X" + str.substring(1, str.length()));
        } else if (a.equalsIgnoreCase("y")) {
            System.out.println("Y" + str.substring(1, str.length()));
        } else if (a.equalsIgnoreCase("z")) {
            System.out.println("Z" + str.substring(1, str.length()));
        }
    }

    static void beautifyString() {
        System.out.println("Enter your string: ");
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        System.out.println("Beautified string is: ");
        checkStart(checkEnd(a));
    }

    public static void main(String args[]) {

        // checkEnd("My name is Amrinder.");
        // checkStart("my name is amrinder");

        beautifyString();

    }
}