package File;
import org.openqa.selenium.Chrome.ChromeDriver;

public class ChromeDriver {
	public static void main(String [] args)
	{
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		String Code=driver.getTitle();
		System.out.println(Code);
		driver.Close();
		
		
		
	}

	

}
