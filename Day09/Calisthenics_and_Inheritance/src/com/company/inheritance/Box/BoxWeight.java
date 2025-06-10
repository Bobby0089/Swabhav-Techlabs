package com.company.inheritance.Box;

public class BoxWeight extends Box {
	private Double weight;
	
	public BoxWeight()
	{
		System.out.println("Default Constructor");
	}
	
	public void acceptBoxWeight(double weight)
	{
		this.weight = weight;
	}
	
	public void displayBoxWeight()
	{
		System.out.println();
		System.out.println("Box Weight. ");
		System.out.println();
		System.out.println("Weight of the box is : "+weight+"kg");
	}

}
