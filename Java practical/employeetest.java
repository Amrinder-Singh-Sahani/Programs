class employee {
    String firstname;
    String lastname;
    double salary;

    void setdata(String a, String b, double c) {
        firstname = a;
        lastname = b;
        salary = c;

    }

    String displayfirstname() {
        return firstname;
    }

    String displaylastname() {
        return lastname;
    }

    double displaysalary() {
        if (salary < 0) {
            System.out.println("Salary should be a positive integer.");
        }
        return salary;
    }

}

public class employeetest {
    public static void main(String[] args) {
        employee emp1 = new employee();
        employee emp2 = new employee();
        emp1.setdata("Employee", "Number 1\n", 2000000);
        emp2.setdata("Employee", "Number 2\n", 20000);

        System.out.print("Name of the first employee is " + emp1.displayfirstname() + " " + emp1.displaylastname());
        System.out.println("Salary of first employee is " + emp1.displaysalary());

        System.out.print("Name of the second employee is " + emp2.displayfirstname() + " " + emp2.displaylastname());
        System.out.println("Salary of the second employee is " + emp2.displaysalary());

    }
}