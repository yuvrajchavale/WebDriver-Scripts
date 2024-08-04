package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StartBrowser {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://animerulz.pro");

	}

}
