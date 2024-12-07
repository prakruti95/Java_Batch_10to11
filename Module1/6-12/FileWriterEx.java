package tops612;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx 
{
	public static void main(String[] args)
	{
		
		try 
		{
			FileWriter fw = new FileWriter("E://tech.txt");
			fw.write("Hello");
			fw.close();
			System.out.println("write done..");
			
			Thread.sleep(1000);//timer
			
			FileReader fr = new FileReader("E://tech.txt");
			
			int i=0;
			
			while((i=fr.read())!=-1) 
			{
				System.out.print((char)i);
			}
			
			fr.close();
			
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
