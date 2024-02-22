/* Question 1: Write an application that calculates the average of 
a series of integers that are passed to method average
using a variable length argument list. Test your method 
with several calls, each with a different number of arguments.
 */

public class cw5_3_VariableLengthArgumentList {

    static float average(int[] num) {
        int average = 0;
        for (int i : num) {
            average += i;
        }

        return (float) (average / num.length);

    }

    public static void main(String args[]) {

        int[] a = { 1, 2, 3, 4, 5, 6 }, b = { 12, 14 };
        System.out.println(average(a));
        System.out.println(average(b));

    }
}