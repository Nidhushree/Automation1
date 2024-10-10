package Automate;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeDropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Filehandling/Dishes.html");
		WebElement mtrlist = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlist);
		HashSet<String> hs=new HashSet<>();
		List<WebElement> option = s.getOptions();
		
		for(WebElement ele:option)
		{
			String text = ele.getText();
			if(!hs.add(text)) 
			
				
			
			
			{
				System.out.println(text);
			}
		}
		
		int count=option.size();
		for(int i=0;i<count;i++)
		{
			s.selectByIndex(i);
		}
		for(int i=0;i<count;i++)
		{
			s.deselectByIndex(i);
		}
		
		driver.quit();
		
		

	}

}
