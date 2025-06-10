package Arrays_Multidimensional;

import java.util.Scanner;

public class RectangleSum3 {
    static void prefixSum(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;

        //  traverse horizontally to calculate row-wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                arr[i][j] += arr[i][j-1];
            }
        }

        //  traverse vertically to calculate column-wise prefix sum
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                arr[i][j] += arr[i-1][j];
            }
        }

    }
    static int findSum3(int[][] arr, int l1, int r1, int l2, int r2){
        int ans = 0, sum = 0, up = 0, left = 0, leftUp = 0;
        prefixSum(arr);
        sum = arr[l2][r2];
        if(r1 >= 1) {
            left = arr[l2][r1 - 1];
        }
        if(l1 >= 1) {
            up = arr[l1 - 1][r2];
        }
        if(l1 >= 1 && r1 >= 1) {
            leftUp = arr[l1 - 1][r1 - 1];
        }

        ans = sum - left - up + leftUp ;

        return ans;
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

        System.out.println("Rectangle sum = "+ findSum3(arr, l1, r1, l2, r2));
    }
}
