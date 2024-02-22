
// Question 1 :- Create a class Cylinder and use getters and setters to set its radius and height.

class Cylinder {
    private float radius;
    private float height;

    public Cylinder(float radius, float height) //
    { //
        this.radius = radius; //
        this.height = height; //
    } // This whole bit is solution to que 3.

    public float getradius() {
        return radius;
    }

    public void setradius(float radius) {
        this.radius = radius;
    }

    public float getheight() {
        return height;
    }

    public void setheight(float height) {
        this.height = height;
    }

}

// Question 2 :- Use '1' to calculate surface area and volume of the cylinder.

class newcylinder {
    private float radius;
    private float height;

    public float getradius() {
        return radius;
    }

    public void setradius(float radius) {
        this.radius = radius;
    }

    public float getheight() {
        return height;

    }

    public void setheight(float height) {
        this.height = height;
    }

    public float getperimeter() {
        float perimeter = 2 * (2 * radius + height);
        return perimeter;
    }

    public float gettotalarea() {
        float area = (2 * (float) (Math.PI) * radius * height) + (2 * (float) (Math.PI) * radius * radius);
        return area;
    }
}

// Question 3 :- Use a constructor and repeat 1
// Solved in que 1 class

// Question 4 :- Overload a constructor used to initialize a rectangle
// of length 4 and breadth 5 for using custom parameters.

class rectangle {
    private float length;
    private float breadth;

    public rectangle() {
        this.length = 4;
        this.breadth = 5;

    }

    public rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void setlength(float length) {
        this.length = length;
    }

    public float getlength() {
        return length;
    }

    public void setbreadth(float breadth) {
        this.breadth = breadth;
    }

    public float getbreadth() {
        return breadth;
    }
}

// Question 5 :- Repeat 1 for a sphere

class sphere {
    private float rad;
    private float area;
    private float volume;

    public sphere() {
        this.rad = 4;
    }

    public sphere(float rad) {
        this.rad = rad;
    }

    public void setrad(float rad) {
        this.rad = rad;
    }

    public float getrad() {
        return rad;
    }

    public float area() {
        return area = 4 * (float) (Math.PI) * rad * rad;
    }

    public float volume() {
        return volume = (4f / 3f) * (float) (Math.PI) * rad * rad * rad;
    }

}

public class tut13prac1 {
    public static void main(String[] args) {

        // Answer 1 :-
        // Cylinder cal = new Cylinder();
        // cal.setheight(12);
        // cal.setradius(13);
        // System.out.println(cal.getheight());
        // System.out.println(cal.getradius());

        // Answer 2 :-
        // newcylinder abc = new newcylinder();
        // abc.setheight(12);
        // abc.setradius(11);
        // System.out.println(abc.getheight());
        // System.out.println(abc.getradius());
        // System.out.println(abc.gettotalarea());
        // System.out.println(abc.getperimeter());

        // Answer 3 :-
        // Cylinder mycylinder = new Cylinder(12, 9);
        // System.out.println(mycylinder.getradius());
        // System.out.println(mycylinder.getheight());

        // Answer 4 :-
        // rectangle rect = new rectangle(); //<-- In this parenthesis
        // System.out.println(rect.getbreadth());
        // System.out.println(rect.getlength()); // This will give the assigned value
        // when
        // // no value is given to in
        // // the functions as an input where the arrow is pointed.
        // rect.setbreadth(12);
        // rect.setlength(13);
        // System.out.println(rect.getbreadth());
        // System.out.println(rect.getlength());

        // Answer 5 :-
        sphere circle = new sphere();
        System.out.println(circle.area());
        System.out.println(circle.volume());
        circle.setrad(2);
        System.out.println(circle.getrad());
        System.out.println(circle.area());
        System.out.println(circle.volume());

    }
}