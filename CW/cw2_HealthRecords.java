import java.util.Scanner;

// Question 4 
/* In this exercise, you'll design a "starter" HealthProfile
class for a person. The class attributes should include the person's
first name, last name, gender, date of birth(consisting of separate
attributes for the month, day and year of birth), height (in inches)
and weight(in pounds). Your class should have a construtor that receives 
this data. For each attribute, provide set and get methods. The class also 
should include methods that calculate and return the user's age in years,
maximum heart rate and target heart rate range and body mass index. 
Write a java app that prompts for the person's information, instantiates
an object of class HealthProfile for that person and prints the 
information from that object -- including the person's first name,
last name, gender, date of birth, height and weight -- then calculates
and prints the person's age in years, BMI, maximum heart rate and 
target heart rate. It should also display the BMI values chart.
 */

class HeartProfile {
    String fname, lname, gender;
    int date, month, year, age;
    float height, weight;

    Scanner input = new Scanner(System.in);

    HeartProfile() {
        System.out.println("Enter your first name: ");
        setFname(input.nextLine());
        System.out.println("Enter your last name: ");
        setLname(input.nextLine());
        System.out.println("Enter your gender: ");
        setGender(input.nextLine());
        System.out.println("Enter your birth date: ");
        setDate(input.nextInt());
        setMonth(input.nextInt());
        setYear(input.nextInt());
        System.out.println("Enter your height (in inches): ");
        setHeight(input.nextFloat());
        System.out.println("Enter your weight (in pounds): ");
        setWeight(input.nextFloat());
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    void age() {
        age = 2023 - year;
        System.out.printf("Your age is: %d years\n", age);
    }

    void heartrate() {
        int maxrate = 220 - age;
        float mintargetrate = maxrate * 0.5f;
        float maxtargetrate = maxrate * 0.87f;
        System.out.println("Your maximum heart rate is: " + maxrate);
        System.out.println("Your target heart rate range is from " + mintargetrate + " to " + maxtargetrate);

    }

    void BMI() {
        float bmi = (weight * 703) / (height * height);
        System.out.println("Your BMI is: " + bmi);
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi == 18.5 || bmi < 24.9) {
            System.out.println("You are healthy.");
        } else {
            System.out.println("You are obese.");
        }

    }

}

public class cw2_HealthRecords {
    public static void main(String args[]) {
        HeartProfile person = new HeartProfile();
        System.out.println("\nYour name is " + person.getFname() + " " + person.getLname());
        System.out.println("Gender: " + person.getGender());
        System.out.println("DOB: " + person.getDate() + " " + person.getMonth() + " " + person.getYear());
        System.out.println("Height: " + person.getHeight() + "\"");
        System.out.println("Weight: " + person.getWeight() + "lb");
        person.age();
        person.heartrate();
        person.BMI();

    }
}