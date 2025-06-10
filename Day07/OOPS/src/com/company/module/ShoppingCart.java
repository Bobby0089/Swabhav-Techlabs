package com.company.module;

import java.util.ArrayList;

public class ShoppingCart {
	
	private ArrayList<Product> cart;
	
	//default constructor
	public ShoppingCart()
	{
		cart = new ArrayList<Product>();
	}
	
	// Method to add product in cart
	public void addProduct(Product p)
	{
		cart.add(p);
	}
	
	// Method to remove product from the cart
	public void removeProduct(String name) {
		
	    for (int i = 0; i < cart.size(); i++)
	    {
	        if (cart.get(i).getProductName().equals(name))
	        {
	            cart.remove(i);
	            System.out.println(name + " has been removed from the cart.");
	            return;
	        }
	    }
	    System.out.println(name + " not found in the cart.");
	}
	
	// Method to display product in cart
	public void displayCart()
	{
		if (cart.isEmpty())
		{
            System.out.println("The cart is empty.");
            return;
        }
		
        System.out.println("Cart Contents:");
        for (Product p : cart)
        {
        	System.out.println("Product Name: " + p.getProductName());
            System.out.println("Product ID: " + p.getProductId());
            System.out.println("Price: " + p.getPrice());
            System.out.println("Stock: " + p.getStock());
            System.out.println("-------------------------");
        }
	}
	
	// Method to calculate total amount in the cart
	public double calculateTotal()
	{
		double totalAmount = 0.0;
		
		for(int  i = 0; i < cart.size(); i++)
		{
			totalAmount += (cart.get(i).getPrice())*(cart.get(i).getStock());
		}
		
		return totalAmount;
	}	
}
