package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String [] args)
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	String s=driver.getTitle();
	System.out.println(s);
	driver.close();
	}
}