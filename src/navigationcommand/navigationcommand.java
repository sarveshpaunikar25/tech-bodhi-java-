package navigationcommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class navigationcommand {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","E:\\java class\\mozila driver selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		driver.findElement(By.partialLinkText("Forgotten password?")).click();
		Thread.sleep(3000);
		
	}

}
