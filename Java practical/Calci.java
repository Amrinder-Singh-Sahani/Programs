package MyPackage1;
import java.util.Scanner;
public class Calci
{
	
		
		public void addition(float a,float b)
		{
			float c = a+b;
			System.out.printf("%f + %f = %f\n",a,b,c);
			//return c;
		}
		public void subtraction(float a, float b)
		{
			float c = a-b;
			System.out.printf("%f - %f = %f\n",a,b,c);
			//return c;
		}
		public void multiplication(float a,float b)
		{
			float c = a*b;
			System.out.printf("%f * %f = %f\n",a,b,c);
			//return c;
		}
		public void division(float a,float b)
		{
			float c = a/b;
			System.out.printf("%f / %f = %f\n",a,b,c);
			//return c;
		}
}