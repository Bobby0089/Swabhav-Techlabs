package com.company.test;

import com.company.model.A;
import com.company.model.B;

public class Test {

	public static void main(String[] args) {

		A test = () -> System.out.println("Main class. ");
		
		test.display();
		
		B test1 = (a,b) -> a+b;
		
		int ans = test1.add(10,20);
		System.out.println("Interface B add method : " + ans);
	}

}
