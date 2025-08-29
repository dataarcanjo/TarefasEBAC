package carsSettings;

public class Opala extends Car{
	private final String ID = "23rfmj99-338457";
	
	public Opala(String wheel, String motor, String defaultColor, int maxSpeed) {
		super(wheel, motor, defaultColor, maxSpeed);
	}

	public String getID() {
		return this.ID;
	}
}
