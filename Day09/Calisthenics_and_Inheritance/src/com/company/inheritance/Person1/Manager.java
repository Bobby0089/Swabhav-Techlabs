package com.company.inheritance.Person1;

public class Manager extends Employee {
private String departmentName;
	
	public Manager(String name, int age,int employeeId, double salary,String departmentName)
	{
		super(name,age,employeeId,salary);
		this.departmentName = departmentName;
	}
	
	public void displayManager()
	{
		System.out.println();
		System.out.println("Manager details : ");
		System.out.println("Name of department  : "+departmentName);
	}

}
