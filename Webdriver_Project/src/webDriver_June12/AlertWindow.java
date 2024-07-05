package webDriver_June12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindow {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver alertMsg = new ChromeDriver();
		alertMsg.manage().window().maximize();
		alertMsg.manage().deleteAllCookies();
		alertMsg.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		alertMsg.findElement(By.name("proceed")).click();
		// capture alert msg
		String alertText = alertMsg.switchTo().alert().getText();
		System.out.println(alertText );
		Thread.sleep(5000);
		alertMsg.close();
	}

}
