package Arrays_Multidimensional;

import java.util.Scanner;

public class SumOfMatrix {
    static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row for matrix = ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns for matrix = ");
        int c = sc.nextInt();
        int[][] arr1 = new int[r][c];
        System.out.println("Enter " + r*c + " number of elements for 1st matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr1[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        int[][] arr2 = new int[r][c];
        System.out.println("Enter " + r*c + " number of elements for 2nd matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        int[][] sum = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("The sum is : ");
        printArray(sum);
    }
}
