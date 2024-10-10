package Automate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoTestCase {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Hidden division']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("nidhu123@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Nidhu");
		Thread.sleep(1000);
		WebElement listBox = driver.findElement(By.xpath("//select[@required]"));
		Select s=new Select(listBox);
		Thread.sleep(1000);
		s.selectByVisibleText("Laptop");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@required]")).sendKeys("hidden division popup");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

	}

}
