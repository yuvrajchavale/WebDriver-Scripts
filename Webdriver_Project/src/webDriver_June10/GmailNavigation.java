package webDriver_June10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailNavigation {

	public static void main(String[] args) throws Throwable {
		WebDriver navigate =  new ChromeDriver();
		navigate.manage().window().maximize();
		navigate.manage().deleteAllCookies();
		navigate.navigate().to("http://google.com");
		System.out.println("Page one Name: " + navigate.getTitle());
		Thread.sleep(5000);
		
		//click on Mail button
		navigate.findElement(By.linkText("Gmail")).click();
		System.out.println("Page two Name: " + navigate.getTitle());
		Thread.sleep(5000);
		
		//click on back button
		navigate.navigate().back();
		System.out.println("Page three Name: " + navigate.getTitle());
		Thread.sleep(5000);
		
		//click on forward button
		navigate .navigate().forward();
		System.out.println("Page four Name: " + navigate.getTitle());
		Thread.sleep(5000);
		
		

	}

}
