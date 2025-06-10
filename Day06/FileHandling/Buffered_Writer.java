package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered_Writer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileWriter fw = new FileWriter("E:\\Bobby\\Java traning\\test.txt");
			BufferedWriter writer = new BufferedWriter(fw);
			writer.write("hello my mane is bobby");
			writer.flush();
			writer.close();
		}catch (IOException e1)
		{
			e1.printStackTrace();
		}
		finally
		{
			System.out.println("Updated successfully");
		}
		

	}

}
