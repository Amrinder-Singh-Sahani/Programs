import java.util.Scanner;

public class tut8 {
    public static void main(String args[]) {

        Scanner a = new Scanner(System.in);
        System.out.println("How many subject's marks you want to enter: ");
        int x = a.nextInt();
        int[] marks = new int[x];
        int m = 1;
        for (int i = 0; i <= x - 1; i++) {

            System.out.printf("Enter the marks for sub %d:\n", m);
            marks[i] = a.nextInt();
            m++;
        }
        int n = 1;
        for (int j = 0; j <= x - 1; j++) {
            System.out.printf("Your marks in sub %d is : %d\n", n, marks[j]);
            n++;

            int[] marks1 = { 86, 74, 95, 34, 43 };

            System.out.println(marks1.length); // .length func prints the length of the array you created.

            // This loop is called for-each loop.
            // In this loop you have to declare a variable enter a colon and then the name
            // of the array you want to print

            for (int z : marks1) {
                System.out.println(z);
            }

        }

    }
}