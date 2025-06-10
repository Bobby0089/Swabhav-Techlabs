package Loops;

import java.util.*;
public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of rows : ");
		int rows = sc.nextInt();
		
		for(int i = rows; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
