/* Implement the following methods:
1) Method Kelvin returns the Kelvin equivalent of a celsius
temperature, using the calculation 
Kelvin = Celsius + 273.15;

2) Method Celsius returns the Celsius equivalent of a kelvin 
temperature, using the calculation
Celsius = Kelvin - 273.15;

3) Use the methods from parts 1 and 2 to write an application 
that enables the user to enter a kelvin temperature and display
the celsius equivalent or to enter a celsius temperature and display
the kelvin equivalent
 */

import java.util.Scanner;

public class cw4_10_TemperatureConversion {

    static float kelvin(float k) {

        float Kelvin = k + 273.15f;
        return Kelvin;
    }

    static float celsius(float c) {
        float Celsius = c - 273.15f;
        return Celsius;
    }

    public static void main(String args[]) {

        float temperature;

        System.out.println("Celsius --> Kelvin : 1\nKelvin --> Celsius : 2");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a == 1) {
            System.out.println("Enter temperature: ");
            System.out.println(celsius(temperature = input.nextFloat()));
        } else if (a == 2) {
            System.out.println("Enter temperature: ");
            System.out.println(kelvin(temperature = input.nextFloat()));
        } else {
            System.out.println("Invalid input.");
        }
    }
}