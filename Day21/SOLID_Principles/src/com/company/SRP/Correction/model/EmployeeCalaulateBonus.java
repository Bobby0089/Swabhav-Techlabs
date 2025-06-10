package com.company.SRP.Correction.model;

public class EmployeeCalaulateBonus {
	
	public void calculateBonus(Employee employee)
	{
		double bonus = employee.getSalary() * 0.10;
		System.out.println("Bonus : "+bonus);
	}

}
