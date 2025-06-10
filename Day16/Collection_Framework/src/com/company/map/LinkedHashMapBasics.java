package com.company.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapBasics {

	public static void main(String[] args) {
		// Declaration
		
		Map<Integer, Character> linkedHashMap = new LinkedHashMap<Integer, Character>();
				
		LinkedHashMap<Integer, Character> linkedHashMap2 = new LinkedHashMap<Integer, Character>();
				
		//Adding Elements
		int ascii = 107;
		for(int i = 0; i < 5; i++)
		{
			linkedHashMap2.put((i+1),(char)ascii++);
		}
				
		System.out.println(linkedHashMap2);

	}

}
