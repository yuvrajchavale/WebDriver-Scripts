package webDriver_June15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectionRadioButton {

	public static void main(String[] args) throws Throwable {
		WebDriver radioButton = new ChromeDriver();
		radioButton.manage().window().maximize();
		radioButton.manage().deleteAllCookies();
		radioButton.navigate().to("https://www.myntra.com/shop");
		Thread.sleep(5000);
		List<WebElement> allRadioButton = radioButton.findElements(By.xpath("//label[starts-with(@class,'common-customRadio gender-label')]"));
		System.out.println(allRadioButton.size());
		for (WebElement each : allRadioButton) {
			System.out.println(each.getText());
			
		}
		radioButton.quit();
		
	


	}

}
