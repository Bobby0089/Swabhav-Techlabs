package com.company.inheritance.Person;

public class Test {

	public static void main(String[] args) {
		Manager manager1 = new Manager();
		manager1.acceptPerson("Akash Gupta", 28);
		manager1.acceptEmployee(199728, 100000.0);
		manager1.acceptManager("Software development.");
		
		manager1.displayPerson();
		manager1.displayEmployee();
		manager1.displayManager();

	}

}
