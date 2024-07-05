package webDriver_June13;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_switch {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		//click on three links to open in new tabs
		driver.findElement(By.xpath("//a[contains(text(),'Ter')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Pri')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Hel')]")).click();
		//store parent and child windows into arrylist class
		ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());
		//switch to google account help
		driver.switchTo().window(brw.get(1));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Comm')]")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		driver.close();
		//switch to terms window
		driver.switchTo().window(brw.get(3));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='gb_Md']")).click();
		Thread.sleep(4000);
		driver.close();

	}

}
