package com.company.EmployeePayRollSystem;

import java.util.Scanner;

public class EmployeePayRollSytemTest {

	public static void main(String[] args) throws InvalidSalaryEception {
		Scanner sc = new Scanner(System.in);
		int numberOfemployee = getPositiveEmployee(sc);
		sc.nextLine();
	
		Employee[] employees = new Employee[numberOfemployee];
		
		for(int i = 0; i < numberOfemployee; i++)
		{
			System.out.println("Enter details for Employee "+(i+1)+"  : ");
			System.out.println("----------------------- ");
			System.out.println("Enter name of Employee :  ");
			String employeeName = sc.nextLine();
			
			int employeeId = getUniqueId(employees,i,sc);
			
			System.out.println("Emter base salary :");
			double baseSalary = sc.nextDouble();
			 if (baseSalary <= 0)
		        {
		            throw new InvalidSalaryEception("Salary must be positive");
		        } 
			sc.nextLine();
			
			int choice;
			while(true)
			{
				boolean check = false;
				System.out.println("Enter type of employee : ");
				System.out.println("1. Full time employee. ");
				System.out.println("2. Part time employee. ");	
				
				choice = sc.nextInt();
				sc.nextLine();
				
				if(choice == 1)
				{
					double bonus = getPositiveDouble("Enter bonus amount. ",sc);
					sc.nextLine();
					employees[i] = new FullTimeEmployee(employeeName,employeeId,baseSalary,bonus);
					check = true;
				}
				else if(choice == 2)
				{
					double workingHour = getPositiveDouble("Enter working hour. ",sc);
					sc.nextLine();
					employees[i] = new PartTimeEmployee(employeeName,employeeId,baseSalary,workingHour);
					check = true;
				}
				else
				{
					System.out.println("Invalid input. Try again");
				}	
				if(check)
				{
					break;
				}
			}
			
		}
		
		displayEmployees(employees);

	}
	
	private static int getUniqueId(Employee[] employees,int index,Scanner sc)
	{
		int employeeId;
		while(true)
		{
			System.out.println("Enter  Employee Id :  ");
			employeeId = sc.nextInt();
			sc.nextLine();
			
			if(employeeId > 0 && isUnique(employees,index,employeeId))
			{
				return employeeId;
			}
			System.out.println("Please enter a unique and positive Id.");
		}
	}
	
	private static boolean isUnique(Employee[] employees,int index,int id)
	{
		for(int i = 0; i < index; i++)
		{
			if(employees[i].getId() == id)
			{
				return false;
			}
		}
		return true;
	}
	
	private static double getPositiveDouble(String message,Scanner sc)
	{
		 double baseSalary;
		 while(true)
		 {
			 System.out.print(message);
			 baseSalary = sc.nextDouble();
			 if(baseSalary > 0)
			 {
				 return baseSalary;
			 }
			 System.out.println("Please enter a positive value");
		 }
	}

	private static int getPositiveEmployee(Scanner sc)
	{
		int number;
		while(true)
		{
			System.out.println("Enter number of employee you want to add : ");
			number = sc.nextInt();
			if(number > 0 ) 
			{
				return number;
			}
			System.out.println("Please enter a positive number : ");
		}
		
	}

	public static void displayEmployees(Employee[] employees)
	{
		for(Employee e : employees)
		{
			e.displayDetails();
			System.out.println("Total Ssalry : "+ e.calculateSalary());
			System.out.println();
		}
	}
}
