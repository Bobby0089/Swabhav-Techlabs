package com.company.test;

import java.util.Scanner;

import com.company.module.Employee;

public class EmployeeSalaryManagementSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of employee : ");
		int employeeNumber = sc.nextInt();
		sc.nextLine();
		
        // Create an array to store Employee objects
		Employee[] employees = new Employee[employeeNumber];
		
		 // Loop to get details for each employee
		
		for(int i = 0; i < employeeNumber; i++)
		{
			System.out.println("Enter details for employee"+(i+1)+" : ");
			System.out.println();
			
//			System.out.println("Enter employeeId for employee"+(i+1)+" : ");
			int id ;
//			sc.nextLine();
			while(true)
			{
				System.out.print("Enter employee ID: ");
                id = sc.nextInt();
                sc.nextLine(); 

                boolean isDuplicate = false;
                for (int j = 0; j < i; j++)
                {
                    if (employees[j] != null && employees[j].getEmployeeId() == id)
                    {
                        isDuplicate = true;
                        System.out.println("This ID is already taken, try again.");
                        break;
                    }
                }
                if (!isDuplicate)
                {
                    break;
                }
			}
			
			System.out.println("Enter name for employee"+(i+1)+" : ");
			String name = sc.nextLine();
			
			System.out.println("Enter salary of employee"+(i+1)+" : ");
			double salary = sc.nextDouble();
			sc.nextLine();
			
			employees[i] = new Employee(id,name,salary);
		}
		
		System.out.println();
		System.out.println("Details of Employee  :  ");
		System.out.println();

		// Display details of each employee
		for(Employee employee : employees)
		{
			employee.displayDetails();
			System.out.println();	
		}
		
		 // Close the scanner
		sc.close();

	}

}
