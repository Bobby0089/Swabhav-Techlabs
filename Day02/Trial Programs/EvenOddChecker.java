package com.company;

import java.util.*;

public class EvenOddChecker {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to check if it is even or odd = ");
		int number = sc.nextInt();
		
		if(number % 2 == 0) System.out.println("The number "+number+" is even.");
		else System.out.println("The number "+number+" is odd.");
		
	}

}
