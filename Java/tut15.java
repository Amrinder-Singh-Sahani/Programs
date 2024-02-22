abstract class parent {
    parent() {
        System.out.println("I am a constructor of base.");
    }

    public void hello() {
        System.out.println("Hello");
    }

    abstract public void greet();
}

abstract class child extends parent {
    @Override
    public void greet() {
        System.out.println("Good morning");
    }
}

class child2 extends parent {
    public void th() {
        System.out.println("I am good");
    }
}

public class tut15 {
    public static void main(String[] args) {

    }
}