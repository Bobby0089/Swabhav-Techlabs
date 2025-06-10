package STRINGS;

import java.util.Scanner;

public class LexographyTest {

    public static void main(String[] args) {
        String str1 = "";
        String str2 = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st String : ");
        str1 = sc.nextLine();
        System.out.println("Enter the 2nd String : ");
        str2 = sc.nextLine();
        if (compareLexographically(str1, str2) > 0) {
            System.out.println("String 1 is greater.");
        } else if (compareLexographically(str1, str2) < 0) {
            System.out.println("String 2 is greater.");
        } else {
            System.out.println("Both the Strings are equal");
        }

    }

    private static int compareLexographically(String str1, String str2) {
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            if ((int) str1.charAt(i) == (int) str2.charAt(i)) {
                continue;
            } else {
                return (int) str1.charAt(i) - (int) str2.charAt(i);
            }
        }

        // Edge case for strings like
        // String 1="Geeky" and String 2="Geekyguy"
        if (str1.length() < str2.length()) {
            return (str1.length() - str2.length());  //Idhar par tu "-1" bhi return kar sakta hai
        } else if (str1.length() > str2.length()) {
            return (str1.length() - str2.length());  //Idhar par tu "1" bhi return kar sakta hai
        }

        // If none of the above conditions is true,
        // it implies both the strings are equal
        else {
            return 0;
        }

    }

}

    