package STRINGS;

import java.util.Scanner;

public class Lexography {

    public static int lexography(String s1, String s2){
        int l1 = s1.length(), l2 = s2.length();
        if(l1 == l2){
            for (int i = 0; i < s1.length(); i++) {
                if((int)s1.charAt(i) == (int) s2.charAt(i)){
                    continue;
                }else {
                    return (int)s1.charAt(i) - (int)s2.charAt(i);
                }
            }
        }else if(l1 > l2) return l1 - l2;
        return l2 - l1;
    }
    public static void main(String[] args) {
        String str1 = "";
        String str2 = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st String : ");
        str1 = sc.nextLine();
        System.out.println("Enter the 2nd String : ");
        str2 = sc.nextLine();
        int ans = lexography(str1,str2);
        if(ans > 0) System.out.println("String 1 is greater.");
        else if (ans < 0) System.out.println("String 2 is greater.");
        else System.out.println("Both the Strings are equal");

    }
}
