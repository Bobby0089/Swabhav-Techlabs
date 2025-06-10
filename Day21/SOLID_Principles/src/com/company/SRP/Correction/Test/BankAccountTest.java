package com.company.SRP.Correction.Test;

import com.company.SRP.Correction.model.BankAccount;
import com.company.SRP.Correction.model.BankDeposite;
import com.company.SRP.Correction.model.BankNotification;
import com.company.SRP.Correction.model.BankWithdraw;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(112255463,10000);
		BankDeposite deposite = new BankDeposite();
		BankWithdraw withdraw = new BankWithdraw();
		BankNotification notification = new BankNotification();
		
		deposite.deposite(account1, 50000);
		withdraw.withdraw(account1, 20000);
		notification.notification(account1);
	}

}
