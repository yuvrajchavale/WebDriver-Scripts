package webDriverJune_24;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreeShotTaker {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(5000);
		
		//Creating time Stamp 
		DateFormat df = new SimpleDateFormat("YYYY_MM_dd hh_mm_ss");
		Date date = new Date();
		String datef =df.format(date);
		
		//take screen shot & store
		File Screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Storing Screenshot in local system
		FileUtils.copyFile(Screen, new File("D:/MyScreenShots/"+ datef + " " + "homepage.png"));
		driver.quit();

	}

}
