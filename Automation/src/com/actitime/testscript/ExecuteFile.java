package com.actitime.testscript;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteFile {
@Test
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		ReadDataProperty f=new ReadDataProperty();
	    String un = f.getProp("url");
	    driver.get(un);
		String us = f.getProp("username");
		String pw = f.getProp("password");
		driver.findElement(By.id("username")).sendKeys(us);
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys(pw);
		driver.findElement(By.id("loginButtonContainer")).click();
		

	}

}
