package webDriverJune_21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HamndleSpecificRowCell {

	public static void main(String[] args) throws Throwable {
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		// get specific row from table
		String T1 = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[10]/td[1]")).getText();
		String T2 = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[10]/td[2]")).getText();
		String T3 = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[10]/td[3]")).getText();
        System.out.println(T1 + "\n"+ T2 + "\n"+ T3 +"\n");
        driver.close();
	}

}
