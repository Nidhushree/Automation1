package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyAndPaste {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Nested iframe')]")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		String value = driver.findElement(By.xpath("//p[text()='Default Email']/../p[2]")).getText();
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys(value);
		

	}

}
