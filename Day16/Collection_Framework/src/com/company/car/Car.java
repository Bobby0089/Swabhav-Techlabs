package com.company.car;

public class Car implements Comparable{

	private String carNumber;
	private String ownerName;
	private double entryTime;
	
	public Car(String carNumber, String ownerName, double entryTime)
	{
		this.carNumber = carNumber;
		this.ownerName = ownerName;
		this.entryTime = entryTime;
	}

	public String getCarNumber()
	{
		return carNumber;
	}
	
	@Override
	public int compareTo(Object o) {
		
		return 0;
	}

	@Override
	public String toString() {
		return "Car [Car Number=" + carNumber + ", Owner Name=" + ownerName + ", Entry Time=" + entryTime + "]";
	}
	
	
	
}
