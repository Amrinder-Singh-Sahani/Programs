import java.util.Scanner;

// 1. Write a program to display a message using printf statement
// 2. Take two double floating point input from user and apply
// addition,subtraction,multiplication on given numbers. Do write method for each
// task and display output using printf()

class meth {

    float a, b;

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    void add() {
        float addition = a + b;
        System.out.printf("The addition is: %f\n", addition);
    }

    void subtraction() {
        float sub = a - b;
        System.out.printf("The subtraction is: %f\n", sub);
    }

    void multiplication() {
        float mul = a * b;
        System.out.printf("The multiplication is: %f\n", mul);
    }
}

public class classwork {

    public static void main(String args[]) {

        // Ans 1 :-

        // System.out.printf("This is a Java program");

        // Ans 2 :-

        float i, j;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter first number: ");
        i = x.nextFloat();
        System.out.println("Enter second number: ");
        j = x.nextFloat();
        meth ob = new meth();
        ob.setA(i);
        ob.setB(j);
        ob.add();
        ob.subtraction();
        ob.multiplication();

    }
}