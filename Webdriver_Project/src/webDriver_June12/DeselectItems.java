package webDriver_June12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectItems {

	public static void main(String[] args) throws Throwable {
		WebDriver deSelect = new ChromeDriver();
		deSelect.manage().window().maximize();
		deSelect.manage().deleteAllCookies();
		deSelect.navigate().to("file:///C:/Users/uccha/Downloads/MultiListboxHtmlpage_lyst1718166511009.html");
		Thread.sleep(3000);
		Select MultiSel = new Select(deSelect.findElement(By.name("multiSelection")));
		boolean box = MultiSel.isMultiple();
		System.out.println(box);
		
		//Selecting 0 - 8 items from list
		
		for (int i = 0; i <=8; i++) {
			
			Thread.sleep(5000);
			MultiSel.selectByIndex(i);
		}
		
		//deselecting items from listbox
		
		MultiSel.deselectByVisibleText("Blue");
		Thread.sleep(5000);
		MultiSel.deselectByIndex(2);
		Thread.sleep(5000);
		MultiSel.deselectAll();
		Thread.sleep(5000);
		deSelect.quit();

	}

}
