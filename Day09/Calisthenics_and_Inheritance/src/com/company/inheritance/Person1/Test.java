package com.company.inheritance.Person1;

public class Test {

	public static void main(String[] args) {
		Manager manager1 = new Manager("Bobby",25,125463,65000.0,"Software Development");
		manager1.displayPerson();
		manager1.displayEmployee();
		manager1.displayManager();
	}
}
