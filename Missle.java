
public class Missle extends FlyingObject implements Flying {

	@Override
	public void flyObject(int interval, int totalTime) 
	{
		int timeFlying = 0;
		for (int t = 1; t <= totalTime/5; t++)
		{
			timeFlying = t * interval;
			for (int i = 0; i <= interval; i++)
			{
				fly();
			}
			 System.out.printf("After %d minutes the missle has traveled %.2f miles"
					 + "\nand has reached a maximum altitude of %.2f feet.\n\n", timeFlying, 
			 	getDistanceTraveled(), getAltitude());
		}

	}

}
