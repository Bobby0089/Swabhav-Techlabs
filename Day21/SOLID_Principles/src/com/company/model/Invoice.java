package com.company.model;

public class Invoice {
	//Attributes
	private String id;
	private String description;
	private double amount;
	private double tax;
	
	//Constructor
	public Invoice(String id, String description, double amount, double tax) {
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.tax = tax;
	}

	//Getters
	public String getId() {
		return id;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public double getAmount() {
		return amount;
	}
	
	public double getTax() {
		return tax;
	}
	
	
}
