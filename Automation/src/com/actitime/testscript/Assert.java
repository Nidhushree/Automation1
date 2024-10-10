package com.actitime.testscript;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Assert {

	
		@Test
		public void verifyTiltle() {
		WebDriver driver=new ChromeDriver ();
		driver.get("https://www.google.com/");
		String eTitle="Google";
		String aTitle=driver.getTitle();
		if(aTitle.equals(eTitle))
		{
			Reporter.log("title is matching and pass", true);
		}
		else
		{
			Reporter.log("title is not matching and fail", true);
		}
		driver.quit();
		}
			
		

	}


