package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buffered_Reader {

	public static void main(String[] args) {
        try
        {
        	FileReader fw = new FileReader("E:\\Bobby\\Java traning\\test.txt");
			BufferedReader reader = new BufferedReader(fw);
			
            String line;
            while ((line = reader.readLine()) != null)
            {
                System.out.println(line);
            }
        }catch (IOException e)
        {
            System.out.println("An error occurred: " + e.getMessage());
        }
	}

}
