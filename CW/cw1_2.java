import java.util.Scanner;

public class cw1_2 {
    public static void main(String args[]) {

        // Question 10 :- Write a program that inputs five numbers and
        // determines and prints the number of negative numbers input,
        // the number of positive numbers input and the number of zeros input

        // int a, b, c, d, e, countneg = 0, countpos = 0;
        // Scanner g = new Scanner(System.in);
        // System.out.println("Enter your first number:");
        // a = g.nextInt();
        // System.out.println("Enter your second number:");
        // b = g.nextInt();
        // System.out.println("Enter your third number:");
        // c = g.nextInt();
        // System.out.println("Enter your fourth number:");
        // d = g.nextInt();
        // System.out.println("Enter your fifth number:");
        // e = g.nextInt();
        // if (a < 0) {
        // countneg++;
        // } else {
        // countpos++;
        // }
        // if (b < 0) {
        // countneg++;
        // } else {
        // countpos++;
        // }
        // if (c < 0) {
        // countneg++;
        // } else {
        // countpos++;
        // }
        // if (d < 0) {
        // countneg++;
        // } else {
        // countpos++;
        // }
        // if (e < 0) {
        // countneg++;
        // } else {
        // countpos++;
        // }

        // System.out.printf("The number of positive integers are %d\n", countpos);
        // System.out.printf("The number of negative integers are %d\n", countneg);
        // ------------------------------------------------------------------------

        // Question 11 :- Create a BMI calculator that reads the user's weight
        // in Kgs and height in cms, then calculate and display the user's
        // BMI. Also, display the BMI categories and their values from the
        // National Heart Lung and Blood Institute.

        float height, weight;
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your height in Centimeters: ");
        height = a.nextFloat();
        System.out.println("Enter your weight in Kilograms: ");
        weight = a.nextFloat();
        float bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi * 10000);
        if (bmi * 10000 < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi * 10000 == 18.5 || bmi * 10000 < 24.9) {
            System.out.println("You are healthy.");
        } else {
            System.out.println("You are obese.");
        }

    }
}