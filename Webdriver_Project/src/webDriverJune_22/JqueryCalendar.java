package webDriverJune_22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryCalendar {

	public static void main(String[] args) throws Throwable {
		String dob = "18/August/1997";
		String x[] = dob.split("/");
		String date  = x[0];
		String month = x[1];
		String year = x[2];
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com");
		Thread.sleep(5000);
		
		//Click on datapicker link
		driver.findElement(By.xpath("//a[text()='Datepicker']")).click();
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		
		//Click on Date button 
		driver.findElement(By.className("hasDatepicker")).click();
		Thread.sleep(5000);
		
		//To Select Year in calendar 
		String calYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		while (!calYear.equals(year)) {
			driver.findElement(By.xpath("//a[@title='Prev']")).click();
			calYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		
		//To Select Month in Calendar
		
		String calMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		while (!calMonth.equals(month)) {
			driver.findElement(By.xpath("//a[@title='Prev']")).click();
			calMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
					
		}
		
		Thread.sleep(2000);
		
		//Calendar Table Date 
		
		WebElement webtable = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement>rows,cols;
		rows = driver.findElements(By.tagName("tr"));
		for (WebElement eachrow : rows) {
			cols = eachrow.findElements(By.tagName("td"));
			
			for (WebElement eachcell : cols) {
				if (eachcell.getText().equals(date)) {
					
					Thread.sleep(5000);
					eachcell.click();
					
				}
			}
			
		}
		
		Thread.sleep(10000);
		
		

	}

}
