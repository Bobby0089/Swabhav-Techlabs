package com.company.Lsp.voilation.model;

public class Robot implements IWorker{
	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Robot has start working");
	}

	@Override
	public void StopWork() {
		// TODO Auto-generated method stub
		System.out.println("Robot has stop working");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Robot is eating ");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Robot is Drinking ");
	}

}
