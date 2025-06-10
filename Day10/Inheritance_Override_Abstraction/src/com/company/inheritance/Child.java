package com.company.inheritance;

public class Child extends Parent {
	int i = 20;
	
	public void display(int i)
	{
		System.out.println("Local variable called : "+i);
		System.out.println("Child class instance variable called : "+this.i);
		System.out.println("Parent class instance variable called : "+super.i);
		
	}

}
