package Arrays_Multidimensional;

import java.util.Scanner;

//APPROACH 1  --->  BRUTE FORCE
public class RectangleSum {
    static int findSum(int[][] arr, int l1, int r1, int l2, int r2){
        int sum = 0;

        for (int i = l1; i <= l2 ; i++) {
            for (int j = r1; j <= r2 ; j++) {
                sum += arr[i][j];
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

        System.out.println("Rectangle sum = "+ findSum(arr, l1, r1, l2, r2));
    }
}
