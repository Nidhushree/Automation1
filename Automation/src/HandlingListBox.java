import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox {

	public static void main(String[] args) throws InterruptedException 
		{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		WebElement dateListBox=driver.findElement(By.id("day"));
		Select s=new Select(dateListBox);
		s.selectByValue("26");
		Thread.sleep(2000);
		WebElement monthListBox=driver.findElement(By.id("month"));
		Select s1=new Select(monthListBox);
		s1.selectByValue("6");
		Thread.sleep(2000);
		WebElement yearListBox=driver.findElement(By.id("year"));
		Select s2=new Select(yearListBox);
		s2.selectByValue("1998");
		}
			
}


