package ARRAYS.Easy;

import java.util.Scanner;

public class _13_RemoveDuplicateFromSortedArray {


    public static int removeDuplicate(int[] arr){
        int n = arr.length;
        if(n <= 1 ){
            return n;
        }
        int idx = 1;
        for (int i = 1; i < n; i++) {
            if(arr[i] != arr[i-1]){
                arr[idx++] = arr[i];
            }
        }
        return idx;
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :");
        int s = sc.nextInt();
        System.out.println("Enter numbers for array : ");
        int[] numbers = new int[s];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Original array : ");
        printArray(numbers);
        System.out.println();

        int newIdx = removeDuplicate(numbers);
        System.out.println("Array after removing duplicates : ");
        for (int i = 0; i < newIdx; i++) {
            System.out.print(numbers[i]+" ");
        }


    }
}
