package com.company.vehicle;

public class Bike implements IVehicle {

	@Override
	public void start() {
		System.out.println("Bike  starts...");
	}

	@Override
	public void stop() {
		System.out.println("Bike stops...");
	}

	@Override
	public String fuelType() {
		
		return "Petrol";
	}

}
