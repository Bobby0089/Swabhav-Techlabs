package com.company.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.company.model.BonusCalculator;
import com.company.model.Employee;

public class BonusCalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfEmployees = getPositiveNumber(sc);
		
		ArrayList<Employee>  employees = new ArrayList<>();
		
		for(int i = 0; i < numberOfEmployees; i++)
		{
			double salary = getPositiveDouble(sc,i);
			
			Employee e = new Employee(salary);
			employees.add(e);
		}
		System.out.println();
		
		BonusCalculator bc = (salary) ->
		{
			if(salary > 50000)
			{
				return  salary*0.15;
			}
				return  salary*0.10;		
		};
		
	
		for(int i = 0; i < numberOfEmployees; i++)
		{
			System.out.println("Employee "+ (i+1)+" salary before bonus: "+employees.get(i).getSalary());
			System.out.println("Bonus amount : "+ bc.calculateSalary(employees.get(i).getSalary()));
			System.out.println("Employee "+ (i+1)+" salary after bonus : "+(bc.calculateSalary(employees.get(i).getSalary())+employees.get(i).getSalary()));
			System.out.println();
		}
			
	}
	
	private static double getPositiveDouble(Scanner sc, int i) {
		double number;
		while(true)
		{
			System.out.println("Enter salary for employee "+(i+1)+" :");
			number = sc.nextInt();
			sc.nextLine();
			if(number >= 0 )
			{
				return number;
			}
			System.out.println("salary must be positive .");
		}
    }
	
	private static int getPositiveNumber(Scanner sc) 
	{
		int number;
		while(true)
		{
			System.out.println("Enter number of employees : ");
			number = sc.nextInt();
			sc.nextLine();
			if(number > 0 )
			{
				return number;
			}
			System.out.println("invalid user input try again.");
		}
	}

}
