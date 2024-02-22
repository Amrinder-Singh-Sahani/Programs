import java.util.Scanner;

public class splittingIntegers {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a four digit number: ");
        int a = input.nextInt();
        int b = 0, b2 = 0, b3 = 0, b4 = 0;

        if (a % 10 != 0 && b == 0) {
            b = a % 10;
            // System.out.print(b + "\t");
            a = (a - b) / 10;
        }

        if (a % 10 != 0 && b2 == 0) {
            b2 = a % 10;
            // System.out.print(b2 + "\t");
            a = (a - b2) / 10;
        }

        if (a % 10 != 0 && b3 == 0) {
            b3 = a % 10;
            // System.out.print(b3 + "\t");
            a = (a - b3) / 10;
        }

        if (a % 10 != 0 && b4 == 0) {
            b4 = a % 10;
            // System.out.print(b4 + "\t");
            // a = (a - b4) / 10;
        }

        System.out.print(b4 + "\t");
        System.out.print(b3 + "\t");
        System.out.print(b2 + "\t");
        System.out.print(b + "\t");
    }
}