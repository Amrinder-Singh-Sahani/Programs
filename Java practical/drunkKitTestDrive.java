class drunkKit
{
	
	boolean topHat = true;
	boolean snare = true;
	void playsnare()
	{
		System.out.println("Bang Bang Ba-Bang");
		
	}
	void playtopHat()
	{
		System.out.println("Ding Ding Da-Ding");
		
	}
}

public class drunkKitTestDrive
{
	public static void main(String args[])
	{
		//boolean topHat = true;
		//boolean snare = true;
		drunkKit d = new drunkKit();
		if(d.snare == true)
		{
			d.playsnare();
			d.snare = false;
			
		}
		if(d.topHat == true)
		{
			d.playtopHat();
			d.topHat = false;
		}
	}
}