package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui");
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		driver.findElement(By.partialLinkText("Drag Position")).click();
		WebElement targ = driver.findElement(By.xpath("//div[@class=\"drop-column  min-h-[200px] bg-slate-100\"]"));
		WebElement mbsrc1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement targ2=driver.findElement(By.xpath("//div[@class='drop-column min-h-[200px] bg-slate-100']"));
		driver.findElement(By.xpath("//div[@class=\"drop-column min-h-[200px] bg-slate-100\"]"));
		WebElement mbsrc2=driver.findElement(By.xpath("//div[text()=\"Mobile Cover\"]"));
		WebElement lpch = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement lpcov = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		Thread.sleep(1000);
	    Actions a=new Actions(driver);
	    a.dragAndDrop(mbsrc1, targ).perform();
	    a.dragAndDrop(mbsrc2, targ).perform();
	    Thread.sleep(1000);
	    a.dragAndDrop(lpcov, targ2).perform();
	    a.dragAndDrop(lpch, targ2).perform();
	    

	}

}
;