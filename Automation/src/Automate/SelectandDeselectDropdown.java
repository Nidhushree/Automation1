package Automate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectandDeselectDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		driver.findElement(By.linkText("Multi Select")).click();
		WebElement drop = driver.findElement(By.id("select-multiple-native"));
		Thread.sleep(1000);
		Select s=new Select(drop);
		s.selectByVisibleText("Canada");
		s.selectByVisibleText("Germany");
		s.selectByVisibleText("United Kingdom");
		Thread.sleep(1000);
		if(s.isMultiple()==true)
		{
			s.deselectByVisibleText("Canada");
			s.deselectByVisibleText("Germany");
			s.deselectByVisibleText("United Kingdom");
			System.out.println("all the option will be deselected");
		}
		
	}

}
