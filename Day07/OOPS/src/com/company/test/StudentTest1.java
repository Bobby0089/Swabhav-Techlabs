package com.company.test;

import java.util.Scanner;

import com.company.module.Student;

public class StudentTest1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of student : ");
		int studentsNumber = sc.nextInt();
		sc.nextLine();
		
		Student[] students = new Student[studentsNumber];
		
		for(int i = 0; i < studentsNumber; i++)
		{
			System.out.println("Enter details for Student"+(i+1)+" : ");
			System.out.println();
			
			System.out.println("Enter name for student"+(i+1)+" : ");
			String name = sc.nextLine();
		
			int rollNo;
			while(true)
			{
				System.out.println("Enter roll number of student"+(i+1)+" : ");
				rollNo = sc.nextInt();
				if(rollNo <= 0)
				{
					System.out.println("Roll number should be greater than 0. Please enter again.");
					continue;
				}
				else
				{
					boolean isDuplicate = false;
	                for (int j = 0; j < i; j++) {  
	                    if (students[j].getRollNo() == rollNo) {
	                        isDuplicate = true;
	                        break;
	                    }
	                }
	                
	                if (isDuplicate) {
	                    System.out.println("This roll number is already taken. Please enter a unique roll number.");
	                } else {
	                    break; 
	                }
				}
				
			}
			sc.nextLine();
			
			System.out.println("Enter marks of student"+(i+1)+" : ");
			int marks = sc.nextInt();
			sc.nextLine();
			
			students[i] = new Student(name,rollNo,marks);
		}
		

		for(int i = 0; i < studentsNumber-1; i++)
		{
			for(int j = 0; j < studentsNumber-1-i; j++)
			{
				if(students[j].getmarks() < students[j+1].getmarks())
				{
					Student temp = students[j];
					students[j] = students[j+1];
					students[j+1] = temp;
				}
			}
		}
		
		System.out.println();
		System.out.println("Details of Student according to Marks in decending order :  ");
		System.out.println();

		for(Student student : students)
		{
			student.displayDetails();
			System.out.println();	
		}
		
		sc.close();
	}

}
