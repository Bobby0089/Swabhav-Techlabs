package Loops;

import java.util.*;
public class SumOFNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int number = sc.nextInt();
		
		int sum = 0;
		while(number > 0) {
			int n = number % 10;
			sum += n;
			number /= 10;
		}
		
		System.out.println("The sum of given number is = "+ sum);
		
	}
}
