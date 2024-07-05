package webDriver_June_5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Gmail_Validation {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Throwable {
		WebDriver gmail = new ChromeDriver();
		gmail.manage().window().maximize();
		gmail.manage().deleteAllCookies();
		gmail.get("https://gmail.com");
		Thread.sleep(5000);

		WebElement login = gmail.findElement(By.xpath("//input[@id='identifierId']"));
		login.click();
		login.clear();
		login.sendKeys("chawale.yuvraj18@gmail.com");
		String Email_Id = login.getAttribute("value");
		System.out.println("Email Id : " + Email_Id + "\n");

		gmail.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(5000);
		WebElement password = gmail.findElement(By.cssSelector("input[name='Passwd']"));

		//spassword.click();
		//password.clear();
		password.sendKeys("Ab@970818");
		String Email_Password = password.getAttribute("value");
		System.out.println("Email Password : " + Email_Password + "\n" );
		gmail.findElement(By.xpath("(//span[normalize-space()='Next'])[1]")).click();
        Thread.sleep(5000);
		String Expected = "#inbox";
		String Actual = gmail.getCurrentUrl();

		if (Actual.contains(Expected)) {

			System.out.println("Sucessfully Login : " + Expected +"\n" + Actual);

		} 
		else {
            String errormsg =  gmail.findElement(By.cssSelector("div[class='Ly8vae uSvLId'] div span")).getText();
            System.out.println(errormsg);
		}
		
		gmail.quit();

	}

}
