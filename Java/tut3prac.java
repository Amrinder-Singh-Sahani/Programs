import java.util.Scanner;

public class tut3prac {

    public static void main(String args[]) {
        // (Practice Set by Harry) Calculate percentage of a student, take marks as
        // inputs from the user.
        Scanner marks = new Scanner(System.in);
        float a1, a2, a3, a4, a5;
        System.out.println("Enter your marks in marks in sub1: ");
        a1 = marks.nextFloat();

        System.out.println("Enter your marks in sub2:");
        a2 = marks.nextFloat();

        System.out.println("Enter your marks in sub3:");
        a3 = marks.nextFloat();

        System.out.println("Enter your marks in sub4:");
        a4 = marks.nextFloat();

        System.out.println("Enter your marks in sub5:");
        a5 = marks.nextFloat();

        float avg = ((a1 + a2 + a3 + a4 + a5) / 500) * 100;
        // float avg1 = avg / 5;
        // float avg2 = avg1 * 100;

        System.out.println("Your score =");
        System.out.print(avg);
        System.out.println("%");

    }
}
