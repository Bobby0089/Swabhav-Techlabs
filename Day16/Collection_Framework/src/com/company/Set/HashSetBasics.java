package com.company.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetBasics {

	public static void main(String[] args) {
		// Declaration
		
		Set<String> hashSet = new HashSet<String>();
		
		HashSet<String> hashSet2 = new HashSet<String>();
		
		HashSet<String> hashSet3 = new HashSet<String>();
		
		//adding elements
		hashSet.add("B");
		hashSet.add("A");
		hashSet.add("C");
		hashSet.add("E");
		
		hashSet2.add("A");
		hashSet2.add("C");
		hashSet2.add("E");
		hashSet2.add("G");
		hashSet2.add("I");
		
		
		hashSet3.add("B");
		hashSet3.add("D");
		hashSet3.add("f");
		hashSet3.add("H");
		
		System.out.println(hashSet2);
		hashSet2.add(null);
		hashSet2.add(null);
		
		//Methods
		System.out.println("Contain method : "+hashSet2.contains("A"));
		System.out.println("size method : "+hashSet.size());
		System.out.println("Equals method : "+hashSet.equals(null));
		System.out.println("isEmpty method : "+hashSet.isEmpty());
		
		System.out.println("Remove method : "+hashSet.remove(null));
		hashSet2.addAll(hashSet3);
		System.out.println("addAll method : "+hashSet2);
		hashSet2.removeAll(hashSet3);
		System.out.println("removeAll method : "+hashSet2);
		hashSet.retainAll(hashSet2);
		System.out.println("retainAll method : "+hashSet2);
		
		
		
		

	}

}
