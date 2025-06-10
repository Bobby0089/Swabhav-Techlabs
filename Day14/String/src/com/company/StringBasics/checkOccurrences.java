package com.company.StringBasics;

import java.util.Scanner;

class checkOccurrences {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String to to check Occurence of each word : ");
		String userInput = sc.next();
		
		String answer = getOccurence(userInput);
		

		System.out.println("String after count of each character : "+answer);
		
		sc.close();

	}

	private static String getOccurence(String userInput) {
		int i = 0, j = 1;
		String ans = "";
		String s = userInput;
		int count = 1;
		ans += s.charAt(i);
		
		while(j!=s.length())
		{
			if(s.charAt(i) == s.charAt(j))
			{
				count++;
			}
			else
			{
				ans += count;
				count = 1;
				i = j;
				ans += s.charAt(i);
			}
			j++;
		}
		
		return ans+=count;
	}

}
