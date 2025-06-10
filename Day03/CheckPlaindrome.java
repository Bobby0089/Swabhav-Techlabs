package Loops;

import java.util.*;

public class CheckPlaindrome {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int number = sc.nextInt();
		
		int temp = number;
		int reversedNumber = 0;
		
		while(temp>0) {
			int n = temp % 10;
			reversedNumber = reversedNumber * 10 + n;
			temp /= 10;
		}
		
		if(number == reversedNumber) System.out.println("The given number is Palindrome!! ");
		else System.out.println("The given number is not a  Palindrome!! "); 
		
		sc.close();
		
	}

}
