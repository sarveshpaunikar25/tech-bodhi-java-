package browsercommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browsercommand {
	public static void main(String[]args) {
		System.setProperty("webdriver.gecko.driver","E:\\java class\\mozila driver selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		String FBrowser = driver.getTitle();
		System.out.println(FBrowser);
		String actualURL= "Http://www.facebook.com/";
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		if(actualURL.equals(currenturl))
		{
			System.out.println("test is pass");
			
		}
		else 
		{
			System.out.println("test is fail");
		}
		driver.close();
		
			
		}
		
		
		
		

	}


