package com.company.toString;

public class Student {

	//Constructor chaining

		private String name;
		private int rollNo;
		private double marks;
		final String collegeName = "Kes College";
		
		public Student(String name, int rollNo, double marks)
		{
			this.name = name;
			this.rollNo = rollNo;
			this.marks = marks;
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
		
		
		@Override
		public String toString() {
			return "Student [name=" + name + ", rollNo=" + rollNo + ", marks=" + marks + ", collegeName=" + collegeName
					+ "]";
		}
		
}
