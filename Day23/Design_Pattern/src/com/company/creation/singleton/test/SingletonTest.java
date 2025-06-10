package com.company.creation.singleton.test;

import com.company.creation.singleton.model.Singleton;

public class SingletonTest {

	public static void main(String[] args) {
		
		Singleton obj1 = Singleton.getInstance();
		obj1.show();

		Singleton obj2 = Singleton.getInstance();
		
		System.out.println(obj1 == obj2);
	}

}
