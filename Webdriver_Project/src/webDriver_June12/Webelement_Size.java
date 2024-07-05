package webDriver_June12;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Size {

	public static void main(String[] args) throws Throwable {
		WebDriver textBoxSize = new ChromeDriver();
		textBoxSize.manage().window().maximize();
		textBoxSize.manage().deleteAllCookies();
		textBoxSize.navigate().to("https://google.com");
		Thread.sleep(5000);
		//get height and width of username
		
		WebElement search = textBoxSize.findElement(By.id("APjFqb"));
		Dimension dim = search.getSize();
		System.out.println("Height of box: " + dim.height + " || Width of Box: " + dim.width);
		textBoxSize.close();

	}

}
