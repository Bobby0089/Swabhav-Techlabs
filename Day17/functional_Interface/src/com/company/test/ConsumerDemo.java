package com.company.test;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		Consumer<String> printMsg = message -> System.out.println("Message 1 to uppercase : "+message.toUpperCase());
		Consumer<String> printMsg2 = message -> System.out.println("Message  2 to lowercase: "+message.toLowerCase());
		Consumer<Integer> printNum = number -> System.out.println("number : "+ number);
		
		printMsg.accept("hello");
		printNum.accept(55);
		System.out.println("------------------------------------------");
		System.out.println("BiConsumer  : ");
		BiConsumer<String,Integer> print = (s,i) -> System.out.println(s+i);
		print.accept("hello ", 123);
		System.out.println("------------------------------------------");
		
		//Consumer Chaining
		System.out.println("Consumer chaining  : ");
		printMsg.andThen(printMsg2).accept("Hello");
	}

}
