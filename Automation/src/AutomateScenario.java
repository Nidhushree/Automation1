import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateScenario {

	
		public static void main(String[] args) 
		{	
			WebDriver driver=new ChromeDriver();
			driver.get("http://localhost/login.do");
			driver.findElement(By.cssSelector("input[id='admin']")).click();
			driver.findElement(By.cssSelector("input[name='manager']")).click();

	}

}
