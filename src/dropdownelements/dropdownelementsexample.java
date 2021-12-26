package dropdownelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownelementsexample {
public static void main (String[]args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","E:\\java class\\mozila driver selenium\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://chandanachaitanya.github.io/selenium-practice-site/");
	Select oselect = new Select(driver.findElement(By.id("selenium_suite")));
	oselect.selectByIndex(3);
	Thread.sleep(5000);
	 
	oselect.selectByIndex(1);
	oselect.selectByIndex(2);
	
}
}
