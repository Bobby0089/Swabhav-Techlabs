package com.company.SRP.Voilation.model;

public class BankAccount {
	private long accountNumber;
	private double balance;
	
	public BankAccount(long accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposite(double amount)
	{
		balance += amount;
		 System.out.println("Deposited: " + amount+" successfully");
	}
	
	public void withdraw(double amount)
	{
		 if (balance >= amount)
		 {
	            balance = balance - amount;
	            System.out.println("Withdrawn: " + amount+" successfully");
	     }
		 else
		 {
	            System.out.println("Insufficient balance!");
	     }
	}
	
	public void notificationService()
	{
		System.out.println("Available balance :" +balance);
	}
}
