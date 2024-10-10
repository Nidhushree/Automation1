package String;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogo {

	public static void main(String[] args) {	
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://localhost/login.do");
		boolean login = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		if(login==true)
			
		{
			System.out.println("Checkbox is checked and pass");
		}
		else
		{
			System.out.println("Checkbox is not checked and fail");
		}
	
		driver.close();

	}
}


