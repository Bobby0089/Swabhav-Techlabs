package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileWriter file = new FileWriter("E:\\Bobby\\Java traning\\test.pdf");
			
			try
			{
				file.write("java is best programming language. ");
			}
			finally
			{
				System.out.println("Writting in file is completed.");
				file.flush();
				file.close();
			}
			System.out.println("Updated successfully");
		}catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
