package com.company.inheritance.Box;

public class BoxTest {
	
	public static void main(String[] args)
	{
		BoxWeight box1 = new BoxWeight();
		box1.acceptInput(4.5, 6.5, 6.5);
		box1.acceptBoxWeight(30.5);
		box1.displayDetails();
		box1.displayBoxWeight();
	}

}
