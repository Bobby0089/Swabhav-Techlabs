package Arrays_Multidimensional;

import java.util.Scanner;

public class TransposeOfMatrix {
    static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void transpose(int[][] arr, int r, int c){
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
    static void swapTranspose(int[][] arr, int r, int c){   // THIS METHOD IS ONLY FOR SQUARE MATRIX
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row for matrix = ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns for matrix = ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter " + r*c + " number of elements for 1st matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Transpose array : ");
        transpose(arr,r,c);
//        swapTranspose(arr,r,c);
//        printArray(arr);
    }
}
