
/* Question 4 :- Develop a java application that determines
the total tax for each of three citizens. The tax rate is 15%
for earnings up to 30000 USD earned by each citizen and 20% for
all earnings in excess of that ceiling. You are given a list 
with the citizens' names and their earnings in a given year.
Your program should input this information for each citizen,
then determine and display the citizen's total tax. Use
class Scanner to input the data.
 */
import java.util.Scanner;

class info {

    Scanner input = new Scanner(System.in);
    Scanner inputname = new Scanner(System.in);
    String name;

    float tax, xTax;

    info() {

        System.out.println("Enter your name: ");
        name = inputname.nextLine();
        System.out.println("Enter your income: ");
        int income = input.nextInt();
        tax = income * 0.15f;
        if (income > 30000) {

            xTax = ((income - 30000) * 0.20f) + 4500f;
            System.out.printf("%s: %f\n", name, xTax);
        } else {
            System.out.printf("%s: %f\n", name, tax);
        }

    }

}

public class cw3_4_TaxCalculator {
    public static void main(String args[]) {

        info person1 = new info();
        info person2 = new info();
        info person3 = new info();

    }
}