class phone {

    phone() {
        System.out.println("This is constructor of class phone");
    }

    public void greet() {
        System.out.println("Good morning");
    }

    public void on() {
        System.out.println("Turning on phone");
    }

}

class smartphone extends phone {

    smartphone() {
        System.out.println("This is constructor of class smartphone");
    }

    public void on() {
        System.out.println("Turning on smartphone");
    }

    public void welcome() {
        System.out.println("Your welcome");
    }

}

public class tut14_ch5 {
    public static void main(String[] args) {
        // phone obj = new phone();
        // obj.on();
        phone obj1 = new smartphone();
        obj1.on();
        // obj1.welcome(); // When the reference is super class and the object is
        // assigned to sub class
        // you cannot call a method which is in the sub class and not in the super
        // class.
        // Exception :- Constructor of the sub class.

    }
}