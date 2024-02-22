import java.util.Scanner;

public class tut7 {
    public static void main(String args[]) {

        Scanner a = new Scanner(System.in);
        System.out.println("Enter how many odd numbers you want to print: ");
        int a1 = a.nextInt();
        if (a1 <= 0) {
            System.out.println("Please enter a natural number!");
        } else {

            System.out.println("Here are the numbers: ");
            for (int i = 1; i <= a1; i++) {
                int b = (2 * i) - 1;
                System.out.println(b);
            }

        }
    }
}