package Array;

import java.util.Scanner;
public class LargestElement {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter the size for array : ");
		int size = userInput.nextInt();
		
		int[] arr = new int[size];
		
		System.out.print("Enter element of  array : ");
		for(int i = 0;i < arr.length;i++) {
			arr[i] = userInput.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("maximum element in array is : " +max);
		

	}

}
