package ratiobutton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkboxexample {
	public static void main (String[]args) {
		System.setProperty("webdriver.gecko.driver","E:\\java class\\mozila driver selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://chandanachaitanya.github.io/selenium-practice-site//");
		List<WebElement> totalcheckbox=driver.findElements(By.name("accesories"));
		for(int i=0;i<=totalcheckbox.size()-1;i++)
		{
			System.out.println(totalcheckbox.get(i).getAttribute("value"));
			totalcheckbox.get(i).click();
			
		}
	}
	
}
