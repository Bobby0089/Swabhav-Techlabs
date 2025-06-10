package com.company.queue;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueBasics {

	public static void main(String[] args)  {
		// Declaration 
		Queue<Integer> queue = new PriorityQueue<>(5);
		
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
		
		System.out.println(queue);

		System.out.println("Peek method : "+queue.peek());
		
		System.out.println("Poll method : " + queue.poll());
		
		System.out.println("Offer method : " + queue.offer(5));
		
		queue.clear();
		
		try
		{
			System.out.println(queue.remove());
		}catch(NoSuchElementException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println(queue.poll());
		}
		
	}

}
