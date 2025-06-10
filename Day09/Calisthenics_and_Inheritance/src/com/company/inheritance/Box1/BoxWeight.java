package com.company.inheritance.Box1;

public class BoxWeight extends Box{
private Double weight;
	
	public BoxWeight(double width, double height, double depth, double weight)
	{
		super(width, height, depth);
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
