package DataTypes;

public class ImpolicitTypeCast {

	public static void main(String[] args) {
		
		byte number1 = 101;
		short number2 = number1;
		int number3 = number2;
		long number4 = number3;
		float number5 = number4;
		double number6 = number5;
		
		System.out.println("byte = "+number1);
		System.out.println("Short = "+number2);
		System.out.println("int = "+number3);
		System.out.println("long = "+number4);
		System.out.println("float = "+number5);
		System.out.println("double = "+number6);
		
		char ch = 'A';
		int ascii = ch;
		System.out.println("Ascii = "+ascii);

	}

}
