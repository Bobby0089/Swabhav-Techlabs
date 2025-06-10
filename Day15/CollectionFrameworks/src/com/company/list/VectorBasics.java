package com.company.list;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorBasics {

	public static void main(String[] args) {
		//Declaration
		List<Integer> list = new Vector<>();
		
		Vector<Integer> vector = new Vector<>();
		
		//Adding elements
		vector.add(11);
		vector.add(102);
		vector.add(150);
		vector.add(290);
		vector.add(25);
		vector.add(60);
		vector.add(110);
		
		//Methods
		System.out.println("Contains method : "+ vector.contains(100));
		
		System.out.println("getIndex method : "+ vector.get(2));
		
		System.out.println("isEmpty method : "+vector.isEmpty());
		
		System.out.println("Size method : " + vector.size());
		
		System.out.println(vector);
		System.out.println("remove method : " + vector.remove(2));
		System.out.println(vector);
		
		System.out.println("Get method : " + vector.get(5));
		
		System.out.println("Sorted method : " );
		vector.sort(null);
		System.out.println(vector);
		
		System.out.println("Set method : ");
		vector.set(2, 550);
		System.out.println(vector);
		
		//for Loop
		System.out.println("Printing Vector with the help of for loop : ");
		for(int i = 0; i < vector.size(); i++)
		{
			System.out.print(vector.get(i) +" ");
		}
		System.out.println();
		System.out.println();
		
		//for each loop
		System.out.println("Printing Vector with the help of for each loop : ");
	    for(Integer i : vector)
	    {
	    	System.out.print( i +" ");
	    }
	    System.out.println();
		System.out.println();
		
	    //using iterator
	    System.out.println("Printing Vector with the help of Iterator : ");
	    Iterator<Integer> it = vector.iterator();
	    
	    while(it.hasNext())
	    {
	    	System.out.print(it.next()+" ");
	    }

	}

}
