package com.company.test;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<Integer,Integer>  cube = num -> num*num*num;
		System.out.println("Cube is : " + cube.apply(5));
		
		Function<String,Integer>  length = num -> num.length();
		System.out.println("length is : " + length.apply("parth"));
		
		Function<Integer,String>  test = num -> num.toString();
		System.out.println("length is : " + test.apply(1234));
		System.out.println("------------------------------------------");
		
		//Function Chaining
		Function<Integer,Integer>  test1 = num -> num*num*num;
		Function<Integer,Integer>  test2 = num -> num*3;
		System.out.println(test1.andThen(test2).apply(5));
		System.out.println(test1.compose(test2).apply(5));
		
	 
	}

}
