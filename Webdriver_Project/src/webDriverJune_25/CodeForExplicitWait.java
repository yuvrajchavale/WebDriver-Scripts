package webDriverJune_25;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CodeForExplicitWait {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://facebook.com");
		
		//Implicit for some elements 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait waitFb = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		//Explicit only for this Element
		waitFb.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Create new account']")));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//Entering Mandatory Fields
		//Explicit Wait for Name Field bcoz it changes position
		//waitFb.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'First name')]")));
		driver.findElement(By.name("firstname")).sendKeys("Yuvraj");
		driver.findElement(By.name("lastname")).sendKeys("Chavale");
		driver.findElement(By.name("reg_email__")).sendKeys("9834434442");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Ab@180897");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Ab@180897");
		
		//For Date Box
		Select datebox = new Select(driver.findElement(By.name("birthday_day")));
		waitFb.until(ExpectedConditions.visibilityOfElementLocated(By.name("birthday_day")));
		datebox.selectByVisibleText("18");
		List<WebElement> all_Date= datebox.getOptions();
		System.out.println("Number of Days in Datebox "  + all_Date.size());
		
		//For Month Box
		Select monthbox = new Select(driver.findElement(By.name("birthday_month")));
		waitFb.until(ExpectedConditions.visibilityOfElementLocated(By.name("birthday_month")));
		monthbox.selectByVisibleText("Aug");
		List<WebElement> all_Month= datebox.getOptions();
		System.out.println("Month's in monthbox  "  + all_Month.size());
		
		//For Month Box
		Select yearbox = new Select(driver.findElement(By.id("year")));
		yearbox.selectByVisibleText("1997");
		List<WebElement> all_year= datebox.getOptions();
		System.out.println("Year in Year box"  + all_year.size());
		
		
		//Click on gender button
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		
		//Click on signup button
		waitFb.until(ExpectedConditions.elementToBeClickable(By.name("websubmit")));
		driver.findElement(By.name("websubmit")).click();
		
		// Checking the Page coming Or not
		// This step not working becoz next page taing lots time to load 
		Thread.sleep(20000);
		//String Expect_Url = "confirmemail";
		//This takes checkpouints thats why change to checkpoint
		String Expect_Url = "checkpoint";
		String Actual_Url = driver.getCurrentUrl();
		if (Actual_Url.contains(Expect_Url)) {
		System.out.println("Confirmation Mail sending ");
		} 
		else 
		{
			System.out.println("Please fill the Data Properly");
		}
		
		
		//driver.quit();
	}

}