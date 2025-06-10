package com.company.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListBasics {

	public static void main(String[] args) {
		//Declaration
		List<Integer> list = new ArrayList<>();
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		//Adding elements
		arrayList.add(110);
		arrayList.add(12);
		arrayList.add(1650);
		arrayList.add(200);
		arrayList.add(205);
		arrayList.add(100);
		arrayList.add(110);
		
		//Methods
		System.out.println("Contains method : "+ arrayList.contains(100));
		
		System.out.println("getIndex method : "+ arrayList.get(2));
		
		System.out.println("isEmpty method : "+arrayList.isEmpty());
		
		System.out.println("Size method : " + arrayList.size());
		
		System.out.println(arrayList);
		System.out.println("remove method : " + arrayList.remove(2));
		System.out.println(arrayList);
		
		System.out.println("Get method : " + arrayList.get(5));
		
		System.out.println("Sorted method : " );
		arrayList.sort(null);
		System.out.println(arrayList);
		
		System.out.println("Set method : ");
	    arrayList.set(2, 550);
		System.out.println(arrayList);
		
		//for Loop
		System.out.println("Printing Arrayist with the help of for loop. ");
		for(int i = 0; i < arrayList.size(); i++)
		{
			System.out.print(arrayList.get(i) +" ");
		}
		System.out.println();
		
		//for each loop
		System.out.println("Printing Arrayist with the help of for each loop. ");
	    for(Integer i : arrayList)
	    {
	    	System.out.print( i +" ");
	    }
	    System.out.println();
		System.out.println();
		
	    //using iterator
	    System.out.println("Printing ArrayList with the help of Iterator : ");
	    Iterator<Integer> it = arrayList.iterator();
	    
	    while(it.hasNext())
	    {
	    	System.out.print(it.next()+" ");
	    }

		
		
		
		

	}

}
