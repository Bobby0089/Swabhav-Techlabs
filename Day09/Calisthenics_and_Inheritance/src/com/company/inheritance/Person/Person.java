package com.company.inheritance.Person;

public class Person {
	private String name;
	private int age;
	
	public Person()
	{
		System.out.println("Default Constructor of person class.");
	}
	
	public void acceptPerson(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void displayPerson()
	{
		System.out.println();
		System.out.println("Person details : ");
		System.out.println("Name of the person  : "+name);
		System.out.println("Age : "+age);
	}

}
