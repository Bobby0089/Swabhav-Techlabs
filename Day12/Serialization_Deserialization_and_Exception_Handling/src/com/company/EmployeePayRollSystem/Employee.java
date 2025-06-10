package com.company.EmployeePayRollSystem;

public abstract class Employee implements IPayable{
	String name;
	int id;
	double baseSalary;
	
	
	public Employee(String name, int id, double baseSalary) {
		
		this.name = name;
		this.id = id;
		this.baseSalary = baseSalary;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void displayDetails()
	{
		System.out.println("Name of employee : "+name);
		System.out.println("Employee id  : "+id);
		System.out.println("Basic salary : "+baseSalary);
	}	
	
}
