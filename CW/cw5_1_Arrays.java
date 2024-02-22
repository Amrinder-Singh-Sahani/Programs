//  Question 1: Declare an array arr with five elements of
// type double and initialize it with the elements 3.4,7.8,
// 6.9,8.5 and 9.1.

// Question 2: Find the sum of 10 elements of int array b 
// using enchanced for statement

// Question 3: Copy a hundred element array a into a hundred 
// element array c, but in reverse order.

// Question 4: Compute the product of the third to the tenth
// elements, both inclusive, in a hundred element integer array w.

public class cw5_1_Arrays {
    public static void main(String args[]) {
        // Answer 1:

        double arr[] = { 3.4, 7.8, 6.9, 8.5, 9.1 };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Answer 2:

        int b[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;
        for (int number : b) {
            sum += number;
        }
        System.out.println("Summation of the elements in the array b is: " + sum);

        // Answer 3:

        int[] a = new int[100], c = new int[100];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            System.out.printf("a[%d] is %d\n", i, a[i]);
        }

        for (int i = 0; i < a.length; i++) {
            c[i] = a[(a.length - 1) - i];
            // System.out.printf("c[%d] is %d\n", i, c[i]);
        }

        for (int i : c) {
            System.out.println(i);
        }

        // Answer 4:

        int z[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int product = 1;
        for (int i = 2; i < 10; i++) {
            product *= z[i];
        }
        System.out.println(product);
    }

}