interface bicycle {
    int a = 45;

    void applybrake();

    void speedup();
}

class avoncycle implements bicycle {
    void blowhorn() {
        System.out.println("Horn...");
    }

    public void applybrake() // When you implement an interface class, you have to
                             // declare the methods using public access modifier or using
                             // this methods as abstract.
    {
        System.out.println("Applying brake");
    }

    public void speedup() {
        System.out.println("Applying speedup.");
    }
}

public class tut16 {
    public static void main(String[] args) {
        avoncycle cycle = new avoncycle();
        cycle.applybrake();
        // You can create properties in interface
        System.out.println(cycle.a);
        // You cannot modify the properties in interface as they are final.
        // cycle.a = 12;

    }
}