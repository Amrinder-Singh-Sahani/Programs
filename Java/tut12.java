
class employee {
    employee(int a, float b) {
        System.out.println(a + "  " + b);
    }

    int id; // This are properties (Properties and attributes are same in OOP)
    String name;
    int salary;

    public void printdetails() { // This is a method
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
    }

    public int getsalary() {
        return salary;
    }
}

public class tut12 {
    public static void main(String[] args) {

        System.out.println("This is our custom class.");

        employee harry = new employee(); // Instantiating a new employee object
        employee john = new employee();

        //
        //
        // Setting Attributes for harry
        harry.id = 15;
        harry.name = "Code with harry";
        harry.salary = 34;
        // Setting attributes for john

        john.id = 12;
        john.name = "John kumar";
        john.salary = 12;

        //
        //
        // Printing the attributes for harry
        harry.printdetails();
        int salary = harry.getsalary();
        System.out.println(salary);

        // System.out.println(harry.id);
        // System.out.println(harry.name);

        // Printing the attributes for john
        john.printdetails();
        int salary1 = john.getsalary();
        System.out.println(salary1);
    }
}