// Create a class called Car that includes three 
// instance variables -- a model(String), a year(String),
// and a price(double). Provide a constructor that 
// initializes the three instance variables. Provide
// a set and get method for each instance variable. If 
// the price is not positive, do not set the value. Write a 
// test application named CarApplication that demonstrates
// class Car's capabilities. Create two car objects and
// display each object's price. Then apply a 5% discount 
// on the price of the first car and a 7% discount on the
// second Car.
// Display each car's price again.

class car
{
	String model,year;
	double price;
	
	car()
	{
		model = "null";
		year = "null";
		price = 0;
	}
	void setmodel(String m)
	{
		model = m;
	}
	void setyear(String y)
	{
		year = y;
	}
	void setprice(double p)
	{
		price = p;
	}
	
	String getmodel()
	{
		return model;
	}
	String getyear()
	{
		return year;
	}
	double getprice()
	{
		return price;
	}
	
	
}

public class carApplication
{
	public static void main(String args[])
	{
		car skoda = new car();
		skoda.setmodel("Rapid(type 901)");
		skoda.setyear("1930");
		skoda.setprice(3250000);
		System.out.println("The model of the car is "+skoda.getmodel());
		System.out.println("The manufacturing year of the car is "+skoda.getyear());
		System.out.println("The price of the car is "+skoda.getprice()+"\n");
		
		double discountamount = skoda.getprice()*0.05;
		double amountWithDiscount = skoda.getprice()-discountamount;
		System.out.println("The price of the car with discount is: "+amountWithDiscount+"\n");
		
		car bmw = new car();
		bmw.setmodel("G01 BMWX3");
		bmw.setyear("2020");
		bmw.setprice(6000000);
		
		System.out.println("The model of the car is "+bmw.getmodel());
		System.out.println("The manufacturing year of the car is "+bmw.getyear());
		System.out.println("The price of the car is "+bmw.getprice()+"\n");
		
		
		double discountamountb = bmw.getprice()*0.07;
		double amountWithDiscountb = bmw.getprice()-discountamountb;
		System.out.println("The price of the car with discount is:"+amountWithDiscountb);
	
	}
}