package com.company.behavioural.template.test;

import com.company.behavioural.template.model.CreditCardPayment;
import com.company.behavioural.template.model.PayPalPayment;
import com.company.behavioural.template.model.PaymentProcessor;

public class PaymentProcessTest {

	public static void main(String[] args) {
		System.out.println("----Welcome to Quick Pay----");
		System.out.println("");
		
		PaymentProcessor creditCard = new CreditCardPayment();
		creditCard.pay();
		
		System.out.println();
		
		PaymentProcessor paypal = new PayPalPayment();
		paypal.pay();

	}

}
