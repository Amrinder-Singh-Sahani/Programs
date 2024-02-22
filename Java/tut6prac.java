import java.util.Scanner;

public class tut6prac {
    public static void main(String args[]) {

        // Question 1 :- Write a program to out whether a student is pass or fail.
        // It requires total 40% and at least 33% in each subject to pass.
        // Assume 3 subjects and take marks as an input from the user.

        /*
         * float phy, m, chem, res;
         * System.out.println("Enter your marks in Physics: ");
         * Scanner marks = new Scanner(System.in);
         * phy = marks.nextFloat();
         * System.out.println("Enter your marks in Maths: ");
         * m = marks.nextFloat();
         * System.out.println("Enter your marks in Chemistry: ");
         * chem = marks.nextFloat();
         * 
         * res = (phy + m + chem) / 3;
         * 
         * if (res <= 44) {
         * System.out.printf("You failed the exam and the result is: %f", res);
         * } else {
         * 
         * if (phy <= 33.0) {
         * System.out.println("You failed the Physics exam.");
         * } else {
         * System.out.println("You passed the Physics exam.");
         * }
         * if (chem <= 33.0) {
         * System.out.println("You failed the Chemistry exam.");
         * } else {
         * System.out.println("You passed the Chemistry exam.");
         * }
         * if (m <= 33.0) {
         * System.out.println("You failed the Mathematics exam.");
         * } else {
         * System.out.println("You passed the Mathematics exam.");
         * }
         * System.out.printf("Your result is: %f", res);
         * }
         */

        // Question 2 :- Write a program to calculate income tax paid by an employee to
        // the government
        // as per the slabs mentioned below.
        // Income Slab Tax
        // 2.5L - 5.0L 5%
        // 5.0L - 10.0L 20%
        // Above 10.0L 30%

        /*
         * Scanner i = new Scanner(System.in);
         * float t;
         * System.out.println("Enter your Income: ");
         * float in = i.nextFloat();
         * 
         * if (in >= 250000 && in <= 500000) {
         * 
         * t = (in / 100) * 5;
         * System.out.println("Your income falls in the first slab.");
         * System.out.println("You paid Rs " + t);
         * } else if (in > 500000 && in <= 1000000) {
         * float n = in - 250000f;
         * t = (n / 100) * 20;
         * System.out.println("Your income falls in the second slab.");
         * System.out.println("You paid Rs " + t);
         * } else if (in > 1000000) {
         * float n = in - 250000f;
         * t = (n / 100) * 30;
         * System.out.println("Your income falls in the third slab.");
         * System.out.println("You paid Rs " + t);
         * } else {
         * System.out.
         * println("No, your income is less than 2.5L, you do not have to pay the tax."
         * );
         * }
         */

        // Question 3 :- Write a program to find out the day of the week given the
        // number
        // 1 for Monday, 2 for Tuesday .... etc.

        /*
         * System.out.println("Enter the day of the week: ");
         * Scanner d = new Scanner(System.in);
         * byte day = d.nextByte();
         * switch (day) {
         * case (1): {
         * System.out.println("It is Monday.");
         * break;
         * }
         * case (2): {
         * System.out.println("It is Tuesday.");
         * break;
         * }
         * case (3): {
         * System.out.println("It is Wednesday.");
         * break;
         * }
         * case (4): {
         * System.out.println("It is Thursday.");
         * break;
         * }
         * case (5): {
         * System.out.println("It is Friday.");
         * break;
         * }
         * case (6): {
         * System.out.println("It is Saturday.");
         * break;
         * }
         * case (7): {
         * System.out.println("It is Sunday.");
         * break;
         * }
         * default: {
         * System.out.println("Invalid Number.");
         * }
         * 
         * }
         */

        // Question 4 :- Write a program to find whether a year entered by the user is a
        // leap year or not.

        /*
         * System.out.println("Enter the year number: ");
         * Scanner y = new Scanner(System.in);
         * int year = y.nextInt();
         * 
         * if (year % 4 == 0) {
         * System.out.println("The entered year is a leap year.");
         * } else {
         * System.out.println("The entered year is not a leap year.");
         * }
         */

        // Question 5 :- Write a program to find out the type of website from the Url.
        // .com --> Commercial website
        // .org --> Organization website
        // .in --> Indian website

        System.out.println("Enter your website: ");
        Scanner w = new Scanner(System.in);
        String web = w.next();
        Boolean t = web.endsWith(".com");
        Boolean f = web.endsWith(".org");
        Boolean f1 = web.endsWith(".in");
        if (t == true) {
            System.out.println("It is a Commercial website.");
        } else if (f == true) {
            System.out.println("It is an Organizational website.");
        } else if (f1 == true) {
            System.out.println("It is an Indian website.");
        } else {
            System.out.println("No match found.");
        }

    }
}