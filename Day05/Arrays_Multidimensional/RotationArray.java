package Arrays_Multidimensional;

import java.util.Scanner;

public class RotationArray {
//    static void printArray(int[][] arr){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
    static void rotateClockwise(int[][] arr, int r, int c){
        for (int i = 0; i < r; i++) {
            for (int j = c-1; j >= 0 ; j--) {
                System.out.print(arr[j][i]+" ");
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
        int[][] arr = new int[r][c];
        System.out.println("Enter " + r*c + " number of elements for 1st matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Rotated array : ");
        rotateClockwise(arr,r,c);


    }

}
