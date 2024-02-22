/* PI = 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11
Print a table that shows the value of PI approximated 
by computing the first 200,000 terms of the series.
 */

public class cw4_3_PIseries {
    public static void main(String args[]) {
        double a = 4, b = -4, add = 0, sub = 0;
        int subcount = 3, count = 1;
        for (int i = 1; i <= 1000000; i++) {

            add = (a / count) + add;
            sub = (b / subcount) + sub;
            count = count + 4;
            subcount = subcount + 4;
        }
        double res = add + sub;
        System.out.println(res);
        // System.out.println(add);
        // System.out.println(sub);
        System.out.println(Math.PI);

    }
}