package tops1612;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileIoEx 
{
	public static void main(String[] args) throws IOException 
	{
		FileOutputStream fout = new FileOutputStream("E://a.txt");
		fout.write(10);
		FileOutputStream fout2 = new FileOutputStream("E://a.txt");
	}
}
