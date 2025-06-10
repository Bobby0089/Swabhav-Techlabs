package com.company.EmployeePayRollSystem;

public class PartTimeEmployee extends Employee{
	private double hoursWorked;
	
	public PartTimeEmployee(String name, int id, double baseSalary, double hoursWorked)
	{
		super(name,id,baseSalary);
		this.hoursWorked = hoursWorked;
	}
	
	@Override
	public double calculateSalary()
	{
		return baseSalary*hoursWorked;
	}

}
