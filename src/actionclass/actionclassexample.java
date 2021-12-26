package actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actionclassexample {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","E:\\java class\\mozila driver selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.browswestack.com/");
		Thread.sleep(3000);
		
		Actions as = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//button[@aria-label='products']"));
		as.moveToElement(element).build().perform();
		
		
	}

}
