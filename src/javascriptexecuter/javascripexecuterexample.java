package javascriptexecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class javascripexecuterexample {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","E:\\java class\\mozila driver selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site//");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollby(0,500)");
		js.executeScript("window.scrollby(500,0)");
		js.executeScript("window.scrollby(0,document.body.scrollHeight)");
		Thread.sleep(1000);
			js.executeScript("deonload.getElementbyId('enterText').value='sarvesh';");
		System.out.println(js.executeScript("return window.innerHeight;"));
		System.out.println(js.executeScript("return window.innerWidth;"));
	}

}
