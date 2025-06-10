package com.company.behavioural.template.test;

import com.company.behavioural.template.model.BevaragesTemplete;
import com.company.behavioural.template.model.Coffee;
import com.company.behavioural.template.model.Tea;

public class TemplateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Preparing Tea");
		BevaragesTemplete tea = new Tea();
		tea.preparingBevarage();
		
		System.out.println("......................");
		
		System.out.println("Preparing Coffee");
		BevaragesTemplete Coffee = new Coffee ();
		Coffee.preparingBevarage();
	}

}
