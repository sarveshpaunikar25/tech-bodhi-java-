package robotclass;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class robotclassexample {
	 public static void main (String[]args) {
			System.setProperty("webdriver.gecko.driver","E:\\java class\\mozila driver selenium\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			StringSelection sel = new StringSelection
					Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
			System.out.println("selection" +sel);
			driver.get("http://www.naukri.com/account/rgister/basicdetails");
			Thread.sleep(3000);
			driver.findElement(By.name("uploadCV")).click();
			Thread.sleep(1000);
			Robot.keyPress(KeyEvent.VK_ALT);

					

}
