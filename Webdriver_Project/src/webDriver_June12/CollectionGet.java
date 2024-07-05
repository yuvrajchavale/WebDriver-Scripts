package webDriver_June12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CollectionGet {

	public static void main(String[] args) throws Throwable {
		WebDriver collectItem = new ChromeDriver();
		collectItem.manage().window().maximize();
		collectItem.manage().deleteAllCookies();
		collectItem.navigate().to("file:///C:/Users/uccha/Downloads/MultiListboxHtmlpage_lyst1718166511009.html");
		Thread.sleep(3000);
		Select Mulselect = new Select(collectItem.findElement(By.name("multiSelection")));
		for (int i = 0; i<=8; i++) {
			
			Thread.sleep(3000);
			Mulselect.selectByIndex(i);
			
		}
		
		List<WebElement> Selected_Items = Mulselect.getAllSelectedOptions();
		System.out.println("No of Items in Colour List : " + Selected_Items.size());
		
		for (WebElement ColourList : Selected_Items) {
			
			System.out.println(ColourList.getText());
		}
		
		Thread.sleep(4000);
		collectItem.close();
     
	}

}
