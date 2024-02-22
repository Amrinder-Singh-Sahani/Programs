import java.util.Scanner;

public class tut4 {

    public static void main(String args[]) {

        String name = new String("Harry"); // In java a string is a class.
                                           // It is not a primitive datatype but in java
                                           // string has a special support so it can
                                           // be used as a primitive datatype.

        System.out.println(name);
        String name1 = "Jerry";
        System.out.println(name1);
        // Strings are immutable and cannot be changed. You cannot cahnge the string
        // inside the
        // memory. Like here it is Jerry in the var (name1) which is the name of the
        // memory location
        // where the string ("Jerry") is stored.

        int z = 12;
        float f = 13.22f;
        System.out.printf("The value of a is %5d and the value of f is %f ", z, f);
        System.out.println();
        // There are functions like (printf) and (format) available to print your data.
        // But when you use these funcs they do not provide a new line, like when you
        // get one when
        // you use (println).
        System.out.format("The value of a is %d and the value of f is %f ", z, f);

        System.out.println();
        Scanner st = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String st1 = st.next();
        // (next) func intakes only the first word you enter and ignores rest of the
        // sentence.
        System.out.print("This is your string: ");
        System.out.println(st1);

        System.out.println("Enter your sentence: ");

        Scanner st2 = new Scanner(System.in);
        // Whenever you want to take a new string as an input you have to make a new
        // func
        // to store the new string. This is why it was said that string is immutable
        // because you cannot store another string in the very first Scanner var
        // which was declared originally.

        String st3 = st2.nextLine();
        // But if you use the func (nextLine) it will store the whole sentence.

        System.out.println("This is your sentence: ");
        System.out.println(st3);

    }
}
