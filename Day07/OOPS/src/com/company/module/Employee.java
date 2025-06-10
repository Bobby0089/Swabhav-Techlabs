package com.company.module;

public class Employee {

	private int employeeId;
	private String name;
	private double salary;
	private final static double bonusPercentage = 10.0;
	
	//default constructor
	public Employee()
	{
		System.out.println("Default constructor.");
		this.employeeId = 0;
		this.name = null;
		this.salary = 0.0;
	}
	
	// Parameterized constructor
	public Employee(int employeeId, String name, double salary)
	{
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}
	
	// Getter and Setter methods
	public int getEmployeeId()
	{
		return employeeId;
	}
	public void setEmployeeId(int employeeId)
	{
		this.employeeId = employeeId;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	
	// Method to calculate total salary after applying bonus
	public double calculateSalary()
	{
		return salary = salary + (salary*0.1);
	}
	
	
	// Method to display employee details
	public void displayDetails()
	{
		System.out.println("Name of Employee : "+name);
		System.out.println("Employee ID number : "+employeeId);
		System.out.println("Employee salary before bonus : "+salary);
		System.out.println("Bonus Percentage: " + bonusPercentage + "%");
		System.out.println("Employee salary after bonus : "+calculateSalary());
		System.out.println();
	}
}
