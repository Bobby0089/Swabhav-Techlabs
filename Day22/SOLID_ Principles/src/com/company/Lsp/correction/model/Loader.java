package com.company.Lsp.correction.model;

public class Loader implements IWorker{

	@Override
	public void start() {
		System.out.println("Employee has start working");
	}

	@Override
	public void stop() {
		System.out.println("Employee has stop working");
	}

	@Override
	public void eat() {
		System.out.println("Employee is eating ");
	}

	@Override
	public void rest() {
		System.out.println("employee is taking rest");
	}

}
