package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("iPhone 14 Pro Max");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		List<WebElement> name = driver.findElements(By.xpath("//div[@class=\"KzDlHZ\"]"));
		List<WebElement> price = driver.findElements(By.xpath("//div[contains(text(),'₹1')]"));
		for(int i=0;i<name.size();i++)
		{
			String t1 = name.get(i).getText();
			System.out.println(t1+"==>");
			
			String t2=price.get(i).getText();
			System.out.println(" "+t2);
		}
		
driver.quit();
	}

}
