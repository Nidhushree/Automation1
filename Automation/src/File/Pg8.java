package File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Pg8 {
	public static void main(String [] args) 
	{
		WebDriver d=new ChromeDriver();
		d.get("C:\\Users\\Admin\\Desktop\\Filehandling\\Demo.html");
		WebElement e=d.findElement(By.partialLinkText("Google"));
		e.click();
		
		WebElement e1=d.findElement(By.tagName("a"));
		e1.click();
		
	}

}
