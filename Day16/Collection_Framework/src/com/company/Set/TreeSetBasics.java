package com.company.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetBasics {

	public static void main(String[] args) {
		// Declaration
		
		Set<String> treeSet = new TreeSet<String>();

		TreeSet<String> treeSet2 = new TreeSet<String>();
				
		TreeSet<String> treeSet3 = new TreeSet<String>();
				
		//adding elements
		treeSet.add("B");
		treeSet.add("A");
		treeSet.add("C");
		treeSet.add("E");
				
		treeSet2.add("A");
		treeSet2.add("C");
		treeSet2.add("E");
		treeSet2.add("G");
		treeSet2.add("I");
				
		treeSet3.add("B");
		treeSet3.add("D");
		treeSet3.add("f");
		treeSet3.add("H");
			
		System.out.println(treeSet2);
		try
		{
			treeSet2.add(null);
	    	treeSet2.add(null);
		}catch(NullPointerException e)
		{
			
			System.out.println(e.getMessage());
		}
		
		//Methods
		System.out.println("Contain method : "+treeSet2.contains("A"));
		System.out.println("size method : "+treeSet2.size());
		System.out.println("Equals method : "+treeSet2.equals("B"));
		System.out.println("isEmpty method : "+treeSet2.isEmpty());
				
		System.out.println("Remove method : "+treeSet2.remove("A"));
		treeSet2.addAll(treeSet3);
		System.out.println("addAll method : "+treeSet2);
		treeSet2.removeAll(treeSet3);
		System.out.println("removeAll method : "+treeSet2);
		treeSet.retainAll(treeSet2);
		System.out.println("retainAll method : "+treeSet);

	}

}
