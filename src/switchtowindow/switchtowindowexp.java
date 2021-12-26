package switchtowindow;



import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class switchtowindowexp {
	System.setProperty("webdriver.gecko.driver","E:\\java class\\mozila driver selenium\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://chandanachaitanya.github.io/selenium-practice-site/");
	Thread.sleep(3000);
	driver.findElement(by.id("win1")).click();
	
	String mainWindowHandle = driver.getWindowHandle();
	private Object allWindowHandles;
	System.out.println(mainWindowHandle);
	set<String> (allWindowHandles);
	Iterator<String> iterator = ((Object) allWindowHandles).iterator();
	
	
	
	
	

}
