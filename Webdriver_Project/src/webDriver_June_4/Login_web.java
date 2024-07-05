package webDriver_June_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_web {

	public static void main(String[] args) throws Throwable {
		WebDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.manage().deleteAllCookies();
		chrome.get("https://gmail.com");
		Thread.sleep(5000);
		chrome.findElement(By.name("identifier")).click();
	    chrome.findElement(By.id("identifierId")).sendKeys("chawale.yuvraj18@gmail.com");
	    chrome.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/c-wiz[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
	    //from here its givinng problem
	    chrome.findElement(By.cssSelector("input[name='Passwd']")).sendKeys("Ab@970818");
	    chrome.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[2]")).click();
	    
	    
	    
		Thread.sleep(5000);
		chrome.quit();

	}

}
