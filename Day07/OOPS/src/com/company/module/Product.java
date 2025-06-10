package com.company.module;

public class Product {
	
	//Attributes for product
	private int productId;
	private String productName;
	private double price;
	private int stock;
	
	
	//Parameterized constructor
	public Product(int productId, String productName, double price, int stock)
	{
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.stock = stock;
	}
	
	
	//Getter
	public int getProductId()
	{
		return productId;
	}
	public String getProductName()
	{
		return productName;
	}
	public double getPrice()
	{
		return price;
	}
	public int getStock()
	{
		return stock;
	}

}
