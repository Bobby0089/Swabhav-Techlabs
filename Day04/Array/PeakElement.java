package Array;

import java.util.Scanner;

public class PeakElement {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter the size for array : ");
		int size = userInput.nextInt();
		
		int[] arr = new int[size];
		int[] ans = new int[size];
		
		System.out.print("Enter element of  array : ");
		for(int i = 0;i < arr.length;i++) {
			arr[i] = userInput.nextInt();
			ans[i] = -1;
		}
		
		for(int i = 1; i < arr.length -1; i++) {
			if(i == 1 && arr[i-1] > arr[i]) {
				ans[i] = arr[i-1];
			}
			if(i == arr.length-2 && arr[i] < arr[i+1]) {
				ans[i] = arr[i+1];
			}
			if(arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
				ans[i] = arr[i];
			}
		}
		
		for(int i = 0; i < ans.length; i++) {
			if(ans[i] != -1) {
				System.out.println("peak element : "+ ans[i]);
			}
		}
		
		userInput.close();
	}

}
