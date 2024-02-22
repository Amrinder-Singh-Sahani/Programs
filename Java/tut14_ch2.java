class base {
    int x;

    base() {
        System.out.println("I am a constructor.");
    }

    base(int x) {
        System.out.println("I am an overloaded constructor with the value of x as: " + x);
    }

}

class derived extends base {
    int y;

    derived() {
        // super(12);

        System.out.println("I am a derived class constructor.");
    }

    derived(int x, int y) {
        super(x); // super is a reference used to refer immediate parent class object.
        // Can be used to refer immediate parent class instance variable
        // Can be used to invoke parent class methods
        // Can be used to invoke parent class constructors.
        System.out.println("I am an overloaded constructor of derived with the value of y as: " + y);
    }

}

class childofderived extends derived {
    childofderived() {
        System.out.println("I am a child of derived constructor,");
    }

    childofderived(int x, int y, int z) {
        super(x, y);
        System.out.println("I am an overloaded constructor of child of derived with the value of z as: " + z);
    }
}

public class tut14_ch2 {
    public static void main(String[] args) {
        // base n = new base();
        // derived n1 = new derived(); // When a derived class is extended from the base
        // class,
        // the constructor of the base class is executed first followed
        // by the constructor of the derived class.

        // derived n1 = new derived(14, 9);
        // childofderived cd = new childofderived();
        childofderived cd = new childofderived(12, 14, 15);
    }
}