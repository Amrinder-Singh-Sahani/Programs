import java.util.Scanner;

// Question 3 :- Create a class called car that includes three instance vaiables
// a model(String), a year(String) and a price(double). Provide a constructor that
// initializes the three instance variables. Provide a set and get method for each
// instance variable. If the price is not positive, do not set it's value.
// Write a test application named carApplication that demonstrates class car's 
// capabilities. Create two car objects and display each object's price. Then 
// apply a 5% discount on the price of the first car and a 7% discount on the
// price of the second. Display each car's price again.

class car {
    String model, year;
    double price;

    car() {
        // System.out.println("Enter the model of the car: ");
        // Scanner a = new Scanner(System.in);
        // model = a.next();

        // System.out.println("Enter the year when the model was launched: ");
        // year = a.next();

        // System.out.println("Enter the price of the car: ");
        // double takePrice = a.nextDouble();

        model = "null";
        year = "null";

        if (price < 0) {
            System.out.println("Price cannot be negative.");
        } else {
            price = 0.0;
        }
    }

    void setPrice(double price) {
        if (price < 0) {
            System.out.println("Price cannot be negative.");
        } else {
            this.price = price;
        }
    }

    void setModel(String model) {
        this.model = model;
    }

    void setYear(String year) {
        this.year = year;
    }

    double getPrice() {
        return price;
    }

    String getModel() {
        return model;
    }

    String getYear() {
        return year;
    }

}

public class cw2_carApplication {
    public static void main(String args[]) {

        car bmw = new car();
        bmw.setModel("Rapid(type 901)");
        bmw.setYear("1930");
        bmw.setPrice(3250000);
        System.out.println("The model of the car is: " + bmw.getModel());
        System.out.println("The year of the manufacturing of the car is: " + bmw.getYear());
        System.out.println("The price of the car is: " + bmw.getPrice());

        double discountAmount = bmw.getPrice() * 0.05;
        double amountWithDiscount = bmw.getPrice() - discountAmount;
        System.out.println("The price with 5% percent discount is: " + amountWithDiscount + "\n");

        car volkswagen = new car();
        volkswagen.setModel("Virtus GT Edge");
        volkswagen.setYear("2022");
        volkswagen.setPrice(1700000);

        System.out.println("The model of the car is: " + volkswagen.getModel());
        System.out.println("The year of the launch of the model is: " + volkswagen.getYear());
        System.out.println("The price of the car is: " + volkswagen.getPrice());
        double discountAmountv = volkswagen.getPrice() * 0.07;
        double amountWithDiscountv = volkswagen.getPrice() - discountAmountv;
        System.out.println("The price of the car with 7% discount is: " + amountWithDiscountv);

    }
}