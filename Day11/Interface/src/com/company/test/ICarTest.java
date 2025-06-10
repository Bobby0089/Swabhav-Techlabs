package com.company.test;

import com.company.model.ICar;
import com.company.model.IElectricCar;
import com.company.model.SwiftDzire;

public class ICarTest {

	public static void main(String[] args) {
		IElectricCar.display();
		SwiftDzire car1 = new SwiftDzire();
		System.out.println("Number of tyres : "+car1.numberOfTyres());
		System.out.println("Colour : "+car1.colour());
		System.out.println("Number of seats: "+car1.numberofSeats());
		System.out.println("Mileage : "+car1.mileage());
		System.out.println("Maximum speed: "+car1.maxSpeed());
		System.out.println("Number of car available: "+ICar.numbrsOfcarAvailable);
		

	}

}
