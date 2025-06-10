package com.company.inheritance.Box;

public class Box {
	private double width;
	private double height;
	private double depth;
	
	public Box()
	{
		System.out.println("Default Constructor");
	}
	
	public void acceptInput(double width, double height, double depth)
	{
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public void displayDetails()
	{
		System.out.println();
		System.out.println("Details of Box.");
		System.out.println();
		System.out.println("Width of the box is : "+width);
		System.out.println("Height of the box is : "+height);
		System.out.println("Depth of the box is : "+depth);
		System.out.println();
	}

}
