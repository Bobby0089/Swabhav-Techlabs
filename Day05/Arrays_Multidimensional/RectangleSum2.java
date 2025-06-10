package Arrays_Multidimensional;

import java.util.Scanner;

//APPROACH 2
public class RectangleSum2 {
    static void prefixSum(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;

            //  traverse horizontally to calculate row-wise prefix sum
            for (int i = 0; i < r; i++) {
                for (int j = 1; j < c; j++) {
                    arr[i][j] += arr[i][j-1];
                }
            }

    }
    static int findSum2(int[][] arr, int l1, int r1, int l2, int r2){
        int sum = 0;
        prefixSum(arr);

        for (int i = l1; i <= l2; i++) {
            // r1 to r2 sum for row i
            if(r1 >= 1){
                sum += arr[i][r2] - arr[i][r1-1];
            }
            else {
                sum += arr[i][r2];
            }
        }
        return sum;
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

        System.out.println("Enter Rectangle boundaries  l1, r1, l2, r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("Rectangle sum = "+ findSum2(arr, l1, r1, l2, r2));
    }
}
