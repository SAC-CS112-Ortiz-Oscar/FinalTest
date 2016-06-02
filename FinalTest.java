// Oscar Ortiz

// FinalTest.java

public class FinalTest 
{

	public static void main(String[] args) 
	{
		//Show the altitude and distance travel of the following objects in 5 minute interval, for the first 30 minutes
		
		int interval = 5;
		int totalTime = 30;
		
		// Bird:  10 MPH, 3 FPM
		Bird newBird = new Bird();
		newBird.setAirSpeed(10);
		newBird.setAltimeter(3);
		newBird.flyObject(interval, totalTime);
		
		// Airplane:  450 MPH, 50 FPM
		Airplane newAirPlane = new Airplane();
		newAirPlane.setAirSpeed(450);
		newAirPlane.setAltimeter(50);
		newAirPlane.flyObject(interval, totalTime);
		
		// JetPlane:  1000 MPH, 120 FPM
		JetPlane newJetPlane = new JetPlane();
		newJetPlane.setAirSpeed(1000);
		newJetPlane.setAltimeter(120);
		newJetPlane.flyObject(interval, totalTime);
		
		// Missile: 2500 MPH,  800 FPM
		Missle newMissle = new Missle();
		newMissle.setAirSpeed(2500);
		newMissle.setAltimeter(800);
		newMissle.flyObject(interval, totalTime);
		
		// Superman: 3500 MPH,  500 FPM
		Superman newSuperman = new Superman();
		newSuperman.setAirSpeed(3500);
		newSuperman.setAltimeter(500);
		newSuperman.flyObject(interval, totalTime);
	}
}
