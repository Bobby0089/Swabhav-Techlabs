package com.company.Lsp.voilation.model;

public class Labour implements IWorker{

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Employee has start working");
	}

	@Override
	public void StopWork() {
		// TODO Auto-generated method stub
		System.out.println("Employee has stop working");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Employee is eating ");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Employee is Drinking ");
	}

}
