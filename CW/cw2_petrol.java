import java.util.Scanner;

// Question 2 :- Create a class called PetrolPurchase to represent
// information about the petrol you purchase. The class should include
// five pieces of information in the form of instance variables -- the 
// station's location(type String), the type of petrol(type String), the 
// quantity(type int) of the purchase in liters, the price per liter(double),
// and the percentage discount(double). The class should have a construtor that
// initializes the five instance variables. Provide a set and get method for each
// instance variable. In addition, provide a method named getpurchaseamount that 
// calculates the net amount you had to pay as a double value. Write an 
// application class named petrol that demonstrates the capabilities of class petrolpurchase

class petrolpurchase {
    String station;
    String petrolType;
    int quantityInLiters;
    double pricePerLiter, discountPercentage;

    petrolpurchase(String station, String petrolType, int quantityInLiters, double pricePerLiter,
            double discountPercentage) {
        this.station = station;
        this.petrolType = petrolType;
        this.quantityInLiters = quantityInLiters;
        this.pricePerLiter = pricePerLiter;
        this.discountPercentage = discountPercentage;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public int getQuantityInLiters() {
        return quantityInLiters;
    }

    public void setQuantityInLiters(int quantityInLiters) {
        this.quantityInLiters = quantityInLiters;
    }

    public double getPricePerLiter() {
        return pricePerLiter;
    }

    public void setPricePerLiter(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    void getpurchaseamount() {
        double totalDiscount = (quantityInLiters * pricePerLiter * discountPercentage)
                - (quantityInLiters * pricePerLiter);
        double purchaseAmountWithDiscount = (quantityInLiters * pricePerLiter) - totalDiscount;
        double purchaseAmountWithoutDiscount = quantityInLiters * pricePerLiter;
        System.out.println("Purchase amount without discount: " + purchaseAmountWithoutDiscount);
        System.out.println("Purchase amount with discount: " + purchaseAmountWithDiscount);
    }

}

public class cw2_petrol {
    public static void main(String args[]) {

        Scanner a = new Scanner(System.in);

        System.out.println("Enter the location of the station: ");
        String station = a.nextLine();

        petrolpurchase petrol = new petrolpurchase(station, "Power", 12, 105.23, 1.2);
        petrol.getpurchaseamount();
        System.out.println("The location of the station is: " + petrol.getStation());

    }
}