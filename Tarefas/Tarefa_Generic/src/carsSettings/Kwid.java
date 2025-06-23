package carsSettings;

public class Kwid extends Car {
	private final String ID = "231321-3434214";
	
	public Kwid(String wheel, String motor, String defaultColor, int maxSpeed) {
		super(wheel, motor, defaultColor, maxSpeed);
	}

	public String getID() {
		return this.ID;
	}
}
