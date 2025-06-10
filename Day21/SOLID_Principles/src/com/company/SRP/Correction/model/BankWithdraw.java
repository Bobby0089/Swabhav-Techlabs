package com.company.SRP.Correction.model;

public class BankWithdraw {
	
	public void withdraw(BankAccount account,double amount)
	{
		 if (account.getBalance() >= amount)
		 {
			 account.setBalance(account.getBalance()-amount);
	            System.out.println("Withdrawn: " + amount+" successfully");
	     }
		 else
		 {
	            System.out.println("Insufficient balance!");
	     }
	}

}
