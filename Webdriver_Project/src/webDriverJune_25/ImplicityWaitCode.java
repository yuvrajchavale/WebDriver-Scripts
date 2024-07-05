package webDriverJune_25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicityWaitCode {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		Actions ac = new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		
		//Implicit Wait Code
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[text()='Images']")).click();
		WebElement Search = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		Search.click();
		Search.sendKeys("Coding Images");
		ac.sendKeys(Keys.ENTER).perform();
		
		//Explicit Wait Code
		WebDriverWait waitSignIn =  new WebDriverWait(driver, Duration.ofSeconds(10));
		waitSignIn.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='gb_c']")));
		driver.findElement(By.xpath("//a[@aria-label='Sign in']")).click();
		
		//Explicit Wait for Create Button
		
		WebDriverWait waitCreate = new WebDriverWait(driver, Duration.ofSeconds(10));
		waitCreate.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@jsname='V67aGc'])[3]")));
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		ac.sendKeys(Keys.ARROW_DOWN.ENTER).perform();
		driver.findElement(By.xpath("//span[text()='For my personal use']")).click();
		driver.close();
		
		
		
		

	}

}
