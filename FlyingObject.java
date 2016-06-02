// Final Test - FlyingObject.java

public class FlyingObject 
{
	private double minutesPerHour;
	private double flyingMinutes;
	private double hoursOfFlight;
	
	private double airSpeed;
	private double altMeter;

	private double distanceTraveled; // distance in miles
	private double altitude; // altitude in meters
	
	FlyingObject()
	{
		minutesPerHour = 60.00;
		flyingMinutes = 1.00; // flying for one minute.
		hoursOfFlight = flyingMinutes / minutesPerHour;
		
		airSpeed = 0.00;
		altMeter = 0.00;
		setDistanceTraveled(0.00);
		setAltitude(0.00);
	}
	public void setAirSpeed(int airSpeedMPH)
	{
		this.airSpeed = airSpeedMPH;
	}
	
	public void setAltimeter(int elevationPerMinute)
	{
		this.altMeter = elevationPerMinute;
	}
	
	public void fly()
	{
		// FLys for one minute.
		distanceTraveled = distanceTraveled + (airSpeed * hoursOfFlight);
		altitude  = altitude + (altMeter * flyingMinutes);
	}
	public double getDistanceTraveled() 
	{
		return distanceTraveled;
	}
	public void setDistanceTraveled(double d) 
	{
		this.distanceTraveled = d;
	}
	public double getAltitude() 
	{
		return altitude;
	}
	public void setAltitude(double d) 
	{
		this.altitude = d;
	}
}
