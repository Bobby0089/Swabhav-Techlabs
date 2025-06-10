package com.company.composite.test;

import com.company.composite.model.File;
import com.company.composite.model.Folder;

public class FileTest {

	public static void main(String[] args) {
		File file1 = new File("Document.txt");
		File file2 = new File("Document.txt");
		File file3 = new File("Document.txt");
		
		Folder folder1 = new Folder("Work document");
		Folder folder2 = new Folder("personal files");
		
		Folder root =  new Folder("Root Folder");
		
		root.addCompenent(folder1);
		root.addCompenent(folder2);
	}

}
