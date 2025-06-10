package com.company.AtmMachine;

public class InsufficientFundsException extends Exception {

	public InsufficientFundsException(String message)
	{
		super(message);
	}
}
