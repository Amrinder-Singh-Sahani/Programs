package MyPackage2;
import java.util.Scanner;
import MyPackage1.*;

public class CalciTest
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);		
		System.out.println("Enter your first number: ");
		float a = input.nextInt();
		System.out.println("Enter your second number: ");
		float b = input.nextInt();
		
		Calci operate = new Calci();
		operate.addition(a,b);
		operate.subtraction(a,b);
		operate.multiplication(a,b);
		operate.division(a,b);
		
		MathExtended meth = new MathExtended();
		meth.squareRoot();
		meth.power();
		
		
		
		
	}
}