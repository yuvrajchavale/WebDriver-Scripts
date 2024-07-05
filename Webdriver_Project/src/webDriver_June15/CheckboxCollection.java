package webDriver_June15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxCollection {

	public static void main(String[] args) throws Throwable {
		WebDriver checkBoxcount = new ChromeDriver();
		checkBoxcount.manage().window().maximize();
		checkBoxcount.manage().deleteAllCookies();
		checkBoxcount.get("https://www.myntra.com/shop");
		Thread.sleep(5000);
		
		System.out.println("========== Catogary List =============");
		
		checkBoxcount.findElement(By.xpath("//div[@class= 'categories-more']")).click();
		Thread.sleep(5000);
		List<WebElement> CatogiriesItems = checkBoxcount.findElements(By.xpath("//label[@class= ' common-customCheckbox']"));
		System.out.println(" Total Number of Catagiries: " + CatogiriesItems.size());
		for (WebElement Catogary : CatogiriesItems) {
			System.out.println(Catogary.getText());
		}
		//checkBoxcount.findElement(By.xpath("//span[@class ='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();
		
		Thread.sleep(3000);
		
		
		System.out.println("============== Brand List =============");
		
		checkBoxcount.findElement(By.xpath("//div[@class = 'brand-more']")).click();
		Thread.sleep(3000);
		List<WebElement> BrandList= checkBoxcount.findElements(By.xpath("//label[@class = ' common-customCheckbox']"));
		System.out.println("Brands Available on Myntra: " + BrandList.size());
		for (WebElement Brands : BrandList) {
			System.out.println(Brands.getText());
			
		}
		checkBoxcount.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();
		Thread.sleep(5000);
		checkBoxcount.close();

	}

}
