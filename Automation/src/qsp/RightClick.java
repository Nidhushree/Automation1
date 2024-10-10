package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui");
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.linkText("Right Click")).click();
		WebElement a1 = driver.findElement(By.id("btn30"));
		Actions a=new Actions(driver);
		a.contextClick(a1).perform();
		driver.findElement(By.xpath("//div[text()='Yes']")).click();
		boolean text = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']")).isDisplayed();
		if(text==true)
		{
			System.out.println("text is displayed and pass");
		}
		else
		{
			System.out.println("text is not displayed and fail");
		}

	}

}
