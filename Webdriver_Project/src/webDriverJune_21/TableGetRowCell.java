package webDriverJune_21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableGetRowCell {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		//store table into webelement object
		WebElement webtable = driver.findElement(By.className("dataTable"));
		//get collection of rows from webtable
		List<WebElement> rows = webtable.findElements(By.tagName("tr"));
		int row = rows.size()-1;
		System.out.println("No of rows are: " + row);
		//iterate all rows
		for (int i = 1; i < rows.size(); i++) 
		{
			//get cell Collection from each row 
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			System.out.println("Row No." + i +" " + cols.size());
		}
		driver.quit();

	}

}
