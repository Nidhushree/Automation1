package Automate;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Filehandling/Dishes.html");
		WebElement option = driver.findElement(By.id("mtr"));
		Select s=new Select(option);
		HashSet<String> hs=new HashSet<>();
		List<WebElement> out = s.getOptions();
		for(WebElement du:out)
		{
			String text = du.getText();
			if(hs.add(text))
			{
				
			}
			else
			{
				System.out.println(text);
			}
		}
		driver.quit();
		

	}

}
