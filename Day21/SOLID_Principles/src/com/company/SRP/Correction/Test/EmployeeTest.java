package com.company.SRP.Correction.Test;

import com.company.SRP.Correction.model.Employee;
import com.company.SRP.Correction.model.EmployeeCalaulateBonus;
import com.company.SRP.Correction.model.EmployeeDisplayDetails;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee("Bobby",90000);
		
		EmployeeCalaulateBonus calculate = new EmployeeCalaulateBonus();
		calculate.calculateBonus(employee);
		
		EmployeeDisplayDetails display = new EmployeeDisplayDetails();
		display.displayDetails(employee);
		
	}

}
