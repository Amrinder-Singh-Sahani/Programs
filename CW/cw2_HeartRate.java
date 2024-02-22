import java.util.Scanner;

/* Question 4 :- According to the American Heart Association, the
formula for calculating your maximum heart rate in beats per minute
is 220 minus your age in years. Your target heart rate is a range
that's 50-85% of your maximum heart rate.
Create a class called HeartRates. The class attributes should include
the person's first name, last name, and date of birth(consisting
of separate attributes for the month,day and year of the birth).
Your class should have a construtor that receives this data as
parameters. For each attribute provide set and get methods. The 
class should also include a method that calculates and returns
the person's age(in years), a method that calculates and returns
the person's maximum heart rate and a method that calculates and 
return the person's target heart rate. Write a java app that 
prompts for the person's information, instantiates an object of
class HeartRates and prints the information from the object
including the person's first name, last name and date of birth
then calculates and prints the person's age in years, maximum 
heart rate and target heart rate range.

*/

class HeartRates {
    String fName, lName;
    int date, month, year, age, maxRate;

    HeartRates(String fName, String lName, int... ab) {

        this.fName = fName;
        this.lName = lName;
        date = ab[0];
        month = ab[1];
        year = ab[2];
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
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

    void calAge() {
        age = 2023 - year;
        System.out.println("Your age is " + age + " years");
    }

    void maxHeartRate() {
        maxRate = 220 - age;
        System.out.println("Your maximum heart rate is " + maxRate + " beats per minute");
    }

    void targetRate() {
        float tarRate = maxRate * 0.5f;
        float tarRate2 = maxRate * 0.87f;
        System.out.println("Your target heart rate range is from " + tarRate + " to " + tarRate2);
    }

}

public class cw2_HeartRate {
    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String name = a.nextLine();
        System.out.println("Enter your last name: ");
        String name2 = a.nextLine();
        System.out.println("Enter your Birth Date: ");

        Scanner num = new Scanner(System.in);

        int date = num.nextInt();
        int month = num.nextInt();
        int year = num.nextInt();

        HeartRates rate = new HeartRates(name, name2, date, month, year);

        System.out.println("Your name is " + rate.getfName() + " " + rate.getlName());
        rate.calAge();
        rate.maxHeartRate();
        rate.targetRate();

    }
}