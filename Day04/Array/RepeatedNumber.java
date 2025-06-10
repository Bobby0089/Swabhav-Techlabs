package Array;

import java.util.Scanner;

public class RepeatedNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array : ");
		int size = sc.nextInt();
		
		int[] numbers = new int[size];
		System.out.println("Enter elements of Array : ");
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = sc.nextInt();
		}
		
		System.out.println("Enter a number : ");
		int repeatedNumber = sc.nextInt();
		int numCount = 0;
		
		for(int i = 0; i < numbers.length; i++)
		{
			if(numbers[i] == repeatedNumber)
			{
				numCount++;
			}
		}
		
		System.out.printf("The number %d is repeated %d times ",repeatedNumber,numCount);
		
		sc.close();

	}

}
