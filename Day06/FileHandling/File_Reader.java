package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class File_Reader {

	public static void main(String[] args) {
		try
		{
			FileReader file = new FileReader("E:\\Bobby\\Java traning\\test.txt");
			
			try
			{
				int i;
				while((i = file.read()) != -1)
				{
					System.out.print((char) i);
				}
			}finally
			{
				file.close();
			}
			System.out.println();
			System.out.println("Successfully readed");
		}catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
