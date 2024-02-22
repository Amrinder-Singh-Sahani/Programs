import java.util.Scanner;

public class tut8prac {
    public static void main(String args[]) {

        // Question 1 :- Write a program to create an array of five flats and calculate
        // their sum.

        // Scanner a = new Scanner(System.in);
        // int[] flats = new int[5];
        // for (int i = 0; i < flats.length; i++) {
        // System.out.println("Enter the flat number: ");
        // int flatno = a.nextInt();
        // flats[i] = flatno;
        // }
        // int sum = 0;
        // for (int j = 0; j < flats.length; j++)

        // {
        // sum = sum + flats[j];

        // }
        // System.out.println("The summation of flat number is: " + sum);

        // Question 2 :- Write a program to find out whether a given integer is present
        // in an array or not

        // Scanner a = new Scanner(System.in);
        // System.out.println("Enter your number: ");
        // int f = a.nextInt();
        // int[] array = { 1, 2, 4, 5, 6 };
        // boolean f1 = false;
        // for (int b : array) {
        // if (f == b) {
        // f1 = true;
        // break;

        // }

        // }
        // if (f1 == true) {
        // System.out.println("Yes, the number is present in the array.");
        // } else {
        // System.out.println("No, the number is not present in the array.");
        // }

        // Question 3 :- Write a program to calculate the average marks from an array
        // containing
        // marks of all subjects in an exam using for-each loop.

        // Scanner a = new Scanner(System.in);
        // int[] marks = new int[5];

        // for (int i = 0; i < marks.length; i++) {
        // System.out.printf("Enter your marks in sub %d: ", i + 1);
        // int m = a.nextInt();
        // marks[i] = m;

        // }

        // float sum = 0;
        // for (int j : marks)

        // {
        // sum = sum + j;

        // }
        // System.out.println("The average of your marks is: " + sum / 5);

        // Question 4 :- Write a program to to add two matrices of size 2X3

        // Scanner a = new Scanner(System.in);

        // int[][] mat = new int[2][3];
        // int[][] mat2 = new int[2][3];
        // int[][] mat3 = new int[2][3];
        // for (int i = 0; i < mat.length; i++) {
        // for (int j = 0; j <= mat.length; j++) {
        // System.out.print("Enter elements in mat1: ");
        // int m = a.nextInt();
        // mat[i][j] = m;
        // }
        // System.out.println();
        // }
        // for (int k = 0; k < mat2.length; k++) {
        // for (int l = 0; l <= mat2.length; l++) {
        // System.out.print("Enter the elements in mat2: ");
        // int m1 = a.nextInt();
        // mat2[k][l] = m1;
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < mat.length; i++) {
        // for (int j = 0; j <= mat.length; j++) {
        // mat3[i][j] = mat[i][j] + mat2[i][j];
        // System.out.print(" " + mat3[i][j]);
        // }
        // System.out.println();
        // }

        // Question 5 :- Write a program to reverse an array

        // int[] a = { 1, 2, 3, 4, 5 };

        // int l = a.length;
        // int n = Math.floorDiv(l, 2); // The func Math.floorDiv() gives the number
        // entered in the parenthesis
        // // and gives an integer value. If the the var is given a data type
        // // other then int it will still return an integer value.

        // int temp;

        // for (int i = 0; i < n; i++) {
        // temp = a[i];
        // a[i] = a[l - i - 1];
        // a[l - i - 1] = temp;

        // }

        // for (int element : a) {
        // System.out.println(element + " ");
        // }

        // Question 6 :- Write a program to find the maximum element in an array

        // int[] a = { 1, 2, 3, 4, 5 };
        // int max = 0;
        // for (int e : a) {
        // if (e > max) {
        // max = e;
        // }
        // }
        // System.out.println("The value of the largest element is: " + max);

        // Question 7 :- Write a program to find the minimum element in an array

        // int[] a = { 1, 2, 3, 4, 5 };
        // int max = Integer.MAX_VALUE;

        // for (int e : a) {
        // if (e < max) {
        // max = e;
        // }
        // }
        // System.out.println("The minimum element in the array is: " + max);

        // Question 8 :- Write a program to find whether an array is sorted or not

        int[] a = { 1, 2, 3, 5, 4 };
        boolean b = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                b = false;
                break;

            }

        }
        if (b) {
            System.out.println("The aray is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}