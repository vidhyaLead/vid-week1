package week1.day1;

public class Car {

	public void drivercar() {

		System.out.println("Drive a Car");
	}

	public void applyBrake() {
		System.out.println("Check the brake");
	}

	public void soundHorn() {
		System.out.println("Horn sound checked");
	}

	public void isPuncture() {
		System.out.println("Wheels are in good condition");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Car();
		c.drivercar();
		c.applyBrake();
		c.soundHorn();
		c.isPuncture();
	}

}
