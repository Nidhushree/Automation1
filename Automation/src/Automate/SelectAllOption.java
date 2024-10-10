package Automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllOption {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		Thread.sleep(4000);
		WebElement op = driver.findElement(By.id("select3"));
		Select s=new Select(op);
		List<WebElement> allop = s.getOptions();
		int count=allop.size();
		for(int i=count-1;i>=0;i--)
		{
			String text = allop.get(i).getText();
		
		
		System.out.println(text);
		}
		
		
		
		
		

	}

}
