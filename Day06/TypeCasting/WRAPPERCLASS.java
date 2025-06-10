package DataTypes;

public class WRAPPERCLASS {
	public static void main(String[] args) {
		
		//AUTOBOXING
		System.out.println("AUTOUNBOXING");
		
		int num = 100;
		Integer obj = num;
		System.out.println("int  "+num+" : "+"Integer  "+obj);
		
		float num2 = 89.75f;
		Float obj2 = num2;
		System.out.println("float  "+num2+" : "+"Float  "+obj2);
		System.out.println();
		
		
	
		
		//AUTOUNBOXING
		
		System.out.println("AUTOUNBOXING");
		Integer obj3 = Integer.valueOf(2500);
		int number3 =  obj3;
		System.out.println("Integer  "+obj3+" : "+"int  "+number3);
		
		
		String st1 = "1234";
		Integer number4 = Integer.parseInt(st1);
		System.out.println("String  "+number4+" : "+"Integer  "+st1);
		
		
		Integer number5 = 50;
		String st2 = number5.toString();
		System.out.println("Integer  "+number5+" : "+"String  "+st2);
		
		
		
	}

}
