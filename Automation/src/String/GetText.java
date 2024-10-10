package String;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	public static void main(String[] args) {	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		String h = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the people in your life')]")).getAttribute("class");
		System.out.println(h);
		driver.quit();
	}
}




