package com.company.SRP.Voilation.Test;

import com.company.SRP.Voilation.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee("Bobby",90000);
		
		employee.calculateSalary();
		employee.displayDetails();

	}

}
