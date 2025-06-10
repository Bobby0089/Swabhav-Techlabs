package com.company.model;

public class PrintInvoice  {
	//Default Constructor
	public PrintInvoice()
	{
		
	}
	
	public void printInvoice(Invoice invoice)
	{
		System.out.println("Invoice id : "+invoice.getId());
		System.out.println("Description : "+invoice.getDescription());
		System.out.println("Amount : "+invoice.getAmount());
		System.out.println("tax percentage : "+ invoice.getTax());
		
	}
}
