package week1.day2;

import week1.day1.Car;

public class Bike {
	public void callCar() {
		Car myCar = new Car();
		myCar.applyBreak();
		myCar.soundHorn();
	}

	public static void main(String[] args) {
		Bike myBike = new Bike();
		myBike.callCar();
	}

}
