package com.company.queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class DeQueueBasics {

	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<Integer>();

		//Add Elements
		queue.add(55);
		queue.add(99);
		queue.add(33);
		queue.add(22);
		queue.add(45);
		queue.add(65);
				
		Iterator<Integer> it = queue.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
