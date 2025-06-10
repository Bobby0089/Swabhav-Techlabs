package com.company.test;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.company.model.Employee;

public class EmployeeSerialization {

	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int numberOfemployee;
		
		
		while(true)
		{
			System.out.println("Enter number of employee you want to add : ");
			numberOfemployee = sc.nextInt();
			
			
			if(numberOfemployee < 0 )
			{
				System.out.println("Invalid input, try again.  ");
			}
			else
			{
				break;
			}
		}
		sc.nextLine();
		
		Employee[] employees = new Employee[numberOfemployee];
		
		for(int i = 0; i < numberOfemployee; i++)
		{
			System.out.println("Enter details for Employee "+(i+1)+"  : ");
			System.out.println("----------------------- ");
			System.out.println("Enter name of Employee :  ");
			String employeeName = sc.nextLine();
			
			int employeeId;
			while(true)
			{
				System.out.println("Enter  Employee Id :  ");
				employeeId = sc.nextInt();
				
				boolean check = false;
				for(int j = 0; j < i; j++)
				{
					if(employees[j].getEmployeeId() == employeeId || employees[j].getEmployeeId() < 0)
					{
						System.out.println("Id number already taken or is less than 0,try again.");
						check = true;
						break;	
					}
				}
				
				if(!check)
				{
					break;
				}		
			}
			
			sc.nextLine();
			double employeeSalary;
			while(true)
			{
				System.out.println("Enter employee salary :  ");
				employeeSalary = sc.nextDouble();
				
				if(employeeSalary < 0 )
				{
					System.out.println("Invalid input, try again.  ");
				}
				else
				{
					break;
				}
			}
			sc.nextLine();
			
			employees[i] = new Employee(employeeName,employeeId,employeeSalary);
		}
		
		
		
		
		String fileName = "E:\\Bobby\\Java traning\\Employee.txt";
		
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(employees);
		
		oos.close();
		fos.close();
		
		System.out.println("Writing in file is completed");
		
		sc.close();
	}
}
