import java.util.Scanner;

/* Question 1 :- Develop a java application that will input the miles
driven and gallons used(both as integers) for each trip. The program 
should calculate and display the miles per gallon abtained for 
each trip and print the combined miles per gallon obtained for all
trips up to this point. All averaging calculations should produce floating
point results. Use class Scanner and sentinel controlled iteration to
obtain the data from the user.
 */
class mileage {
    int miles, gallon;
    float avg, totalMiles = 0f, totalgallons = 0f;
    Scanner input = new Scanner(System.in);

    mileage() {

        while (gallon != -1) {
            System.out.println("Enter miles driven: ");
            miles = input.nextInt();
            if (miles < 0) {
                break;
            } else {

                System.out.println("Enter gallons of fuel used: ");
                gallon = input.nextInt();
                totalMiles = miles + totalMiles;
                totalgallons = gallon + totalgallons;

            }

        }
        avg = (float) (totalMiles / totalgallons);
        System.out.printf("The average miles driven per gallon of fuel is: %f", avg);

    }

}

public class cw3_1_GasMileage {
    public static void main(String args[]) {

        mileage m = new mileage();

    }
}