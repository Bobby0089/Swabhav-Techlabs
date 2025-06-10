
public class StringBufferBasics {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Bobby");
		sb.append(" Gupta");
		
		int capacity = sb.capacity();
		System.out.println("Capacity  : " + capacity);
		
		char ch = sb.charAt(2);
		System.out.println("chatAt method  : " + ch);
		
		int n = sb.codePointAt(5);
		System.out.println("codePointAt method : " + n);
		
		System.out.println(sb);
		System.out.println("deleteChartAt  : " + sb.deleteCharAt(3));
		
		System.out.println("delete  : " + sb.delete(0, 5));
		 
	
		
	}

}
