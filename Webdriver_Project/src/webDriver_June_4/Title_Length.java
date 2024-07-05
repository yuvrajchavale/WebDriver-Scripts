package webDriver_June_4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_Length {

	public static void main(String[] args) throws Throwable {
	    
		WebDriver chrome = new ChromeDriver();
	    chrome.manage().window().maximize();
	    chrome.manage().deleteAllCookies();
	    Thread.sleep(5000);
	    
	    chrome.get("https://amazon.com");
	    
	    String pageTitle = chrome.getTitle();
	    System.out.println(pageTitle);
	    System.out.println(pageTitle.length());
	    
	    String strUrl = chrome.getCurrentUrl();
	    System.out.println(strUrl);
	    System.out.println(strUrl.length());
	    
	    chrome.quit();
	    
	    

	}

}
