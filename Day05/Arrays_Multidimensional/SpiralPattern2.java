package Arrays_Multidimensional;

import java.util.Scanner;

public class SpiralPattern2 {
    static void spiralAnticlock(int[][] arr, int r, int c) {
        int topRow = 0; int rightCol = r-1; int bottomRow = r-1;
        int leftCol = 0;
        int totalElements = 0;
        while(totalElements < r * c){
            //leftCol  -->  topRow  to bottomRow
            for (int i = topRow; i <= bottomRow && totalElements < r * c; i++) {
                System.out.print(arr[i][leftCol]+" ");
                totalElements++;
            }
            leftCol++;

            //bottomRow  -->  leftCol  to  rightCol
            for (int j = leftCol; j <= rightCol && totalElements < r * c; j++) {
                System.out.print(arr[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;

            //rightCol  -->  bottomRow  to topRow
            for (int k = bottomRow; k >= topRow && totalElements < r * c; k--) {
                System.out.print(arr[k][rightCol]+" ");
                totalElements++;
            }
            rightCol--;

            //topRow  -->  rightCol  to  leftCol
            for (int l = rightCol; l >= leftCol ; l--) {
                System.out.print(arr[topRow][l]+" ");
                totalElements++;
            }
            topRow++;
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
        spiralAnticlock(arr,r,c);
    }
}
