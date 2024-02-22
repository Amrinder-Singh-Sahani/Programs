import java.util.Scanner;

public class tut5prac {
    public static void main(String args[]) {
        // Question 1 :- Write a program to convert a string to lowercase letters.

        String a = "ComPUTer";
        System.out.println(a.toLowerCase());

        // Question 2 :- Write a program to replace spaces with underscores.

        String as = "Computer program is good";
        System.out.println(as.replace(" ", "_"));

        // Question 3 :- Write a program to fill in a letter template which looks like
        // below
        // letter = "Dear <|name|>, thanks a lot".
        // Replace <|name|> with another string or your name.

        String sda = "Dear name, Thanks a lot!";
        System.out.println(sda.replace("name", "Amrinder"));

        // Question 4 :- Write a program to detect double and tripple spaces in a
        // string.

        String str = "This string contains double  and tripple   spaces";
        System.out.println("This is the index of double space string: " + str.indexOf("  "));
        System.out.println("This is the index of tripple spacce string: " + str.indexOf("   "));

        // Question 5 :- Write a program to format the following letter using escape
        // sequence characters.
        // letter = "Dear Harry, This Java Course Is Nice Thanks"

        String letter = "Dear Harry,\n\tThis Java Course Is Nice.\n\tThanks!";
        System.out.println(letter);

    }
}