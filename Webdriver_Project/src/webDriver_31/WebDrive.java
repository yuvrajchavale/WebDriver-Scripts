package webDriver_31;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class WebDrive {

	@Test
	public static void quill() throws Throwable {
		WebDriver msedge = new EdgeDriver();
		WebDriver chrome = new ChromeDriver();
		msedge.manage().window().maximize();
		chrome.manage().window().maximize();
		msedge.manage().deleteAllCookies();
		chrome.manage().deleteAllCookies();
		msedge.get("https://gmail.com");
		chrome.get("https://quillbot.com");
		//suspend tool from execution for 5 seconds
		Thread.sleep(1000);
		chrome.quit();
		
	}

}
