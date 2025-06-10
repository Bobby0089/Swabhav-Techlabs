package com.company.SRP.Voilation.Test;

import com.company.SRP.Voilation.model.BankAccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(123654,50000);
		account.deposite(20000);
		account.withdraw(60000);
		account.notificationService();
	}

}
