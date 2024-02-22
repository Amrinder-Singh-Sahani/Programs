package MyPackage1;
import java.util.Scanner;
public class MathExtended
{
	public void squareRoot()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Square root for number 1: ");
		float d = input.nextFloat();
		System.out.println("Square root for number 2: ");
		float e = input.nextFloat();
		
		float c = (float)(Math.sqrt(d));
		System.out.printf("Square Root of %f is %f\n",d,c);
		float f = (float)(Math.sqrt(e));
		System.out.printf("Square Root of %f is %f\n",f,e);
		
	}
	public void power()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		float a = input.nextFloat();
		System.out.println("Enter its power: ");
		float b = input.nextFloat();
		float c = (float)(Math.pow(a,b));
		System.out.printf("The value of %f power to %f is %f\n",a,b,c);
	}
}