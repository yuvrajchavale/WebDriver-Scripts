package webDriver_June_4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Url {

	public static void main(String[] args) throws InterruptedException {
		WebDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.manage().deleteAllCookies();
		chrome.get("https://flipkart.com");
		Thread.sleep(5000);
		String Expect_Url = "https://";
		String Actual_Url = chrome.getCurrentUrl();
		if (Actual_Url.startsWith(Expect_Url)) {
			
			System.out.println("Url Starts with Expected Result " + Actual_Url +" " + Expect_Url );
			
		} else {
			
			System.out.println("Url Not Starts with Expected Result " + Actual_Url +" " + Expect_Url );

		}
		chrome.close();

	}

}
