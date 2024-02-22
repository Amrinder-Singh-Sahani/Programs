import java.util.Scanner;

class base {
    int x;

    public void printme() {
        System.out.println("I am a constructor.");
    }

    public void setx(int x) {
        System.out.println("I am in base and setting x now.");
        this.x = x;
    }

    public int getx() {
        return x;
    }
}

class derived extends base {
    int y;

    public void sety(int y) {
        this.y = y;
    }

    public int gety() {
        return y;
    }
}

public class tut14 {
    public static void main(String[] args) {

        // Creating an object of base class
        base b = new base();
        b.setx(12);
        System.out.println(b.getx());

        // Creating an object of derived class
        derived d = new derived();
        d.setx(12);
        System.out.println(d.getx());
    }
}