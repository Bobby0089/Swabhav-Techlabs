package com.company.test;

import java.util.Scanner;
import com.company.module.Product;
import com.company.module.ShoppingCart;

public class OnlineShoppingCartSystem {

	public static void main(String[] args) {
		// Creating a Scanner object for user input
		Scanner sc = new Scanner(System.in);
		
		// Asking user for the number of products to add to the cart
		System.out.println("Enter number of Product you want to add to the cart : ");
		int productNumber = sc.nextInt();
		sc.nextLine();
		
		// Creating a ShoppingCart object
		ShoppingCart shoppingCart = new ShoppingCart();
		
		// Loop to take product details input
		for(int i = 0; i < productNumber; i++)
		{
			System.out.println("Enter details of product "+(i+1)+" : ");
			System.out.println();
			
			System.out.println("Enter Id for product "+(i+1)+" : ");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter name of product "+(i+1)+" : ");
			String name = sc.nextLine();
			
			System.out.println("Enter price of product "+(i+1)+" : ");
			double price = sc.nextDouble();
			sc.nextLine();
			
			System.out.println("Enter number of product available in stock "+(i+1)+" : ");
			int stock = sc.nextInt();
			sc.nextLine();
			
			Product products = new Product(id,name,price,stock);
			
			shoppingCart.addProduct(products);
			
		}
		System.out.println("All products are added ");
		shoppingCart.displayCart();
		System.out.println();
		
		while(true)
		{
			System.out.println("What do you want to do? ");
			System.out.println("1. Get bill ");
			System.out.println("2. Remove product ");
			System.out.println("3. Display cart");
			System.out.println("4. Exit ");
			
			
			int choice = sc.nextInt();
			if(choice == 1)
			{
				double totalAmount = shoppingCart.calculateTotal();
				System.out.println("Total amount for this cart = "+totalAmount);
			}
			else if(choice == 2)
			{
				System.out.println("Enter product name you want to remove. ");
				String removeProductName = sc.next();
				shoppingCart.removeProduct(removeProductName);
			}
			else if(choice == 3)
			{
				shoppingCart.displayCart();
			}
			else if(choice == 4)
			{
				System.out.println();
				System.out.println("... Thank you for shopping!");
				break;
			}
		}

		
		// closing scanner
        sc.close();
	}
}

