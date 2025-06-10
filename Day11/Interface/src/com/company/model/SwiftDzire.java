package com.company.model;

public class SwiftDzire implements ICar,IElectricCar,ISupercar{
	
	@Override
	public int numberOfTyres()
	{
		return 4;
	}

	@Override
	public String colour()
	{
		return "Red";
	}
	
	@Override 
	public int numberofSeats()
	{
		return 4;
	}

	@Override
	public int mileage() {
		return 45;
	}
	
	@Override
	public int maxSpeed() {
		return 185;
	}
	
	

}
