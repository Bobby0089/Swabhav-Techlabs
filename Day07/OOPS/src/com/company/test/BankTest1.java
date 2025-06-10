package com.company.test;

import java.util.Scanner;

import com.company.module.Bank;

public class BankTest1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Accounts you want to create: ");
		int accountsNumber = sc.nextInt();
		sc.nextLine();
		
		Bank[] accounts = new Bank[accountsNumber];
		
		for(int i = 0; i < accountsNumber; i++)
		{
			System.out.println("Enter details for Account "+(i+1)+" : ");
			System.out.println();
			
			System.out.println("Enter Account Number for account "+(i+1)+" : ");
			long accountNumber = sc.nextLong();
			sc.nextLine();
			
			System.out.println("Enter Holder name for account "+(i+1)+" : ");
			String name = sc.nextLine();
			
			
			System.out.println("Enter balance for account "+(i+1)+" : ");
			long balance = sc.nextLong();
			sc.nextLine();
			
			accounts[i] = new Bank(accountNumber,name,balance);
		}
		
		for(int i = 0; i < accountsNumber-1; i++)
		{
			for(int j = 0; j < accountsNumber-1-i; j++)
			{
				if(accounts[j].getBalance() < accounts[j+1].getBalance())
				{
					Bank temp = accounts[j];
					accounts[j] = accounts[j+1];
					accounts[j+1] = temp;
				}
			}
		}
		
		System.out.println();
		System.out.println("Details of all Account Holder according to balance in decending order  :  ");
		System.out.println();

		for(Bank account : accounts)
		{
			account.displayDetails();
			System.out.println();	
		}
		
		
		sc.close();

	}

}
