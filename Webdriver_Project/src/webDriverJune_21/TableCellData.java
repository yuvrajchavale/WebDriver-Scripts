package webDriverJune_21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableCellData {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		WebElement webtable  = driver.findElement(By.className("dataTable"));
		List<WebElement> rows,cols;
		//get row collection  from table 
		rows = webtable.findElements(By.tagName("tr"));
		int row = rows.size()-1;
		System.out.println("No of rows are: " + row);
		Thread.sleep(5000);
		//iterate all rows
		for (WebElement eachrow : rows) {
			//get cellj collection from each row
			cols = eachrow.findElements(By.tagName("td"));
			//iterate each cell
			for (WebElement eachcell : cols) {
				String celldata = eachcell.getText();
				Thread.sleep(500);
				System.out.println(celldata);
			}
			System.out.println("=================================");
		}
		Thread.sleep(5000);
		driver.quit();
		

	}

}
