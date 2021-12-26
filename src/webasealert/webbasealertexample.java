package webasealert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webbasealertexample {
  public static void main (String[]args) {
		System.setProperty("webdriver.gecko.driver","E:\\java class\\mozila driver selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://chandanachaitanya.github.io/selenium-practice-site/");
		driver.findElement(By.id("confirmBox")).click();
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		
		
  }
}
