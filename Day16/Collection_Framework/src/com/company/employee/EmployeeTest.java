package com.company.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class EmployeeTest {

	public static void main(String[] args) {
		// using Scanner for user input
		Scanner sc = new Scanner(System.in);
		int employeenumber = getPositiveNumber(sc);
		
		TreeSet<Employee> employees = new TreeSet<Employee>();
		
		for(int i = 0; i < employeenumber; i++)
		{
			  int id = getUniqueId(sc,employees);
			  
			  
			  System.out.println("Enter employee name:");
			  String name = sc.nextLine();
			  
			  double salary = getPositiveDouble(sc);
			  
			   
			  Employee e = new Employee(id, name, salary);
			  employees.add(e);
			  System.out.println("Employee added.");
			  
		}
		
		start(sc, employees);
		
		//Closing Scanner
		sc.close();
	}	
	private static void start(Scanner sc, TreeSet<Employee> employees)
	{
		List<Employee> employeesByName = new ArrayList<>();
		while(true)
		{
			System.out.println();
			displayMenu();
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
			case 1 : displayEmployee(employees);
					 break;
					 
			case 2 : employeesByName.clear();
                     employeesByName.addAll(employees);
				     Collections.sort(employeesByName,new NameComparator());
				     System.out.println(employeesByName);
				     break;
				     
			case 3 : System.out.println("Exting....");
			         return;
			         
			default : System.out.println("Invalid choice....");
			}
		}
	}
	private static void displayMenu()
	{
		System.out.println("What to want to do : ");
		System.out.println("1.Display employee (Sorted according to id)");
		System.out.println("2.Display employee (Sorted according to name).");
		System.out.println("3.Exit");
		System.out.println();
		System.out.println("Enter your choice : ");
	}
	private static void displayEmployee(TreeSet<Employee> employees) {
		Iterator<Employee> iterator = employees.iterator();

		while (iterator.hasNext())
		{
		System.out.print(iterator.next());
		System.out.println();
		}
	}
	private static int getPositiveNumber(Scanner sc) {
		int number;
		while(true)
		{
			System.out.println("Enter number of Employee you want to add : ");	
			number = sc.nextInt();
			sc.nextLine();
			if(number > 0 )
			{
				return number;
			}
			System.out.println("invalid user input try again.");
		}
		
	}
	private static int getUniqueId(Scanner sc, TreeSet<Employee> employees) {
		int id;
		while(true)
		{
			System.out.println("Enter employee id:");
			id = sc.nextInt();
			sc.nextLine();
			boolean check = true;
			for(Employee i : employees)
			{
				if(i.getEmployeeId() == id )
				{
					check = false;
					break;
				}
			}
			if(check && id >= 0)
			{
				return id;
			}
			System.out.println("invalid user input try again.");
		}
		
	}
	private static double getPositiveDouble(Scanner sc) {
			double number;
			while(true)
			{
				System.out.println("Enter employee salary:");
				number = sc.nextDouble();
				sc.nextLine();
				if(number >= 0 )
				{
					return number;
				}
				System.out.println("salary must be positive .");
			}
		
	}

}
