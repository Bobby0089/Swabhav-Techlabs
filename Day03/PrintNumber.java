package Loops;

public class PrintNumber {

	public static void main(String[] args) {

		System.out.println("NUmbers form 1 to 10");

		System.out.println("Using for loop.");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1 + " ");
		}

		System.out.println("Using while loop. ");
		int j = 1;
		while(j <= 10){
			System.out.println(j);
			j++;
		}
		
		 
	}
}
