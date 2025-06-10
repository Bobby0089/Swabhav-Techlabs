package com.company.module;

public class Bank {

	private long accountNumber;
	private String holderName;
	private double balance;
	
	public Bank() 
	{
		System.out.println("Default constructor.");
	}
	public Bank(long accountNumber, String holderName, long balance)
	{
		this.setAccountNumber(accountNumber);
		this.setHolderName(holderName);
		this.setBalance(balance);
	}
	
	
	public long getAccountNumber()
	{
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	public String getHolderName()
	{
		return holderName;
	}
	public void setHolderName(String holderName)
	{
		this.holderName = holderName;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public void displayDetails()
	{
		System.out.println("Your Account number is : "+accountNumber);
		System.out.println("Name of Account Holder is : "+holderName);
		System.out.println("Your balance is : Rs"+balance+"/-");
		System.out.println("") ;
	}
	
	public void deposit(long l)
	{
		if(l<0)
		{
			System.out.println("Please enter valid amount number");
			System.out.println();
		}
		
		long temp = l;
		balance += l; 
		System.out.println("Rs"+l+"/- has been deposited.");
		System.out.println("") ;
		
	}
	
	public void withdraw(long l)
	{
		long temp  = l;
		if(l < balance)
		{
			balance -= l;
			System.out.println("Available balance is : Rs"+balance+"/-");
			System.out.println("") ;
		}
		else
		{
			System.out.println("Insufficient balance");
			System.out.println("") ;
		}
	}
}
