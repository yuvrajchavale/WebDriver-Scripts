package webDriver_June12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimusDeleteAlert {

	public static void main(String[] args) throws Throwable 
	{
	WebDriver Bank = new ChromeDriver();
	Bank.manage().window().maximize();
	Bank.manage().deleteAllCookies();
	Bank.navigate().to("http://primusbank.qedgetech.com/");
	Thread.sleep(5000);
	Bank.findElement(By.id("txtuId")).sendKeys("Admin");
	Bank.findElement(By.id("txtPword")).sendKeys("Admi");
	Thread.sleep(3000);
	Bank.findElement(By.cssSelector("#login")).click();
	Thread.sleep(3000);
	Bank.switchTo().alert().accept();
	Bank.findElement(By.id("txtPword")).sendKeys("Admin");
	
	
	Bank.findElement(By.cssSelector("#login")).click();
	Thread.sleep(5000);
	Bank.findElement(By.xpath("(//img)[5]")).click();
	Bank.findElement(By.xpath("(//img)[11]")).click();
	
	String alertmsg = Bank.switchTo().alert().getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	Bank.switchTo().alert().accept();
	Thread.sleep(2000);
	String alertText = Bank.switchTo().alert().getText();
	System.out.println(alertmsg);
	Bank.switchTo().alert().accept();
	Bank.findElement(By.xpath("(//img)[2]")).click();
	Bank.close();
	
	}

}
