package com.company.SRP.Correction.model;

public class BankNotification {

	public void notification(BankAccount account)
	{
		System.out.println("Available balance is Rs"+account.getBalance());
	}
}
