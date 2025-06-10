package DataTypes;

public class ExplicitTypeCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		double -> float -> long -> int -> char -> short -> byte.
		
		int number1 = 130;
		byte number2 = (byte)number1;
		System.out.println(number2);
		
		int number3 = 97;
		char ch = (char)number3;
		System.out.println("number "+number3+" to char is: "+ch);
		
		double number4 = 89.0005d;
		long number5 = (long)number4;
		System.out.println(number5);

	}

}
