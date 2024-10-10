package Automate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPropertyFile {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		FileInputStream fis=new FileInputStream("./Data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		 String u = p.getProperty("url");
		 String un = p.getProperty("username");
		 String pw = p.getProperty("password");
		 System.out.println(u);
		 System.out.println(un);
		 System.out.println(pw);
		 
		 //driver.get(u);
		 //driver.findElement(By.id("username")).sendKeys(un);
		 //driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys(pw);
		 //driver.findElement(By.xpath("//div[text()='Login ']")).click();
		 
		
		 
		
		

	}

}
