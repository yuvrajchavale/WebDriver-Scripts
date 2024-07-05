package webDriverJune_19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropByM {

	public static void main(String[] args) throws Throwable {
		WebDriver drgDropByM = new ChromeDriver();
		drgDropByM.manage().window().maximize();
		drgDropByM.manage().deleteAllCookies();
		drgDropByM.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		
		Actions ac = new Actions(drgDropByM);
		drgDropByM.switchTo().frame(0);
		
		WebElement source = drgDropByM.findElement(By.id("draggable"));
		WebElement target = drgDropByM.findElement(By.id("droppable"));
		
		int x = target.getLocation().getX();
		int y = target.getLocation().getY();
		
		System.out.println(x + " " + y);
		ac.dragAndDropBy(source, x, y).perform();
		drgDropByM.quit();		
		

	}

}
