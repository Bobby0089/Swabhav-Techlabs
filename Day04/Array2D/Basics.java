package Array2D;

import java.util.Scanner;

public class Basics {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		
	    System.out.println("Enter number of rows for array : ");
	    int rows = sc.nextInt();
	    System.out.println("Enter number of columns for array : ");
	    int columns = sc.nextInt();
	    
	    System.out.println("Enter "+rows*columns+" elements for the array : ");
	    int[][] numbers = new int[rows][columns];
	    for(int i = 0; i < rows; i++)
	    {
	    	for(int j = 0; j < columns; j++)
	    	{
	    		numbers[i][j] = sc.nextInt();
	    	}
	    	System.out.println();
	    }
	    
	    System.out.println("Elements of the array : ");
	    for(int i = 0; i < rows; i++)
	    {
	    	for(int j = 0; j < columns; j++)
	    	{
	    		System.out.print(numbers[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	    
		sc.close();
	}

}
