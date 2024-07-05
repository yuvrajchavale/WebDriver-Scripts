package webDriverJune_21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDateVerification {

	public static void main(String[] args) throws Throwable {
		
		String Expected = "Canada";
		boolean Country_Exist = false;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(5000);
		WebElement webtable = driver.findElement(By.id("customers"));
		List<WebElement> rows,cols;
		rows = webtable.findElements(By.tagName("tr"));
		int row = rows.size()-1;
		System.out.println("No of rows in table: " + row );
		Thread.sleep(5000);
		for (WebElement eachrow : rows) {
			cols = eachrow.findElements(By.tagName("td"));
			for (WebElement eachcell : cols) {
				String Actual = eachcell.getText();
				System.out.println(Actual);
				
				if (Actual.equalsIgnoreCase(Expected)) {
					
					Country_Exist = true;
				}
					
				}
			
			System.out.println("=============================");
			}
			
		if (Country_Exist) {
			System.out.println(Expected + " " + "Country Exist in table");
		} else {
			System.out.println(Expected + " " + "Country Not Exist in table");
		}
		Thread.sleep(5000);
		driver.quit();
		}
		

	}


