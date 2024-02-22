
// Question 1 :- Create a class employee with following properties
// salary (property)(int)
// getsalary(method returning int)
// name (property)(String)
// getname(method returning String)
// setname(method changing name)

class employee {
    int salary;
    String name;

    public int getsalary() {
        return salary;
    }

    public String getname() {
        return name;
    }

    public void setname(String n) {
        name = n;

    }

}
// Question 2 :- Create a class cellphone with methods to print
// "ringing..." , "Vibrating..." etc

class cellphone {
    public void ringing() {
        System.out.println("ringing...");

    }

    public void Vibrating() {
        System.out.println("vibrating...");
    }

    public void callfriend() {
        System.out.println("Calling Sir...");
    }
}

// Question 3 :- Create a class square with a method to initialize its side,
// calculating area, perimeter etc

class square {
    float side;

    public float area() {
        return side * side;
    }

    public float perimeter() {
        return 4 * side;
    }
}

// Question 4 :- Create a class rectangle and repeat the methods from que 3

class rectangle {
    float length, breadth;

    public float area() {
        return length * breadth;
    }

    public float perimeter() {
        return 2 * (length + breadth);
    }
}

// Question 5 :- Create a class tommyvercetti for rockstar games capable of
// hitting(print hitting...), running, firing, etc

class tommyvercetti {
    public void hitting() {
        System.out.println("Hitting the enemy");
    }

    public void running() {
        System.out.println("Running from the enemy");
    }

    public void firing() {
        System.out.println("Firing on the enemy");
    }
}

// Question 6 :- Repeat for que 4

class circle {
    float rad;

    public float area() {
        return (22f / 7f) * rad * rad;
    }

    public float perimeter() {
        return 2 * (22f / 7f) * rad;
    }
}

public class tut12prac {
    public static void main(String[] args) {

        // Answer 1 :-

        // employee man = new employee();
        // man.setname("code with harry");
        // man.salary = 233;
        // System.out.println(man.getsalary());
        // System.out.println(man.getname());

        // Answer 2 :-

        // cellphone redmi = new cellphone();
        // redmi.ringing();
        // redmi.Vibrating();
        // redmi.callfriend();

        // Answer 3 :-

        // square sq = new square();
        // sq.side = 12;
        // System.out.println(sq.area());
        // System.out.println(sq.perimeter());

        // Answer 4 :-

        // rectangle rect = new rectangle();
        // rect.length = 10;
        // rect.breadth = 12;
        // System.out.println(rect.area());
        // System.out.println(rect.perimeter());

        // Answer 5 :-

        // tommyvercetti tommy = new tommyvercetti();
        // tommy.hitting();
        // tommy.running();
        // tommy.firing();

        // Answer 6 :-

        circle cir = new circle();
        cir.rad = 2;
        System.out.println(cir.area());
        System.out.println(cir.perimeter());
    }
}