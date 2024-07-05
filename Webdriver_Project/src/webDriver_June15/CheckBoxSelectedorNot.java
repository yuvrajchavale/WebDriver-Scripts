package webDriver_June15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxSelectedorNot {

	public static void main(String[] args) throws Throwable {
		WebDriver CheckboxSelect = new ChromeDriver();
		CheckboxSelect.manage().window().maximize();
		CheckboxSelect.manage().deleteAllCookies();
		CheckboxSelect.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		
		WebElement rediffCheckBox = CheckboxSelect.findElement(By.xpath("//input[contains(@type,'check')]"));
		boolean verifyBox = rediffCheckBox.isSelected();
		System.out.println("Check Box Selected or Not : " + verifyBox);
		// uncheck Box
		rediffCheckBox.click();
		Thread.sleep(5000);
		CheckboxSelect.close();

	}

}
