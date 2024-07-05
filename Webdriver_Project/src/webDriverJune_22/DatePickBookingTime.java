package webDriverJune_22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickBookingTime {

	public static void main(String[] args) throws Throwable {
		
		
		String dobook = "29/August/2025";
		String x[]= dobook.split("/");
		String date = x[0];
		String month = x[1];
		String year = x[2];
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://flights.qedgetech.com");
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("uvchawale@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[contains(@class,'form-control')])[2]")).sendKeys("Ab@12345678");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='col-xs-4']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("search-date")).click();
		Thread.sleep(3000);
		
		//To select Year
		String calYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		while (!calYear.equals(year)) 
		{
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			calYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		
		//To select Month
		String calMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		while (!calMonth.equals(month)) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			calMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		
		WebElement webtable = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement>rows,cols;
		rows = driver.findElements(By.tagName("tr"));
		for (WebElement eachrow : rows) 
		{
			cols = eachrow.findElements(By.tagName("td"));
			
			for (WebElement eachcell : cols) {
				if(eachcell.getText().equals(date)) 
				{
					Thread.sleep(3000);
					eachcell.click();
				
					
				}
				
			}
			
		}

	}

}
