package File;

import java.io.FileInputStream;
import java.io.IOException;

public class File {
	public static void main(String[] args) throws IOException
	{
		String path="C:\\Users\\Admin\\Desktop\\Filehandling\\A.txt";
		FileInputStream f=new FileInputStream(path);
		int b=f.read();
		while(b!=-1) 
		{
			System.out.println((char)b);
			b=f.read();
		}
		
	}

}
