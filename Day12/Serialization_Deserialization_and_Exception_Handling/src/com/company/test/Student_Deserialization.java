package com.company.test;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.company.model.Student;

public class Student_Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String fileName = "E:\\Bobby\\Java traning\\serialization.txt";
		
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream  ois = new ObjectInputStream(fis);
		Student stu = (Student)ois.readObject();
		
		System.out.println(stu.marks);
		System.out.println(stu.name);
		
		ois.close();
		fis.close();

	}

}
