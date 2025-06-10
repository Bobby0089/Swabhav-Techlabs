package com.company.inheritance.Person;

public class PersonTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.displayPerson();
		employee.displayEmployee();
		
		System.out.println("---------------");
		Manager manager = new Manager();
		manager.displayPerson();
		manager.displayManager();

		
	Person person = new Employee();
	}

}
