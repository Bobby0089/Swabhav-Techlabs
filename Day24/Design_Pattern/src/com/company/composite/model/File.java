package com.company.composite.model;

public class File implements FileSystemCompenent{
	
	private String name;
	
	public File(String name)
	{
		this.name = name;
	}

	@Override
	public void showDetails() {
		System.out.println("File : " + name);
	}
	
}
