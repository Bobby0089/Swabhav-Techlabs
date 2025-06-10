package com.company;

import java.util.*;
public class SwapNumber {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number 1 = ");
		int number1 = sc.nextInt();
		
		System.out.print("Enter number 2 = ");
		int number2 = sc.nextInt();
		
		System.out.println("Number before swaping ");
		System.out.println("Number1 = "+ number1);
		System.out.println("Number2 = "+ number2);
		
		int temp = number1;
		number1 = number2;
		number2 = temp;
		
		System.out.println("Number after swaping ");
		System.out.println("Number1 = "+ number1);
		System.out.println("Number2 = "+ number2);
	}

}
