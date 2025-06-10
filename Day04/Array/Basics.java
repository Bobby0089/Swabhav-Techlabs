package Array;
              
public class Basics {

	public static void main(String[] args) {
		
		//Declaring an array
		int [] arr1;  
		int arr2[];
		
		//Allocating memory
		arr1 = new int[5];
		int[] arr3 = new int[5];
		int[] arr4 = {1,2,3,4,5};
		
		//Iterating array
		for(int i = 0;i < arr4.length;i++) {
			System.out.print(arr4[i]+" ");
		}
		System.out.println();
		
		for(int num : arr4) {
			System.out.print(num+" ");
		}

	}

}
