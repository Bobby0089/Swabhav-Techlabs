package com.company.factory.test;

import com.company.factory.model.IPaymentProcessor;
import com.company.factory.model.PaymentProcessorFactory;

public class PaymentProcessorfactory {

	public static void main(String[] args) {
		IPaymentProcessor payment1 = PaymentProcessorFactory.makePayment("creditcard");
		IPaymentProcessor payment2 = PaymentProcessorFactory.makePayment("paypal");
		IPaymentProcessor payment3 = PaymentProcessorFactory.makePayment("upi");
		
		payment1.processPayment(5000);
		payment2.processPayment(1000);
		payment3.processPayment(6000);

	}

}
