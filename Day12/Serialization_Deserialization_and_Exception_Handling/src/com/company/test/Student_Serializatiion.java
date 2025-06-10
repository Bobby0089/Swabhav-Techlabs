package com.company.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.company.model.Student;

public class Student_Serializatiion {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student student1 = new Student("Bobby",101,85.5);

		String fileName = "E:\\Bobby\\Java traning\\serialization.txt";
		
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(student1);
		
		oos.close();
		fos.close();
		
		System.out.println("Writing in file is completed");
		
		
	}

}
