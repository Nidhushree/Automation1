import java.io.Serializable;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> all = driver.findElements(By.xpath("//a"));
		int count=all.size();
		for(int i=0;i<count;i++)
		{java.lang.String m = all.get(i).getText();
			System.out.println(m);
h		

	}

}
