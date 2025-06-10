package com.company.Lsp.correction.model;

public class Robot implements IWorkable{

	@Override
	public void start() {
		System.out.println("Robot starting");
	}

	@Override
	public void stop() {
		System.out.println("Robot stops");
	}
	

}
