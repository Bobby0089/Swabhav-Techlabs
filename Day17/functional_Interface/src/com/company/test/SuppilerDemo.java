package com.company.test;

import java.util.function.Supplier;

public class SuppilerDemo {

	public static void main(String[] args) {
		Supplier<String> greet = () -> "Hello Good Afternoon !!";
		System.out.println(greet.get());

		
	}

}
