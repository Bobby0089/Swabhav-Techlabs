package com.company.reflection;

import java.lang.reflect.*;

public class Person extends Parent {
	
	String name;
	int age;
	double weight;
	
	public Person()
	{
		
	}
	public Person(String name, int age, double weight)
	{
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public void displayDetails()
	{
		
	}
	public void displaynumber()
	{
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException
	{
		System.out.println("Printing class name. ");
		// Method 1  --> .getClass();
		Person person1 = new Person();
		System.out.println(person1.getClass());
		
		// Method 2 --> .class();
		Class c1 = Person.class;
		System.out.println(Person.class);
		
		// Method 3 --> .forName();
		Class  c3 = Class.forName("com.company.reflection.Person");
		System.out.println(c3);
		
		System.out.println();
		
		System.out.println("Printing Method name. ");
		
		Method method[] = c1.getDeclaredMethods();
		for(Method m : method)
		{
			System.out.println("Declared method : "+m.getName());
		}
		
		System.out.println();
		
		System.out.println("Printing Constructor name. ");
		
		Constructor constructor[] = c1.getDeclaredConstructors();
		for(Constructor c : constructor)
		{
			System.out.println("Declared constructor : "+c);
			System.out.println("Count of constructor parameter : "+c.getParameterCount());
		}
		
		System.out.println();
		System.out.println(c1.getSuperclass());
		
		
		
		
		
	}
}
