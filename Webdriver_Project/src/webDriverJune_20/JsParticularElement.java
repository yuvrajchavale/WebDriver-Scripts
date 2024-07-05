package webDriverJune_20;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsParticularElement {

	public static void main(String[] args) throws Throwable {
		WebDriver jsParticular = new ChromeDriver();
		jsParticular.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)jsParticular;
		js.executeScript("window.location='https://myntra.com'");
		Thread.sleep(5000);
		WebElement faqs = jsParticular.findElement(By.linkText("FAQ"));
		js.executeScript("document.scrollIntoView",faqs);
		Thread.sleep(5000);
		faqs.click();
		String pagetitle = js.executeScript("return document.title").toString();
		System.out.println(pagetitle);
		Thread.sleep(5000);
		jsParticular.close();

	}

}
