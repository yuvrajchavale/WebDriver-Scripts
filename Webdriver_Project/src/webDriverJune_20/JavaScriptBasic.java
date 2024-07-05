package webDriverJune_20;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptBasic {

	public static void main(String[] args) throws Throwable {
		WebDriver jsDriver = new ChromeDriver();
		jsDriver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)jsDriver;
		
		//Url launch
		js.executeScript("window.location='https://amazon.in'");
		Thread.sleep(5000);
		
		//Print page title & length of title
		String pagetitle  = js.executeScript("return document.title").toString();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		
		//Print page Url and length of url
		
		String strUrl = js.executeScript("return document.URL").toString();
		System.out.println(strUrl);
		System.out.println(strUrl.length());
		
	}

}
