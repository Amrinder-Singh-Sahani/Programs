/* Write a method isMultiple that determines, for a pair
of integers, whether the second integer is a multiple of 
the first. The method should take two integer arguments and 
return true if the second is a multiple of the first and false
otherwise.Incorporate this method into an application that inputs 
a series of pairs of integers (one pair at a time) and determines 
whether the second value in each pair is a multiple of the first.
 */

public class cw4_8_Multiples {

    static boolean isMultiple(int a, int b) {
        if (b % a == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String args[]) {
        int a[][] = { { 12, 60 }, { 13, 78 }, { 7, 21 }, { 34, 22 }, { 532, 25 } };
        for (int i = 0; i < 5; i++) {
            System.out.println(isMultiple(a[i][0], a[i][1]));
        }

    }
}