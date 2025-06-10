package com.company.model;

public class CalculateTax {
	public void calculateTax(Invoice invoice)
	{
		double taxAmount = invoice.getAmount() + ((invoice.getAmount() * invoice.getTax())/100);
		System.out.println("Final amount after tax : "+taxAmount);
	}
}
