package Automate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAuto {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//a[contains(text(),'OK')])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		driver.switchTo().alert().dismiss();
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]")).click();
		
		

	}

}
