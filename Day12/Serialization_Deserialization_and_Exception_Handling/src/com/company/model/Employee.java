package com.company.model;

import java.io.Serializable;

public class Employee implements Serializable{
	public String name;
	public int employeeId;
	public  double emloyeeSalary;
	
	public Employee(String name, int employeeId, double emloyeeSalary) {
		this.name = name;
		this.employeeId = employeeId;
		this.emloyeeSalary = emloyeeSalary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + ", emloyeeSalary=" + emloyeeSalary + "]";
	}

	public int getEmployeeId()
	{
		return employeeId;
	}


}
