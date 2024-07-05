package webDriver_June_5;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmValidation {

	public static void main(String[] args) throws Throwable {
		WebDriver orangehrm = new ChromeDriver();
		orangehrm.manage().window().maximize();
		orangehrm.manage().deleteAllCookies();
		orangehrm.get("https://orangehrm.qedgetech.com");
		orangehrm.findElement(By.id("details-button")).click();
		orangehrm.findElement(By.id("proceed-link")).click();
		Thread.sleep(5000);
		WebElement login = orangehrm.findElement(By.xpath("//input[@id='txtUsername']"));
		login.clear();
		login.sendKeys("Admin");
		String username = login.getAttribute("value");
		System.out.println("Username : " + username);

		WebElement password = orangehrm.findElement(By.xpath("//input[@id='txtPassword']"));
		password.clear();
		password.sendKeys("Qedge123!@#");
		String psd = password.getAttribute("value");
		System.out.println("Password : " + psd);

		orangehrm.findElement(By.xpath("//input[@id='btnLogin']")).submit();
		Thread.sleep(5000);
		String Expected = "dashboard";
		String Actual = orangehrm.getCurrentUrl();

		if (Actual.contains(Expected)) {

			System.out.println("Admin Login Sucessfully : " + Expected+ "\n" + Actual);

		} 

		else 
		{

           String errormsg = orangehrm.findElement(By.xpath("//span[@id='spanMessage']")) .getText();
           System.out.println(errormsg + "  " + Expected + "  " + Actual);

		}

     orangehrm.close(); 
     
             
	}

}
