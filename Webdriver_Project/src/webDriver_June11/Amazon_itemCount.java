package webDriver_June11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_itemCount {

	public static void main(String[] args) throws Throwable {
		WebDriver amazon = new ChromeDriver();
		amazon.manage().window().maximize();
		amazon.manage().deleteAllCookies();
		amazon.navigate().to("https://amazon.in");
		
		//store listbox into select class
		Select listbox = new Select(amazon.findElement(By.cssSelector("#searchDropdownBox")));
		
		//get coollection of items in listbox
		
		List<WebElement> All_Items = listbox.getOptions();
		System.out.println("No of items are:" + All_Items.size());
		Thread.sleep(5000);
		
		for (WebElement itemsDrop : All_Items) {
			Thread.sleep(600);
			System.out.println(itemsDrop.getText());
			
		}
		Thread .sleep(5000);
		amazon.close();
				

	}

}
