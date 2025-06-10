package com.company.AtmMachine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) throws InsufficientFundsException {
		Scanner sc = new Scanner(System.in);
		int nubmerOfBankAccount = getPositivenumber(sc);
		sc.nextLine();
		
		BankAccount[] accounts = new BankAccount[nubmerOfBankAccount];
		
		for(int i = 0; i < nubmerOfBankAccount; i++)
		{
			System.out.println("Enter accounts details for account "+(i+1)+" : ");
			
			int accountNumber;
			while (true) {
			    try {
			        accountNumber = getPositiveAccountNumber(accounts,sc,i);
			        if (!isDuplicateAccountNumber(accounts, accountNumber, i)) {
			            break;
			        }
			        System.out.println("This account number already exists. Please enter a unique account number.");
			    } catch (AccountNumberException e) {
			        System.out.println(e.getMessage());
			    }
			}
			
			double balance = getPositiveBalance(accounts,sc,i);
			
			accounts[i] = new BankAccount(accountNumber,balance);
			
		}
			
		while(true)
		{
			System.out.println("Enter account number for following operations");
			int accountNumber = sc.nextInt();
			sc.nextLine();
			int checkAccount = checkAccountNumber(accounts,accountNumber);
			
			if(checkAccount >= 0)
			{
				displayStart(sc,checkAccount,accounts);	
				break;
			}
			else {
				System.out.println("Invalid account number. try again");
			}
		}
		
		
	}
	
	private static void displayStart(Scanner sc, int index, BankAccount[] accounts) throws InsufficientFundsException {
		while(true)
		{
			System.out.println();
			displayMenu();
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1: accounts[index].checkBalance();
					break;
					
			case 2 : double amount = getPositiveAmount(sc);
				     try
				     {
				    	 accounts[index].withdraw(amount);
				     }catch(InsufficientFundsException e ) {
				    	 System.out.println(e.getMessage());
				     }
					 break;	
			
		    case 3: double amount2 = getPositiveAmount(sc);
		    	    accounts[index].deposite(amount2);
			 		break;
			 		
            case 4: System.out.println("Exiting.......");return;
            
            default: System.out.println("Invalid choice.");
				
			}		
		}		
	}
	
	private static void displayMenu() {
		System.out.println("1. Check Blance");
		System.out.println("2. Withdraw amount");
		System.out.println("3. Deposite amount");	
		System.out.println("4.Exit. ");
		System.out.println();
		System.out.println("Enter your choice :");
	}

	private static double getPositiveAmount(Scanner sc)
	{
		double amount;
		while(true)
		{
			System.out.println("Enter amount : ");
			amount = sc.nextDouble();
			sc.nextLine();
			
			if(amount > 0)
			{
				return amount;
			}
			System.out.println("Enter a valid amount");
		}
		
	}

	private static int checkAccountNumber(BankAccount[] accounts, int accountNumber) {
		
		for(int i = 0; i < accounts.length; i++)
		{
			if(accounts[i].getAccountNumber() == accountNumber)
			{
				return i;
			}
		}
		return -1;
	}

	private static double getPositiveBalance(BankAccount[] accounts, Scanner sc, int i) {
	    double balance;
	    while(true)
		{
			System.out.println("Enter balance  : ");
			balance = sc.nextDouble();
			sc.nextLine();
			
			if(balance > 0)
			{
				return balance;
			}
			System.out.println("balance should not be 0 or negative. try again");
		}
	}

	private static int getPositiveAccountNumber(BankAccount[] accounts, Scanner sc, int i) throws AccountNumberException
	{
		int accountnumber;
		   while (true) {
		        System.out.print("Enter account number: ");
		        try {
		            int accountNumber = sc.nextInt();
		            sc.nextLine(); 

		            if (accountNumber > 0) {
		                return accountNumber;
		            } else {
		                System.out.println("Account number should be positive. Try again.");
		            }
		        } catch (InputMismatchException e) {
		            sc.nextLine(); 
		            throw new AccountNumberException("Invalid input! Account number must be a  integer.");
		        }
		    }
	}

	private static int getPositivenumber(Scanner sc) {
		int number;
		while(true)
		{
			System.out.println("Enter number of bank account you want to add : ");
			number = sc.nextInt();
			if(number > 0 ) 
			{
				return number;
			}
			System.out.println("Please enter a positive number : ");
		}
	}

	private static boolean isDuplicateAccountNumber(BankAccount[] accounts, int accountNumber, int currentIndex) {
        for (int i = 0; i < currentIndex; i++) {
            if (accounts[i] != null && accounts[i].getAccountNumber() == accountNumber) {
                return true;
            }
        }
        return false;
    }
}
	
	
	
	

