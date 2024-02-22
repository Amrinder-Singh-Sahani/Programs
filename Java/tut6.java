import java.util.Scanner;

public class tut6 {
    public static void main(String args[]) {

        float a, b, c;
        String ch;
        System.out.println("Enter your first number: ");
        Scanner j = new Scanner(System.in);
        a = j.nextFloat();
        System.out.println("Enter your second number: ");
        b = j.nextFloat();
        System.out.println("What operation do you want to perform: ");
        ch = j.next();

        switch (ch) {
            case "add": {
                c = a + b;
                System.out.println("Your addition is: " + c);
                break;
            }
            case "sub": {
                c = a - b;
                System.out.println("Your subtraction is: " + c);
                break;
            }
            case "mul": {
                c = a * b;
                System.out.println("Your multiplication is: " + c);
                break;
            }
            case "div": {
                c = a / b;
                System.out.println("Your division is: " + c);
                break;
            }
            case "rem": {
                c = a % b;
                System.out.println("Your remainder is: " + c);
                break;
            }
            default: {
                System.out.println("Invalid Operation.");

            }
        }
    }
}