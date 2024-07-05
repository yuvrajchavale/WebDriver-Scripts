package webDriverJunePratice_26;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipcartAutomation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Searching iphone and click
		WebElement Search = driver.findElement(By.name("q"));
		WebDriverWait waitx= new WebDriverWait(driver, Duration.ofSeconds(10));
		waitx.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='_2SmNnR']")));
		Search.click();
		Search.sendKeys("iphone 15 pro max");
		Search.submit();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Apple iPhone 15 Pro Max')])[1]")).click();
		//Switch to other window
		String mainpage = driver.getWindowHandle();
		System.out.println("Main Page Handle: " + mainpage);
;		ArrayList<String> windowindex = new ArrayList<String>(driver.getWindowHandles());
		for (String page : windowindex) {
			if (!page.equals(mainpage)) {
				driver.switchTo().window(page);
				break;
			}
		}
		System.out.println(driver.getCurrentUrl());
		
		//Printing Mobile Features
		System.out.println("\n" + "===Mobile Features===" + "\n");
		List<WebElement> allText = driver.findElements(By.className("_7eSDEz"));
		for (WebElement text : allText) {
			System.out.println(text.getText());
			
		}
		
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		//driver.findElement(By.linkText("Add Item")).click();
		
		//old Amouunt
		System.out.println("\n" + "====First Amount====");
		List<WebElement> amount = driver.findElements(By.className("HRZecL"));
		for (WebElement bill : amount) {
			System.out.println(bill.getText());
			
		}
		
		String totalBill= driver.findElement(By.className("uJ4ZKF")).getText();
		System.out.println(totalBill);
		driver.findElement(By.xpath("//span[contains(text(),'Place Order')]")).click();
		driver.navigate().back();
		
		//Adding insurance
		driver.findElement(By.xpath("//span[contains(text(),'Add Item')]")).click();
		
		
		System.out.println("\n" + "====Updated Bill=====");
		List<WebElement> amount2 = driver.findElements(By.className("HRZecL"));
		waitx.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("HRZecL")));
		for (WebElement bill : amount2) {
			System.out.println(bill.getText());
			
		}
		
		String totalBill2= driver.findElement(By.className("uJ4ZKF")).getText();
		System.out.println(totalBill2);
		
		driver.findElement(By.xpath("//span[contains(text(),'Place Order')]")).click();
		
	

	}		

}
