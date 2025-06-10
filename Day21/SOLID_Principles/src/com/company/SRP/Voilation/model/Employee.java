package com.company.SRP.Voilation.model;

public class Employee {

	private String name;
	private int salary;
	private double bonus;
	
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
	
	public void calculateSalary()
	{
	    bonus = salary * 0.10;
		System.out.println("Bonus : "+bonus);
	}
	
	public void displayDetails()
	{
		System.out.println("Employee name : "+name);
		System.out.println("Salary before bonus : "+salary);
		System.out.println("Salary after bonus : "+(salary+bonus));
	}
}
