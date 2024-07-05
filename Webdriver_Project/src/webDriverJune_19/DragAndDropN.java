package webDriverJune_19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropN {

	public static void main(String[] args) throws Throwable {
		WebDriver drgDrp = new ChromeDriver();
		drgDrp.manage().window().maximize();
		drgDrp.manage().deleteAllCookies();
		drgDrp.navigate().to("https://jqueryui.com/");
		Thread.sleep(5000);
		Actions ac = new Actions(drgDrp);
		ac.moveToElement(drgDrp.findElement(By.xpath("//a[contains(text(),'Droppable')]"))).click().perform();
		
		//getcollections in iframe
		List<WebElement> all_iframes = drgDrp.findElements(By.tagName("iframe"));
		System.out.println(all_iframes.size());
		
		//Switch to frame
		drgDrp.switchTo().frame(0);
		
		// Store source & target to navigate in Drag&Drop method
		WebElement source = drgDrp.findElement(By.id("draggable"));
		WebElement target = drgDrp.findElement(By.id("droppable"));
		ac.dragAndDrop(source, target).perform();
		Thread.sleep(5000);
		
		//Back to main page and then click other button
		drgDrp.switchTo().defaultContent();
		ac.moveToElement(drgDrp.findElement(By.xpath("//a[contains(text(),'Checkboxradio')]"))).click().perform();
		System.out.println(drgDrp.getTitle());
		Thread.sleep(5000);
		drgDrp.navigate().back();
		Thread.sleep(3000);
				 
		ac.moveToElement(drgDrp.findElement(By.xpath("//a[contains(text(),'Selectmenu')]"))).click().perform();
		Thread.sleep(5000);
		drgDrp.switchTo().frame(0);
		System.out.println(drgDrp.getTitle());
		drgDrp.quit();

	}

}
