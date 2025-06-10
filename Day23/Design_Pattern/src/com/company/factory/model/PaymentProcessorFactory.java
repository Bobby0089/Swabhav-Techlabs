package com.company.factory.model;

public class PaymentProcessorFactory {

	public static IPaymentProcessor makePayment(String input)
	{
		switch(input.toLowerCase())
		{
		case "creditcard" : return new CreditCardProcessor();
		
		case "paypal" : return new PayPalProcessor();
		
		case "upi" : return new UpiProcessor();
		
		default : System.out.println();
				  return null;
		}
	}
}
