package com.company.test;

import java.util.Scanner;

public class CalisthenicsTest1 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		
	    //Taking input for array size                 
	    System.out.println("Enter number of rows for array : ");
	    int rows = sc.nextInt();
	    System.out.println("Enter number of columns for array : ");
	    int columns = sc.nextInt();
	    
	    
	    System.out.println("Enter "+rows*columns+" elements for the array : ");
	    int[][] numbers = new int[rows][columns];
	    
	    
	   //prompt user to give input for the array
	    for(int i = 0; i < rows; i++)
	    {
	    	readColumns(i,columns,numbers,sc);
	    }
	    	
	    
	    //Printing the array
	    System.out.println("Elements of the array : ");
	    System.out.println();
	    for(int i = 0; i < rows; i++)
	    {
	    	printArray(i,columns,numbers);
	    }
	    
	    //Close the  Scanner 
		sc.close();
	}
	
	
	//Method to take columns as input for rows
	private static void readColumns(int row, int columns, int[][] arr, Scanner sc)
	{	
		for(int j = 0; j < columns; j++)
		{
			arr[row][j] = sc.nextInt();
		}
		System.out.println();
	}
	
	//Method to print columns of the rows
	private static void printArray(int row, int columns, int[][] arr)
	{	
		for(int j = 0; j < columns; j++)
		{
			System.out.print(arr[row][j]+" ");
		}
		System.out.println();
	}
}


