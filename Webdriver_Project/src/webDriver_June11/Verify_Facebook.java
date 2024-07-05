package webDriver_June11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Facebook {

	public static void main(String[] args) throws Throwable {
		String Month_Present = "5";
		boolean Month_Exist = false;
		WebDriver quillBot = new EdgeDriver();
		quillBot.manage().window().maximize();
		quillBot.manage().deleteAllCookies();
		quillBot.navigate().to("https://www.facebook.com");
		Thread.sleep(5000);
		quillBot.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		Select quillbox = new Select(quillBot.findElement(By.id("day")));
		Thread.sleep(2000);
		// this method is use to know size of list
		List<WebElement> All_Items = quillbox.getOptions();
		System.out.println("Number of Days:" + All_Items.size());
		Thread.sleep(500);
		for (WebElement Each : All_Items) {
			String Actual_Items = Each.getText();
			Thread.sleep(500);
			System.out.println(Actual_Items);
			if (Actual_Items.equalsIgnoreCase(Month_Present)) {
				 Month_Exist = true;
				 break;
				
			}
			
		}
		
		if (Month_Exist) 
		{
			System.out.println( Month_Present + " : Day Exist in List Box ");
		} 
		else 
		{
			System.out.println( Month_Present + " : Day Not Exist in List Box ");

		}
		

	}

}
