import java.util.Scanner;

public class StringDemo
{
	public static void main(String args[])
	{
		String str,revstr = " ";
		System.out.println("Enter your String: ");
		Scanner a = new Scanner(System.in);
		str = a.nextLine();
		
		for(int i = str.length()-1;i>=0;i--)
		{
			revstr = revstr+str.charAt(i);
			
		}
		System.out.print(revstr);
		
	}	

}