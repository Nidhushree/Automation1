package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath("//div[@class=\"zoom-button \"]"));
		Actions a=new Actions(driver);
		a.clickAndHold(text).perform();

	}

}
