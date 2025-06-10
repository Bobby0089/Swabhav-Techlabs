package com.company.module;

public class Student {
	
	//Constructor chaining

	private String name;
	private int rollNo;
	private double marks;
	final String collegeName = "Kes College";
	
	public Student()
	{
		this("Bobby",21);
		System.out.println("Default constructor.");
	}
	public Student(String name, int rollNo)
	{
		this(name,rollNo,9.5);
		System.out.println("Constructor with name and rollNo called. ");
		System.out.println("name : "+name+"    RollNo : "+rollNo);
	}

	public Student(String name, int rollNo, double marks)
	{
//		this.name = name;
//		this.rollNo = rollNo;
//		this.marks = marks;
		System.out.println("Constructor with name, rollNo and marks called. ");
		System.out.println("name : "+name+"    RollNo : "+rollNo+"    Marks : "+marks);
	}

	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setRollNo(int rollNo)
	{
		this.rollNo = rollNo;
	}
	public void setmarks(double marks)
	{
		this.marks = marks;
	}
	public String getName()
	{
		 return name;
	}
	public int getRollNo()
	{
		return rollNo;
	}
	public double getmarks()
	{
		return marks;
	}
	
	
	// Method to display student details
	public  void displayDetails()
	{
		System.out.println("Student Name : "+name);
		System.out.println("Student roll number : "+rollNo);
		System.out.println("Student Marks : "+marks);
		System.out.println("College Name : "+collegeName);
		System.out.println();
	}

}
