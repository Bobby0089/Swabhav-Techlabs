package com.company.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListBasics {

	public static void main(String[] args) {
		//Declaration
		List<Integer> list = new LinkedList<>();
		
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		//Adding elements
		linkedList.add(59);
		linkedList.add(35);
		linkedList.add(1650);
		linkedList.add(88);
		linkedList.add(95);
		linkedList.add(100);
		linkedList.add(110);
		
		//Methods
		System.out.println("Contains method : "+ linkedList.contains(100));
		
		System.out.println("getIndex method : "+ linkedList.get(2));
		
		System.out.println("isEmpty method : "+linkedList.isEmpty());
		
		System.out.println("Size method : " + linkedList.size());
		
		System.out.println(linkedList);
		System.out.println("remove method : " + linkedList.remove(2));
		System.out.println(linkedList);
		
		System.out.println("Get method : " + linkedList.get(5));
		
		System.out.println("Sorted method : " );
		linkedList.sort(null);
		System.out.println(linkedList);
		
		System.out.println("Set method : ");
	    linkedList.set(2, 550);
		System.out.println(linkedList);
		
		//for Loop
		System.out.println("Printing LinkedList with the help of for loop. ");
		for(int i = 0; i < linkedList.size(); i++)
		{
			System.out.print(linkedList.get(i) +" ");
		}
		System.out.println();
		
		//for each loop
		System.out.println("Printing LinkedList with the help of for each loop. ");
	    for(Integer i : linkedList)
	    {
	    	System.out.print( i +" ");
	    }System.out.println();
		System.out.println();
		
	    //using iterator
	    System.out.println("Printing LinkedList with the help of Iterator : ");
	    Iterator<Integer> it = linkedList.iterator();
	    
	    while(it.hasNext())
	    {
	    	System.out.print(it.next()+" ");
	    }

	}

}
