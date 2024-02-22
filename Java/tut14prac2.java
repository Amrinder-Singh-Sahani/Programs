// Question 1 :- Create a class circle and use inheritance to create another class 
// cylinder from it
class circle {
    float radius;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float display_area() {
        return (float) (Math.PI) * radius * radius;
    }

    public float display_circumference() {
        return 2 * (float) (Math.PI) * radius;
    }

}

class cylinder extends circle {
    float height;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float display_area() {
        return (2 * (float) (Math.PI) * radius * height) + 2 * (float) (Math.PI) * radius * radius;
    }

    public double display_volume() {
        return Math.PI * radius * radius * height;
    }

}

// Question 2 :- Create a class rectangle and use inheritance to create another
// class cuboid. Try to keep it as close to real world scenario as possible.

class rectangle {
    float length, breadth;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getBreadth() {
        return breadth;
    }

    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }

    public float disarea() {
        return length * breadth;
    }

    public float disper() {
        return 2 * (length + breadth);
    }
}

class cuboid extends rectangle {
    float height;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float disarea() {
        return (2 * ((length * breadth) + (breadth * height) + (length * height)));
    }

    public float disvolume() {
        return (length * breadth * height);
    }

}

public class tut14prac2 {
    public static void main(String[] args) {

        // Answer 1 :-
        // circle cir = new circle();
        // cir.setRadius(1);
        // System.out.println(cir.display_area());
        // System.out.println(cir.display_circumference());

        // cylinder cyl = new cylinder();
        // cyl.setHeight(10);
        // cyl.setRadius(11);
        // System.out.println(cyl.display_area());
        // System.out.println(cyl.display_volume());

        // Answer 2 :-
        rectangle rect = new rectangle();
        rect.setBreadth(12);
        rect.setLength(10);
        System.out.println(rect.disarea());
        System.out.println(rect.disper());

        cuboid cube = new cuboid();
        cube.setLength(11);
        cube.setBreadth(12);
        cube.setHeight(10);
        System.out.println(cube.disarea());
        System.out.println(cube.disvolume());

    }
}