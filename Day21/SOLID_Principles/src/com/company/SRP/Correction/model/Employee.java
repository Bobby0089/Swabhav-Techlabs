package com.company.SRP.Correction.model;

public class Employee {
	
	private String name;
	private int salary;
	
	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}

}