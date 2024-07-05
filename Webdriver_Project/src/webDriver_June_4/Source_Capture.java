package webDriver_June_4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Source_Capture {

	public static void main(String[] args) throws Throwable {
		WebDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.manage().deleteAllCookies();
		chrome.get("https://chatgpt.com");
		Thread.sleep(5000);
		String srcCode = chrome.getPageSource();
		System.out.println(srcCode);
		chrome.close();
		
	}

}
