package webDriverJune_21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TableHandleOhrm {

	public static void main(String[] args) throws Throwable {
		String Expected_Name = "Ayra";
		boolean Exist_Name = false;
		WebDriver orangehrm = new ChromeDriver();
		orangehrm.manage().window().maximize();
		orangehrm.manage().deleteAllCookies();
		orangehrm.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		Thread.sleep(5000);
		
		//Using JavaScript to acess Username & Password
		Actions ac = new Actions(orangehrm);
		JavascriptExecutor js = (JavascriptExecutor)orangehrm;
		js.executeScript("document.getElementById('txtUsername').value='Admin1'");
		js.executeScript("document.querySelector('#txtPassword').value='Qedge123!@#'");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"#btnLogin\").click()");
		Thread.sleep(3000);
		
		//Login Verification
		
		String Expected_Login = "dashboard";
		String Actual_Login = js.executeScript("return document.URL").toString();
		if (Actual_Login.contains(Expected_Login)) {
			System.out.println("Login Sucessfully: " + Expected_Login + " " + Actual_Login);
			
		} else {
			String errormsg = js.executeScript("return document.getElementById('spanMessage').innerHTML").toString();
			System.out.println(errormsg + " " + Expected_Login + " " + Actual_Login);

		}
		Thread.sleep(5000);
		
		//Mouse movemebnt to PIM Option
		ac.moveToElement(orangehrm.findElement(By.id("menu_pim_viewPimModule"))).click().perform();
		
		//To get collection
		WebElement webtable = orangehrm.findElement(By.id("resultTable"));
		List<WebElement> rows,cols;
		
		//to get Number of Rows in PIM Table
		rows = webtable.findElements(By.tagName("tr"));
		int row = rows.size()-1;
		System.out.println("No of Rows in PIM Table: " + row);
		Thread.sleep(3000);
		
		//Print the Data in columns
		
		for (WebElement eachrows : rows) {
			cols = eachrows.findElements(By.tagName("td"));
			
			//This loop for print data in columns
			for (WebElement eachcell : cols) {
				String Actual = eachcell.getText();
				System.out.println(Actual);
				
			if (Actual.equalsIgnoreCase(Expected_Name)) {
				Exist_Name = true;
				//break;
				
			}	
			}
			
			System.out.println("=======================");
			
		}
		
		if (Exist_Name) {
			System.out.println(Expected_Name + " " + "Name Exist in PIM Table");
		} else {
			System.out.println(Expected_Name + " " + "Name Not Exist in PIM Table");

		}
				
		Thread.sleep(5000);
	}

}
