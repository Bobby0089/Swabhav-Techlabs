package com.company.inheritance.Person1;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age)
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
