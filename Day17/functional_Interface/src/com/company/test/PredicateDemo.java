package com.company.test;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
			Predicate<Integer> check = a -> a%3==0;
			System.out.println(check.test(62));
			System.out.println(check.test(60));
			
			
	}

}
