package com.company.test;

import java.util.Scanner;

import com.company.module.Bank;


public class BankTest {

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
			
			long accountNumber;
			while(true)
			{
				System.out.println("Enter Account Number for account "+(i+1)+" : ");
				accountNumber = sc.nextLong();
				if(accountNumber <= 0)
				{
					System.out.println("Account Number should not be 0. try again ");
					continue;
				}
				else
				{
					boolean isDuplicate = false;
					for(int j = 0; j < i; j++)
					{
						if(accounts[j].getAccountNumber() == accountNumber)
						{
							isDuplicate = true;
							break;
						}
					}
					
					if(isDuplicate)
					{
						System.out.println("Account number already exists . try again ");
					}
					else
					{
						break;
					}
				}
			}
			sc.nextLine();
			
			System.out.println("Enter Holder name for account "+(i+1)+" : ");
			String name = sc.nextLine();
			
			long balance ;
			while(true)
			{
				System.out.println("Enter balance for account "+(i+1)+" : ");
				balance = sc.nextLong();
				if(balance < 0)
				{
					System.out.println("Balance  should not be less than 0. try again ");
					continue;
				}
				else
				{
					break;
				}
			}
			sc.nextLine();
			
			accounts[i] = new Bank(accountNumber,name,balance);
		}
		
		System.out.println();
		System.out.println("Details of all Account Holder :  ");
		System.out.println();

		for(Bank account : accounts)
		{
			account.displayDetails();
			System.out.println();	
		}
		
		
		sc.close();

	}

}
