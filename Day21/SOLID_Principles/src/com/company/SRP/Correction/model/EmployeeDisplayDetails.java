package com.company.SRP.Correction.model;

public class EmployeeDisplayDetails{

	public void displayDetails(Employee employee)
	{
		System.out.println("Employee name : "+employee.getName());
		System.out.println("Salary before bonus : "+employee.getSalary());
		
	}
}
