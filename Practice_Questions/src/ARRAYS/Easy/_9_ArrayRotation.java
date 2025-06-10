package ARRAYS.Easy;

import java.util.Scanner;

public class _9_ArrayRotation {

    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverseArray(int[] arr, int st, int ed){
        int i = st;
        int j = ed;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    public static void rotateInPlace(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        reverseArray(arr,0,k-1);
        reverseArray(arr,k,n-1);
        reverseArray(arr,0,n-1);
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int s = sc.nextInt();
        System.out.print("Enter number of rotation = ");
        int k = sc.nextInt();

        System.out.println("Enter "+s+" number of elements:");
        int[] arr = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array :");
        printArray(arr);
        System.out.println();

        rotateInPlace(arr,k);
        System.out.println("Array after "+k+" number of rotation:");
        printArray(arr);

    }
}
