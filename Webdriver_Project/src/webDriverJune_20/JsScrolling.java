package webDriverJune_20;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsScrolling {

	public static void main(String[] args) throws Throwable {
		WebDriver jsScroll = new ChromeDriver();
		jsScroll.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) jsScroll;
		js.executeScript("window.location = 'https://myntra.com'");
		Thread.sleep(5000);
		
		//Scroll top to bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		
		//Scroll bottom to top
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(5000);
		
		//Scroll to certain Element
		js.executeScript("window.scrollBy(0,2000)");

	}

}
