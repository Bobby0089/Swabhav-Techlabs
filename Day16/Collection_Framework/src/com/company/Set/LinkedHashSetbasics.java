package com.company.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetbasics {

	public static void main(String[] args) {
		// Declaration
		
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		
		LinkedHashSet<String> linkedHashSet2 = new LinkedHashSet<String>();
		
		LinkedHashSet<String> linkedHashSet3 = new LinkedHashSet<String>();
		
		//adding elements
		linkedHashSet.add("B");
		linkedHashSet.add("A");
		linkedHashSet.add("C");
		linkedHashSet.add("E");

		linkedHashSet2.add("A");
		linkedHashSet2.add("C");
		linkedHashSet2.add("E");
		linkedHashSet2.add("G");
		linkedHashSet2.add("I");


		linkedHashSet3.add("B");
		linkedHashSet3.add("D");
		linkedHashSet3.add("f");
		linkedHashSet3.add("H");

		System.out.println(linkedHashSet2);
		linkedHashSet2.add(null);
		linkedHashSet2.add(null);

		//Methods
		System.out.println("Contain method : "+linkedHashSet2.contains("A"));
		System.out.println("size method : "+linkedHashSet2.size());
		System.out.println("Equals method : "+linkedHashSet2.equals(null));
		System.out.println("isEmpty method : "+linkedHashSet2.isEmpty());

		System.out.println("Remove method : "+linkedHashSet2.remove(null));
		linkedHashSet2.addAll(linkedHashSet3);
		System.out.println("addAll method : "+linkedHashSet2);
		linkedHashSet2.removeAll(linkedHashSet3);
		System.out.println("removeAll method : "+linkedHashSet2);
		linkedHashSet.retainAll(linkedHashSet2);
		System.out.println("retainAll method : "+linkedHashSet);
	}

}
