package Automate;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseParent {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		String pwh=driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		for(String a:allwh)
		{
			driver.switchTo().window(a);
			if(pwh.equals(allwh))
			{
				
			}
			else {
				driver.close();
			}
			
		}
		

	}

}
