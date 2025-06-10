package com.company.creation.abstractfactory.model;

public class AMDFactory implements IAbstractFactorty {
	
	@Override
	public ICPU createCpu() {
		
		return new AMDCpu();
	}

	@Override
	public IGPU createGpu() {
		
		return new AMDGpu();
	}

}
