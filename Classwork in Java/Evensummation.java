public class Evensummation {
    public static void main(String args[]) {
        // Summing the even integers from 2 to 20

        int b = 0;
        for (int i = 1; i <= 10; i++) {
            b = (2 * i) + b;
            System.out.println(b);
        }
    }
}