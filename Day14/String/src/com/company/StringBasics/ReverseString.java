package com.company.StringBasics;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String to reverse : ");
		String userInput = sc.next();
		
		StringBuilder sb = new StringBuilder(userInput);
		sb.reverse();
		String ans = sb.toString();
		
		System.out.println("Original String  : "+userInput);
		System.out.println("Reversed String : "+ans);
		
		sc.close();
		
	}
}
