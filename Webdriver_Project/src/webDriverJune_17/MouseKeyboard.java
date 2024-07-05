package webDriverJune_17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyboard {

	public static void main(String[] args) throws Throwable {
		WebDriver mouseKeyboard = new ChromeDriver();
		mouseKeyboard.manage().window().maximize();
		mouseKeyboard.manage().deleteAllCookies();
		mouseKeyboard.get("https://google.com");
		Thread.sleep(5000);
		
		Actions ac = new Actions(mouseKeyboard);
		Thread.sleep(5000);
		mouseKeyboard.findElement(By.name("q")).sendKeys("Yuvraj");
		Thread.sleep(5000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		ac.pause(3000);
		
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		ac.pause(3000);
		
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		ac.pause(3000);
		
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
		
		mouseKeyboard.quit();

	}

}
