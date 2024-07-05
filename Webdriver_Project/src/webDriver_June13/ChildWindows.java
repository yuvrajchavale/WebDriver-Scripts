package webDriver_June13;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindows {

	public static void main(String[] args) throws Throwable {
		WebDriver childWindows = new ChromeDriver();
		childWindows.manage().window().maximize();
		childWindows.manage().deleteAllCookies();
		childWindows.navigate().to("https://gmail.com");
		Thread.sleep(5000);
		String parent = childWindows.getWindowHandle();
		System.out.println(parent);
		//new tabs
		childWindows.findElement(By.linkText("Help")).click();
		childWindows.findElement(By.linkText("Privacy")).click();
		childWindows.findElement(By.linkText("Terms")).click();
		//get all windows
		Set<String> allWindowId = childWindows.getWindowHandles();
		for (String WindowIdPos : allWindowId) {
			// parent id should not equal to child ids
			
			if (!parent.equals(WindowIdPos)) {
				//switch to each child windo & get title,and close
				String  pageTitle = childWindows.switchTo().window(WindowIdPos).getTitle();
				System.out.println(pageTitle);
				Thread.sleep(3000);
				childWindows.close();
				
				
			}
			
		}
		//Switch to parent
		childWindows.switchTo().window(parent);
		Thread.sleep(5000);
		childWindows.findElement(By.cssSelector("#identifierId")).sendKeys("chawale.yuvraj18@gmail.com");
		childWindows.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(5000);
		childWindows.close();
		

	}

}
