package com.company.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.company.model.CallableDemo;

public class CallableTest {

	public static void main(String[] args) {
		
		ExecutorService e = Executors.newFixedThreadPool(3);

		CallableDemo task1 = new CallableDemo("A");
		CallableDemo task2 = new CallableDemo("B");
		CallableDemo task3 = new CallableDemo("C");
		
		Future<String> f1 = e.submit(task1);
		Future<String> f2 = e.submit(task2);
		Future<String> f3 = e.submit(task3);
		
		try
		{
			System.out.println(f1.get());
			System.out.println(f2.get());
			System.out.println(f3.get());
		}
		catch(InterruptedException | ExecutionException a)
		{
			a.getMessage();
		}
		finally
		{
			e.shutdown();
		}
	}

}
