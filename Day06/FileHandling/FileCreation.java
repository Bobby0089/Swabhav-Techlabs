package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) {
		String path ="E:\\Bobby\\Java traning\\test.txt";
		File file = new File(path);
		
		
		try
		{
			if(file.createNewFile())
			{
				System.out.println("File created successfully");
			}
			else
			{
				System.out.println("File already exists ");
			}
		}catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
