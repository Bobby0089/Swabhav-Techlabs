package com.company.exceptionHandling;

public class Throw {
	static void checkAge(int age) {
        if (age < 20)
        {
            throw new ArithmeticException("You must be at least 18 years old.");
        } else 
        {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
       // checkAge(15); 
        checkAge(22); 
    }

}
