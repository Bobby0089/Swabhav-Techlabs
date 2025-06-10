package com.company.composite.model;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemCompenent{
	
	private String name;
	private List<FileSystemCompenent> compenents = new ArrayList<>();
	
	
	public Folder(String name)
	{
		this.name = name;
	}
	
	public void addCompenent(FileSystemCompenent compenent)
	{
		compenents.add(compenent);
	}
	
	public void removeCompenent(FileSystemCompenent compenent)
	{
		compenents.remove(compenent);
	}
	
//	public void addFile(File file, String folderName)
//	{
//		for(int i = 0; i < insert.size(); i++)
//		{
//			if(folders.get(i).getName() == folderName)
//			{
//				
//			}
//		}
//	}

	@Override
	public void showDetails() {
		System.out.println("File name : "+ name);
		
	}

	public String getName() {
		return name;
	}
	

}
