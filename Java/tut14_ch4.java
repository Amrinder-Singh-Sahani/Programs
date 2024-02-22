class a {
    public int harry() {
        return 4;
    }

    public void meth2() {
        System.out.println("I am method 2 of class A");
    }
}

class b extends a {
    @Override
    public void meth2() {
        System.out.println("I am method 1 of class B");
    }

    public void meth3() {
        System.out.println("I am method 2 of class B");
    }
}

public class tut14_ch4 {
    public static void main(String[] args) {
        a clg = new a();
        clg.meth2();

        b B = new b();
        B.meth2();
    }
}
