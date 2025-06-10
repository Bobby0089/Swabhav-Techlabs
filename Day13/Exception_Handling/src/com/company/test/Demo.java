package com.company.test;

import java.util.Scanner;

import com.company.model.AgeException;
import com.company.model.Test;

public class Demo {

	public static void main(String[] args) throws AgeException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age to check : ");
		int age = sc.nextInt();
		 Test test = new Test();
		 
		 try {
		 test.checkAge(age);
		 }catch(ArithmeticException e) {
			 System.out.println(e.getMessage());
		 }
		
	}
}
