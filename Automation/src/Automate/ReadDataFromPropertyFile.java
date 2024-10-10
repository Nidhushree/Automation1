package Automate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.google.j2objc.annotations.Property;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String u = p.getProperty("username");
		String p1 = p.getProperty("password");
		System.out.println(url);
		System.out.println(u);
		System.out.println(p1);
		
		

	}

}
