package inputboxandbutton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class inputboxandbuttonexample {
public static void main (String[]args) {
	System.setProperty("webdriver.gecko.driver","E:\\java class\\mozila driver selenium\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com/");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sarveshpaunikar82@gmail.com");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sarvesh25");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
	

}
}
