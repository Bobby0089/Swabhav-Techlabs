package com.company.inheritance.Person;

public class Employee extends Person {
	private int employeeId;
	private double salary;
	
	public Employee()
	{
		System.out.println("Default constructor of employee class.");
	}
	
	public void acceptEmployee(int employeeId, double salary)
	{
		this.employeeId = employeeId;
		this.salary = salary;
	}
	
	public void displayEmployee()
	{
		System.out.println();
		System.out.println("Employee details : ");
		System.out.println("EmployeeId  : "+employeeId);
		System.out.println("Salary : Rs"+salary);
	}

}
