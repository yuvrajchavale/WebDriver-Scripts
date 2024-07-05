package webDriverJune_18;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickRobot {

	public static void main(String[] args) throws Throwable {
		WebDriver robotMouse = new ChromeDriver();
		robotMouse.manage().window().maximize();
		robotMouse.manage().deleteAllCookies();
		robotMouse.get("https://google.com");
		Thread.sleep(5000);
		Actions ac = new Actions(robotMouse);

		//take mouse to gmail link & right click
		ac.moveToElement(robotMouse.findElement(By.linkText("Gmail")));
		ac.pause(5000);
		ac.contextClick().perform();
		Thread.sleep(5000);

		//create object for robot class
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);

		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);

		//store all windows into arraylist class

		ArrayList<String> brw = new ArrayList<String>(robotMouse.getWindowHandles());
		robotMouse.switchTo().window(brw.get(1));
		Thread.sleep(5000);

		ac.moveToElement(robotMouse.findElement(By.xpath("(//a[contains(text(),'For work')])[1]"))).click().perform();
		System.out.println(robotMouse.getTitle());
		Thread.sleep(5000);
		robotMouse.close();

		robotMouse.switchTo().window(brw.get(0));
		ac.moveToElement(robotMouse.findElement(By.xpath("//a[contains(text(),'Images')]"))).click().perform();
		System.out.println(robotMouse.getTitle());
		Thread.sleep(5000);
		//robotMouse.quit();
        
		/*
		 * robotMouse.findElement(By.xpath("//textarea[contains(@class,'gLFyf')]")).
		 * sendKeys("tatacliq"); ac.sendKeys(Keys.ENTER).perform(); Thread.sleep(3000);
		 * ac.moveToElement(robotMouse.findElement(By.xpath(
		 * "//div[contains(text(),'All')]"))).click().perform(); Thread.sleep(3000);
		 * ac.moveToElement(robotMouse.findElement(By.
		 * xpath("(//span[contains(text(),'Tata CLiQ')])[2]"))).click().perform();
		 * Thread.sleep(3000);
		 */		
		robotMouse.navigate().to("https://tatacliq.com");
		Thread.sleep(5000);
		
		//CLick on ask me later
		ac.moveToElement(robotMouse.findElement(By.xpath("//button[contains(text(),'Ask me later')]"))).click().perform();
		System.out.println(robotMouse.getTitle());
		Thread.sleep(3000);
		
		//Click on categories
		ac.moveToElement(robotMouse.findElement(By.xpath("//div[contains(text(),'Categories')]"))).perform();
		Thread.sleep(3000);
		
		//Click on kids section
		ac.moveToElement(robotMouse.findElement(By.xpath("(//div[@class='DesktopHeader__categoryDetailsValue'])[2]"))).perform();
		System.out.println(robotMouse.getTitle());
		Thread.sleep(3000);
		
		//Click on Infant shirts
		ac.moveToElement(robotMouse.findElement(By.xpath("(//a[contains(text(),'Shirts')])[2]"))).click().perform();
		System.out.println(robotMouse.getTitle());
		Thread.sleep(3000);
		
		//Again Category > kids Sections > Boys Shirts
		ac.moveToElement(robotMouse.findElement(By.xpath("//div[contains(text(),'Categories')]"))).perform();
		Thread.sleep(3000);
		ac.moveToElement(robotMouse.findElement(By.xpath("(//div[@class='DesktopHeader__categoryDetailsValue'])[2]"))).perform();
		System.out.println(robotMouse.getTitle());
		Thread.sleep(3000);
		ac.moveToElement(robotMouse.findElement(By.xpath("(//a[contains(text(),'Shirts')])[1]"))).click().perform();
		System.out.println(robotMouse.getTitle());
		Thread.sleep(3000);
		
		//Catogories >Beauty
		ac.moveToElement(robotMouse.findElement(By.xpath("//div[contains(text(),'Categories')]"))).perform();
		Thread.sleep(3000);
		ac.moveToElement(robotMouse.findElement(By.xpath("//div[contains(text(),'Beauty')]"))).perform();
		//ac.moveToElement(robotMouse.findElement(By.linkText("Beauty"))).perform();
		System.out.println(robotMouse.getTitle());
		Thread.sleep(3000);
		ac.moveToElement(robotMouse.findElement(By.xpath("//a[contains(text(),'Shampoos & Conditioners')]"))).click().perform();
		System.out.println(robotMouse.getTitle());
		Thread.sleep(3000);
		
		
		
		//kids fashin:xpath:(//div[@class='DesktopHeader__categoryDetailsValue'])[2]
		
	




	}

}
