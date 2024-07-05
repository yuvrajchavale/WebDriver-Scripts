package webDriver_June13;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws Throwable {
		WebDriver multiWindow = new ChromeDriver();
		multiWindow.manage().window().maximize();
		multiWindow.manage().deleteAllCookies();
		multiWindow.get("https://gmail.com");
		Thread.sleep(5000);
		String parent = multiWindow.getWindowHandle();
		System.out.println("Main Page " + multiWindow.getTitle());
		multiWindow.findElement(By.xpath("//a[contains(text(),'Ter')]")).click();
		multiWindow.findElement(By.xpath("//a[contains(text(),'Pri')]")).click();
		multiWindow.findElement(By.xpath("//a[contains(text(),'Hel')]")).click();
		ArrayList<String> windowKey = new ArrayList<String>(multiWindow.getWindowHandles());
		
		//index work opposite off upper format
		//Help
		
		multiWindow.switchTo().window(windowKey.get(1));
		Thread.sleep(3000);
		multiWindow.findElement(By.xpath("(//a[contains(text(),'mun')])[1]")).click();
		System.out.println(multiWindow.getTitle());
		multiWindow.close();
		
		//Privacy Tab
		multiWindow.switchTo().window(windowKey.get(2));
		Thread.sleep(2000);
		multiWindow.findElement(By.xpath("//span[contains(text(),'ign')]")).click();
		System.out.println(multiWindow.getTitle());
		multiWindow.switchTo().window(parent);
		multiWindow.close();
		
		// Switch to Terms of Service
		multiWindow.switchTo().window(windowKey.get(3));
		Thread.sleep(3000);
		multiWindow.findElement(By.xpath("(//a[contains(text(),'date')])[2]")).click();
		System.out.println(multiWindow.getTitle());
		multiWindow.findElement(By.xpath("//span[contains(text(),'ign')]")).click();
		System.out.println(multiWindow.getTitle());
		multiWindow.close();
		multiWindow.quit();
		

	}

}
