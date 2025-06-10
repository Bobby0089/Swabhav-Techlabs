package com.company.StringBasics;

import java.util.Scanner;

public class FindDuplicate {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string t check for duplicate : ");
        String input = sc.nextLine();
        sc.close();

        findDuplicate(input);
    }

    private static void findDuplicate(String str) {
        int[] count = new int[256]; 

        
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        
        System.out.println("Duplicate characters in the string:");
        for (int i = 0; i < 256; i++) {
            if (count[i] > 1) {
                System.out.println((char) i + " - " + count[i]);
            }
        }
    }

}
