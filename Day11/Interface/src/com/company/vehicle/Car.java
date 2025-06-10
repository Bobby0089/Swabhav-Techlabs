package com.company.vehicle;

public class Car implements IVehicle {
	 String fuel;
	
	public Car(String fuel)
	{
		this.fuel= fuel;
	}

	@Override
	public void start() {
		 System.out.println("Car  starts..");
	}

	@Override
	public void stop() {
		System.out.println("Car  stops...");
	}

	@Override
	public String fuelType() {
		
		return fuel;
	}

}
