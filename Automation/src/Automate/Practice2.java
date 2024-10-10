package Automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@t5rclass=\"gLFyf\"]")).sendKeys("java");
		List<WebElement> allSug = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count=allSug.size();
		for(int i=0;i<count;i++)
		{
			String text = allSug.get(i).getText();
			System.out.println(text);
		}
		allSug.get(count-1).click();

	}

}
