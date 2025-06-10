package com.company;

import java.util.Scanner;

public class SeasonInIndia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter month number : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1:
		case 2:
		case 3:
			System.out.println("Month "+month+" comes in Winter. ");
			break;
			
		case 4:
		case 5:
		case 6:
			System.out.println("Month "+month+" comes in Summer. ");
			break;
			
		case 7:
		case 8:
		case 9:
			System.out.println("Month "+month+" comes in Monsoon. ");
			break;
			
		case 10:
		case 11:
		case 12:
			System.out.println("Month "+month+" comes in Spring. ");
			break;
			
		default:
			System.out.println("Invalid month number");
			System.out.println("Enter month number between 1 - 12 ");
		}

	}

}
