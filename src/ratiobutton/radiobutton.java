package ratiobutton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radiobutton {
	
	public static void main (String[]args) {
		System.setProperty("webdriver.gecko.driver","E:\\java class\\mozila driver selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://chandanachaitanya.github.io/selenium-practice-site/");
		boolean RadiobuttonSelected = driver.findElement(By.xpath("//input[@value='Novels']")).isSelected();
		System.out.println(RadiobuttonSelected);
		if(RadiobuttonSelected == false)
		{
			driver.findElement(By.xpath("//input[@value='Novels']")).click();
		 List<WebElement> RadiobuttonSelected1=driver.findElements(By.name("books"));
		System.out.println(RadiobuttonSelected1);	
		driver.close();
		}
	}
}
