package com.company.model;

public class invoiceMain {

	public static void main(String[] args) {
		//Creating Invoice Object
		Invoice invoice1 = new Invoice("11231","Electronic",60000,28);
		
		PrintInvoice print  = new PrintInvoice();
		print.printInvoice(invoice1);
		
		CalculateTax calculateTax = new CalculateTax();
		calculateTax.calculateTax(invoice1);

	}

}
