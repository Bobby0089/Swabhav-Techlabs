package Array;

import java.util.Scanner;

public class MaxConsecutive1s {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size for array : ");
		int size = sc.nextInt();
		
		int[] numbers = new int[size];
		
		System.out.print("Enter element of  array : ");
		for(int i = 0;i < numbers.length;i++)
		{
			numbers[i] = sc.nextInt();
		}
		
		int max1 = 0;
		int count = 0;
		for(int i = 0; i < numbers.length; i++)
		{
            if (numbers[i] == 0)
            {
            	 count = 0;
            }   
            else
            {
                count++;
                max1 = Math.max(max1, count);
            }
        }
		
		System.out.println(max1);        
		sc.close();
		
		
		 
		
	}

}
