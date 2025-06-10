package com.company.inheritance.Person;

public class Manager extends Employee {
	private String departmentName;
	
	public Manager()
	{
		System.out.println("Default constructor of Manager class.");
	}
	
	public void acceptManager(String departmentName)
	{
		this.departmentName = departmentName;
	}
	
	public void displayManager()
	{
		System.out.println();
		System.out.println("Manager details : ");
		System.out.println("Name of department  : "+departmentName);
	}

}
