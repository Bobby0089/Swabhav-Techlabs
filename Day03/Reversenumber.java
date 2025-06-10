package Loops;

import java.util.*;

public class Reversenumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		
		int result = 0;
		int temp = number;
		
		while(temp>0) {
			int n = temp % 10;
			result = result * 10 + n;
			temp /= 10;
		}
		
		System.out.println("Original number = "+number);
		System.out.println("Reversed number = "+result);
	}
}
