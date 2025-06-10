package com.company.exceptionHandling;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		 try {
	            int[] arr = {1, 2, 3};
	            System.out.println(arr[4]); 
	        } catch (ArrayIndexOutOfBoundsException e) {
	            e.printStackTrace();
	        } 
	        catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	}

}
