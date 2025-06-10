package com.company.SRP.Correction.model;

public class BankDeposite {
	
	public void deposite(BankAccount account, double amount)
	{
		System.out.println("Initial balance : " + account.getBalance());
		account.setBalance(account.getBalance()+amount);
	    System.out.println("Deposite: " + amount+" successfully");
		System.out.println("Available balance : " + account.getBalance());
	     
	}
}
