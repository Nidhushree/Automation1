package String;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonAligned {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		int y1 = driver.findElement(By.xpath("//span[@data-type='radio']/../span/span[1]")).getLocation().getY();
		int y2 = driver.findElement(By.xpath("//span[@data-type='radio']/../span/span[2]")).getLocation().getY();
		int y3 = driver.findElement(By.xpath("//span[@data-type='radio']/../span/span[3]")).getLocation().getY();
		if(y1==y2&&y2==y3)
		{
			System.out.println("Gender radio buttons are properly aligned and pass");
		}
		else
		{
			System.out.println("Gender radio buttons are not properly aligned and fail");
		}
		driver.quit();

	}

}
