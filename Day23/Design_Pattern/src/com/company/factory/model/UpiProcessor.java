package com.company.factory.model;

public class UpiProcessor implements IPaymentProcessor{

	@Override
	public void processPayment(double amount) {
		System.out.println("Amount "+amount+" paid using Upi ");
	}

}
