package Automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAllLinks {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		List<WebElement> allLi = driver.findElements(By.xpath("//a"));
		Thread.sleep(2000);
		int count=allLi.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text = allLi.get(i).getText();
			System.out.println(text);
		}
		
driver.quit();
	}

}
