package com.company.factory.model;

public class CreditCardProcessor implements IPaymentProcessor{

	@Override
	public void processPayment(double amount) {
		System.out.println("Amount "+amount+" paid using Credit card ");
	}

}
