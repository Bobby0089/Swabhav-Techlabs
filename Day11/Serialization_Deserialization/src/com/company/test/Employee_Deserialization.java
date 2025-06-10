package com.company.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.company.model.Employee;

public class Employee_Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		String fileName = "E:\\Bobby\\Java traning\\Employee.txt";
		
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream  ois = new ObjectInputStream(fis);
		Employee[] emp = (Employee[])ois.readObject();
		
		for(int i = 0; i < emp.length; i ++)
		{
			System.out.println(emp[i].toString());
		}
		
		ois.close();
		fis.close();



	}

}
