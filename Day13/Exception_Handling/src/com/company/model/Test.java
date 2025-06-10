package com.company.model;

public class Test {

	public void checkAge(int age) throws AgeException  {
        if (age < 20)
        {
            throw new AgeException("You must be at least 18 years old.");
        } else 
        {
            System.out.println("Access granted - You are old enough!");
        }
    }
}
