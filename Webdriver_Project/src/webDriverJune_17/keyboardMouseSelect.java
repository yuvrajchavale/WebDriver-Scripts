package webDriverJune_17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class keyboardMouseSelect {

	public static void main(String[] args) throws Throwable {
		WebDriver keyBoardSelect = new ChromeDriver();
		keyBoardSelect.manage().window().maximize();
		keyBoardSelect.manage().deleteAllCookies();
		keyBoardSelect.navigate().to("https://gmail.com");
		Thread.sleep(5000);

		// take mouse to create account link
		Actions keyMouse = new Actions(keyBoardSelect);
		keyMouse.moveToElement(keyBoardSelect.findElement(By.xpath("//span[text()='Create account']")));
		Thread.sleep(5000);
		keyMouse.click().perform();
		Thread.sleep(5000);

		// for up arrow
		keyMouse.sendKeys(Keys.ARROW_UP).perform();
		keyMouse.pause(3000);

		keyMouse.sendKeys(Keys.ARROW_UP).perform();
		keyMouse.pause(3000);

		keyMouse.sendKeys(Keys.ARROW_UP).perform();
		keyMouse.pause(3000);

		// press Enter key

		keyMouse.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);


		keyBoardSelect.findElement(By.xpath("//input[contains(@id,'firstName')]")).sendKeys("Yuvraj");
		keyBoardSelect.findElement(By.id("lastName")).sendKeys("Chavale");

		keyMouse.moveToElement(keyBoardSelect.findElement(By.xpath("//span[contains(text(),'Next')]"))).click().perform(); 
		Thread.sleep(1000);
		Select listbox = new Select(keyBoardSelect.findElement(By.xpath("(//select[contains(@class,'gNnnTd')])[1]"))); 
		List<WebElement> MonthItems = listbox.getOptions(); 
		System.out.println("====== Month List Items =====");
		System.out.println(MonthItems.size());
		listbox.selectByVisibleText("August");
		
		for (WebElement monthList : MonthItems) 
		{
			System.out.println(monthList.getText());

		} 
		Thread.sleep(5000);
		Select listbox2 = new Select(keyBoardSelect.findElement(By.xpath("(//select[starts-with(@jsname,'YPqjbf')])[2]")));
		List<WebElement> GenderItem = listbox2.getOptions();
		System.out.println("====== Gender List Items =====");
		System.out.println(GenderItem.size());
		listbox2.selectByVisibleText("Male");
		
		
		for (WebElement genderList : GenderItem) {
			System.out.println(genderList.getText());
			
		}
		
		Thread.sleep(5000);
		
		keyBoardSelect.findElement(By.id("day")).sendKeys("18");
		keyBoardSelect.findElement(By.id("year")).sendKeys("1997");
		
		keyMouse.moveToElement(keyBoardSelect.findElement(By.xpath("//span[contains(text(),'Next')]"))).click().perform(); 
		Thread.sleep(1000);

		keyBoardSelect.quit();
	}

}
