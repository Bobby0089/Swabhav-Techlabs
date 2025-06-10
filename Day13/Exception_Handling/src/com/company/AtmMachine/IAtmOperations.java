package com.company.AtmMachine;

public interface IAtmOperations {

	void withdraw(double amount) throws InsufficientFundsException;
	
	void deposite(double amount);
	
	void checkBalance();
}
