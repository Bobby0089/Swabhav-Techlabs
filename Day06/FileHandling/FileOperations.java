package FileHandling;

import java.io.File;

public class FileOperations {

	public static void main(String[] args) {
		File file  = new File("E:\\Bobby\\Java traning\\test.txt");
		
		if (file.exists())
		{
			System.out.println("File nme : "+ file.getName());
			System.out.println("File can be read : "+file.canRead());
			System.out.println("File can be written : "+file.canWrite());
			System.out.println("File exists : "+file.exists());
			System.out.println("File path : "+file.getPath());
			System.out.println("file path: : "+ file.getAbsolutePath());
			System.out.println("File hashCode : "+file.hashCode());
			
		}
		else
		{
			System.out.println("File does not exists.");
		}
		
	}

}
