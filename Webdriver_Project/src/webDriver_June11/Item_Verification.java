package webDriver_June11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Item_Verification {

	public static void main(String[] args) throws Throwable {
		
		String Item_Present = "baby";
		boolean Item_Exist = false ;
		WebDriver verify = new ChromeDriver();
		verify.manage().window().maximize();
		verify.manage().deleteAllCookies();
		verify.navigate().to("https://amazon.in");
		Thread.sleep(5000);
		Select listbox = new Select(verify.findElement(By.name("url")));
		List<WebElement> All_Items = listbox.getOptions();
		System.out.println("No of items are : " + All_Items.size());
		Thread.sleep(500);
		for (WebElement each : All_Items) {
			//get each item from listbox
			String Actual_Items = each.getText();
			Thread.sleep(500);
			System.out.println(Actual_Items);
			if(Actual_Items.equalsIgnoreCase(Item_Present)) 
			{
				Item_Exist = true;
				break;
			}
			
		}
		if (Item_Exist)
		{
			System.out.println(Item_Present + " " + "Item Exist in Listbox");
		}
		else 
		{
			System.out.println(Item_Present  + " " + " Item Not Exist in Listbox");
		}
		Thread.sleep(5000);
		verify.quit();

	}

}
