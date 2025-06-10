package Loops;

import java.util.*;

public class CheckArmstrongNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number you want to check for Armstrong : ");
		int number = sc.nextInt();
		
		int digitcount = 0;
		int temp = number;
		while(temp > 0) {
			temp /= 10;
			digitcount++;
		}
		
		int sum = 0;
		temp = number;
		while(temp>0) {
			int n = temp % 10;
			sum = (int) (sum + Math.pow(n, digitcount));
			temp /= 10;
		}
		
		if(number == sum) System.out.println("The given number is Armstrong!!");
		else System.out.println("The given number is not an Armstrong!!");
	}

}
