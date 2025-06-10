package com.company.creation.abstractfactory.model;

public class IntelFactory implements IAbstractFactorty {
	
	@Override
	public ICPU createCpu() {
		
		return new IntelCPU();
	}

	@Override
	public IGPU createGpu() {
		
		return new NvidiaGpu();
	}

}
