package com.company.behavioural.template.model;

public class CreditCardPayment extends PaymentProcessor{

	@Override
	public void processPayment() {
		System.out.println("Validating card......");
		System.out.println("Credit card verified. ");
		System.out.println("Processing your payment. ");
		System.out.println("Payment complete using credit card");
		System.out.println(" ");
		
	}

	
}
