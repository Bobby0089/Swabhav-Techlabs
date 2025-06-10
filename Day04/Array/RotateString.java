package Array;

import java.util.Scanner;

public class RotateString {
	static String reverse(String s, int starting, int ending) {
		int st = starting;
		int  end= ending;
		String r = "";
	    char ch;
		
		for (int i = st; i < end; i++)
		{
	      ch = s.charAt(i);
	      r = ch + r; 
	    }
		
		return r;
	}
	 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String userString = sc.next();
		System.out.println("How many times you want to shift the character : ");
		int numberOfShifts = sc.nextInt();
		int ActualShift = numberOfShifts % userString.length();
		
		
		
		String ans = reverse(userString,0,ActualShift);
		ans += reverse(userString,ActualShift,userString.length());
	    ans = reverse(ans,0,userString.length());
		
		System.out.println(ans);
		
		sc.close();

	}

}
