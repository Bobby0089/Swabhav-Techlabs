package com.company.model;

import java.io.Serializable;

public class Student implements Serializable{

	public String name;
	public int rollNo;
	public double marks;
	
	public Student(String name, int rollNo, double marks) {
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}

}
