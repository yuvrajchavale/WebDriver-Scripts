package webDriver_June10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperlinkCollection {

	public static void main(String[] args) throws Throwable {
	   WebDriver primus = new ChromeDriver();
	   primus.manage().window().maximize();
	   primus.manage().deleteAllCookies();
	   primus.navigate().to("http://quillbot.com");
	   Thread.sleep(5000);
	   List<WebElement> all_links = primus.findElements(By.tagName("a"));
	   System.out.println("No. of Hyperlinks Available : " + all_links.size());
	   Thread.sleep(5000);
	   for (WebElement webElement : all_links) {
		   System.out.println(webElement.getText());
		
	}
	   
	   
	   

	}

}
