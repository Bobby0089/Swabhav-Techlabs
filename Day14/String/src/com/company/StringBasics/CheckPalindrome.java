package com.company.StringBasics;

import java.util.Scanner;

public class CheckPalindrome {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String to check for palindrome : ");
		String userInput = sc.next();
		
		String reverse = checkForPalindrome(userInput);
		
		if(reverse.equals(userInput))
		{
			System.out.println("Enter String is Palindrome");
		}
		else System.out.println("Enter String is not Palindrome");
		
		sc.close();
	}
	
	private static String checkForPalindrome(String input)
	{
		String ans = "";
		String original = input;
		
		for(int i = original.length()-1; i >= 0; i--)
		{
			ans = ans + original.charAt(i);
		}
		return ans;
	}
}
