package com.company.module;

public class Student {
	
	private String name;
	private int rollNo;
	private double marks;
	private static int numberOfStudent;
	final String collegeName = "Kes College";
	
	public Student()
	{
		System.out.println("Default constructor.");
		this.name = "Unknown";
		this.rollNo = 0;
		this.marks = 0.0;
	}
	public Student(String name, int rollNo, double marks)
	{
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
		numberOfStudent++;
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
	public static int getNumberOfStudent() {
		return numberOfStudent;
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
