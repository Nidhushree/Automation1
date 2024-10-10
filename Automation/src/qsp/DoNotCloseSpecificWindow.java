package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoNotCloseSpecificWindow {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the title not to be closed");
		String s=sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		Thread.sleep(2000);
		Set<String> allwh = driver.getWindowHandles();
		for(String win:allwh)
		{
			driver.switchTo().window(win);
			String title = driver.getTitle();
			System.out.println(title);
			if(s.equals(title))
			{
				
			}
			else
			{
				driver.close();
			}
			
		}
	}

}
