package Arrays_Multidimensional;

import java.util.Scanner;

public class GenerateSpiral {
    static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] generateSpiralMatrix(int n){
        int[][] ans = new int[n][n];
        int topRow = 0; int rightCol = n-1; int bottomRow = n-1;
        int leftCol = 0;
        int current = 1;

        while(current <= n * n){
            //topRow  -->  leftCol  to  rightCol
            for (int i = leftCol; i <= rightCol && current <= n * n; i++) {
                ans[topRow][i] = current++;
            }
            topRow++;

            //rightCol  -->  topRow  to bottomRow
            for (int j = topRow; j <= bottomRow && current <= n * n ; j++) {
                ans[j][rightCol] = current++;
            }
            rightCol--;

            //bottomRow  -->  rightCol  to  leftCol
            for (int k = rightCol; k >= leftCol && current <= n * n; k--) {
                ans[bottomRow][k] = current++;
            }
            bottomRow--;

            //leftCol  -->  bottomRow  to topRow
            for (int l = bottomRow; l >= topRow && current <= n * n; l--) {
                ans[l][leftCol] = current++;
            }
            leftCol++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = sc.nextInt();

        int[][] ans = generateSpiralMatrix(n);
        printArray(ans);
    }
}
