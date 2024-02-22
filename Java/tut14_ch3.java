class ekclass {
    int a;

    ekclass(int v) {
        this.a = v;
    }

    public int getA() {
        return a;
    }

    public int returnone() {

        return 1;
    }

}

class doclass extends ekclass {
    doclass(int c) {
        super(c);
        System.out.println("I am a constructor.");
    }
}

public class tut14_ch3 {
    public static void main(String[] args) {
        ekclass e = new ekclass(65);
        System.out.println(e.getA());

        doclass d = new doclass(5);
        System.out.println(d.getA());
    }
}