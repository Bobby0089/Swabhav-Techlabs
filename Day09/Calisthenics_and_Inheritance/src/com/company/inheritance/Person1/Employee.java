package com.company.inheritance.Person1;

public class Employee extends Person {
	private int employeeId;
	private double salary;
	
	public Employee(String name, int age,int employeeId, double salary)
	{
		super(name,age);
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
