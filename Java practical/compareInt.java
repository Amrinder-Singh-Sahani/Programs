// Write an application that asks the user to enter
// one integer, obtains it from the user and displays
// whether the number and its square are greater than, 
// equal to, not equal to, or less than the number 100.


import java.util.Scanner;
public class compareInt
{
	public static void main(String args[])
	{
		int a;
		Scanner b = new Scanner(System.in);
		System.out.println("Enter your number: ");
		a = b.nextInt();

		if(a != 100)
		{
			if(a > 100)
			{
				System.out.printf("%d is greater than 100\n",a);
			}
			else
			{ 
				System.out.printf("%d is less than 100\n",a);
			}
			System.out.printf("%d is not equal to 100\n",a);
		}
			else
			{
				System.out.printf("%d is equal to 100\n",a);
			}
		
		int a2 = a*a;
		
		if(a2 != 100)
		{
			if(a2>100)
			{
				System.out.printf("%d is greater than 100\n",a2);
			
			}
			else 
			{
				System.out.printf("%d is less than 100\n",a2);
			}
			System.out.printf("%d is not equal to 100\n",a2);
		}
		else 
		{
			System.out.printf("%d is equal to 100\n",a2);
		}
			
		
	}
}
