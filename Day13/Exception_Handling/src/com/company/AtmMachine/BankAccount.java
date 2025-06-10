package com.company.AtmMachine;

public class BankAccount implements IAtmOperations {
	
	private int accountNumber;
	private double balance;
	
	
	public BankAccount(int accountNumber, double balance)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	
	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if(balance < amount) 
		{
			throw new InsufficientFundsException("Insufficient balance");
		}
		balance -= amount;
		System.out.println(amount + " Withdraw successfully.");
		System.out.println("Available balance is : Rs"+balance);
	}
	
	@Override
	public void deposite(double amount) {
		balance += amount;
		System.out.println(amount + " deposited successfully.");
		System.out.println("Available balance is : Rs"+balance);
	}
	
	@Override
	public void checkBalance() {
		System.out.println("Available balance is : Rs"+balance);
	}
	
	
	

}
