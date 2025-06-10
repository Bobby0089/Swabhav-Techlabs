package com.company.creation.abstractfactory.model;

public class NvidiaGpu implements IGPU{

	@Override
	public void assembled() {
		// TODO Auto-generated method stub
		System.out.println("Assembled using Nvidia GPU");
	}

}
