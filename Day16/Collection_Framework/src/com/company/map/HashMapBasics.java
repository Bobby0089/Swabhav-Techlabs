package com.company.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {

	public static void main(String[] args) {
		// Declaration
		
		Map<Integer, Character> hashMap = new HashMap<Integer, Character>();
		
		HashMap<Integer, Character> hashMap2 = new HashMap<Integer, Character>();
		
		//Adding Elements
		int ascii = 97;
		for(int i = 0; i < 5; i++)
		{
			hashMap2.put((i+1),(char)ascii++);
		}
		
		System.out.println(hashMap2);
	
	}

}
