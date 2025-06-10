package com.company.model;

public class AgeException extends Exception{

	public AgeException (String message) {
		super(message);
		int num = 10;
		int result = num / 0;
	}
}
