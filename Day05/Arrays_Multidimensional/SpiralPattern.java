package Arrays_Multidimensional;

import java.util.Scanner;

public class SpiralPattern {
    static void printSpiral(int[][] arr, int r, int c){
        int topRow = 0; int rightCol = r-1; int bottomRow = r-1;
        int leftCol = 0;
        int totalElements = 0;

        while(totalElements < r * c){
            //topRow  -->  leftCol  to  rightCol
            for (int i = leftCol; i <= rightCol && totalElements < r * c; i++) {
                System.out.print(arr[topRow][i]+" ");
                totalElements++;
            }
            topRow++;

            //rightCol  -->  topRow  to bottomRow
            for (int j = topRow; j <= bottomRow && totalElements < r * c ; j++) {
                System.out.print(arr[j][rightCol]+" ");
                totalElements++;
            }
            rightCol--;

            //bottomRow  -->  rightCol  to  leftCol
            for (int k = rightCol; k >= leftCol && totalElements < r * c; k--) {
                System.out.print(arr[bottomRow][k]+" ");
                totalElements++;
            }
            bottomRow--;

            //leftCol  -->  bottomRow  to topRow
            for (int l = bottomRow; l >= topRow && totalElements < r * c; l--) {
                System.out.print(arr[l][leftCol]+" ");
                totalElements++;
            }
            leftCol++;
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
        printSpiral(arr,r,c);
    }
}
