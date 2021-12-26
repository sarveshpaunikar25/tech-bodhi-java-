package capturescreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screenshootexample {
	public static void main(String[]args) {
		System.setProperty("webdriver.gecko.driver","E:\\java class\\mozila driver selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.co.in/");
		TakesScreenshot scrshot = ((TakesScreenshot)driver);
		File cpFile =scrshot.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yy HH:mm:ss");
		Date date = new Date();
		String  abc =formatter.format(date).toString().replace("/"," ");
		String exactpathfilename=abc.replace("", "").replace(":", "");
		System.out.println(exactpathfilename);
		String CapturePath = "E:\\cfrbackup-MMHCQLTW\\"+exactpathfilename+".png";
		try {
			FileUtils.copyFile(cpFile, new File(CapturePath));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		driver.close();
		}
		
	}


