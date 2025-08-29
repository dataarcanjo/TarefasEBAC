package carsSettings;

public abstract class Car {
	private String wheel;
	private String motor;
	private String defaultColor;
	private int maxSpeed;
	
	public Car(String wheel, String motor, String defaultColor, int maxSpeed) {
		this.wheel = wheel;
		this.motor = motor;
		this.defaultColor = defaultColor;
		this.maxSpeed = maxSpeed;
	}

	public String getWheel() {
		return wheel;
	}

	public String getMotor() {
		return motor;
	}

	public String getDefaultColor() {
		return defaultColor;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setWheel(String wheel) {
		this.wheel = wheel;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public void setDefaultColor(String color) {
		this.defaultColor = color;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}
