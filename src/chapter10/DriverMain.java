package chapter10;

public class DriverMain {

	public static void main(String[] args) {
		Driver driver = new Driver();

		driver.drive(new Bus());
		driver.drive(new Taxi());

	}

}
