package com.company.factory.model;

public class PayPalProcessor implements IPaymentProcessor{

	@Override
	public void processPayment(double amount) {
		System.out.println("Amount "+amount+" paid using paypal");
	}

}
