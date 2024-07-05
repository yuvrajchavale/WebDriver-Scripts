package webDriverJune_22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderHandling {

	public static void main(String[] args) throws Throwable {
		String dob = "18-Aug-1997";
		String x[] = dob.split("-");
		String date = x[0];
		String month = x[1];
		String year = x[2];
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get("http://flights.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Register ']")).click();
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"#name\").value='Yu Chavale'");
		js.executeScript("document.getElementById('contact').value='9484464435'");
		js.executeScript("document.querySelector(\"#email\").value='ubssceehaqq41136517awale@gmail.com'");
		js.executeScript("document.getElementById('address').value='Ac@12345678'");
		new Select(driver.findElement(By.name("gender"))).selectByVisibleText("Male");
		driver.findElement(By.id("popupDatepicker")).click();
		Thread.sleep(3000);
		new Select(driver.findElement(By.className("ui-datepicker-month"))).selectByVisibleText(month);
		new Select(driver.findElement(By.className("ui-datepicker-year"))).selectByVisibleText(year);

		WebElement webtable = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows, cols;
		rows = webtable.findElements(By.tagName("tr"));
		for (WebElement eachrows : rows) {
			cols = eachrows.findElements(By.tagName("td"));

			for (WebElement eachcell : cols) {
				if (eachcell.getText().equals(date)) {
					Thread.sleep(2000);
					eachcell.click();
				}
			}

		}

		driver.findElement(By.className("form-check-input")).click();
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
//		String Sucees= driver.switchTo().alert().getText();
//		System.out.println(Sucees);
		
		WebElement sucessmsg =driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissable']"));
		String sucessText = sucessmsg.getText();
		System.out.println(sucessText);
		driver.close();
	}

}
		
//		ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(brw.get(1)); 
//		String sucess = driver.findElement(By.xpath("///div[@class='alert alert-success alert-dismissable']")).getText();
//		System.out.println(sucess);
		


