import java.util.Random;

public class BinSch_and_GTN {
    static int ceil(float num) {
        float b = num % 1;
        num = num + 1 - b;

        return (int) (num);

    }

    public static void main(String args[]) {

        Random newnum = new Random();
        int a = newnum.nextInt(1001);
        // int a = 998;
        int max = 1000, min = 0, count = 0;
        System.out.println(a);
        int mid = 500;

        do {
            if (a < mid) {
                System.out.println(mid + " Too high");
                System.out.printf("Max is %d and Min is %d\n", max, min);
                max = mid;
                int temp = (mid - min) / 2;
                mid = mid - temp;
                if (mid - a == 1) {
                    mid = a;
                }
                count++;

            } else if (a > mid) {
                System.out.println(mid + " Too low ");
                System.out.printf("Max is %d and Min is %d\n", max, min);
                min = mid;
                int newmid = (max - mid) / 2;
                mid = mid + newmid;
                if (a - mid == 1) {
                    mid = a;
                }
                count++;

            }
        } while (mid != a);

        System.out.println(mid + " Congratulations");
        System.out.printf("You found the answer in %d turns", count);
    }
}