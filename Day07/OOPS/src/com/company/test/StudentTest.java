package com.company.test;

import com.company.module.Student;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student1 = new Student("Bobby",01,9.5);
		student1.displayDetails();
	    System.out.println(student1.getNumberOfStudent());
	    
	    Student student2 = new Student("akash",02,9.6);
	    student2.displayDetails();
	    System.out.println(student2.getNumberOfStudent());
	      
	    Student student3 = new Student("Bobby",01,9.5);
	    student3.displayDetails();
	    System.out.println(student3.getNumberOfStudent());
	    
	    Student student4 = new Student("akash",02,9.6);
	    student4.displayDetails();
	    System.out.println(student4.getNumberOfStudent());
	    
	}
}
