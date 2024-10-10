package com.actitime.testscript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataProperty {
	public String getProp( String key) throws IOException 
	{
		FileInputStream fis=new FileInputStream("./Data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
		
		
		
	}
	

}
