package com.company.abstraction;

public class VehicalTest {

	public static void main(String[] args) {

		Car car = new Car();
		car.start();
		car.stop();
		
		Bike bike = new  Bike();
		bike.start();
		bike.stop();
		
		Vehical vehical = new Scooty();
		vehical.start();
		vehical.stop();
	}

}
