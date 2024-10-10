import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateTestCase {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Hidden division']")).click();
		Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Bin");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bindugowda741@gmail.com");
        WebElement productlist = driver.findElement(By.xpath("//select[@name]"));
        Select s=new Select(productlist);
        s.selectByVisibleText("Laptop");
        driver.findElement(By.xpath("//textarea[@class]")).sendKeys("Hidden division popup");
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        driver.close();
        
        

	}

}
