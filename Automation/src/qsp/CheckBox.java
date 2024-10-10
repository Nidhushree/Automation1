package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(500);
		driver.findElement(By.xpath("//section[text()='Check Box']")).click();
		List<WebElement> chechk = driver.findElements(By.xpath("//input[contains(@type,'checkbox')]"));
		int count=chechk.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			chechk.get(i).click();
		}

}
		
	}

		

	


