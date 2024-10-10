package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		Thread.sleep(3000);
		driver.get("https://www.makemytrip.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();

	}

}
