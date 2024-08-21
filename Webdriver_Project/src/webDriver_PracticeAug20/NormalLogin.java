package webDriver_PracticeAug20;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalLogin {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://automationexercise.com/");
		driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();
		driver.findElement(By.xpath("(//input[contains(@name,'email')])[1]")).sendKeys("ucchawale@gmail.com");
		driver.findElement(By.xpath("(//input[contains(@name,'password')])[1]")).sendKeys("Ab@180897");
		driver.findElement(By.xpath("(//button[@class='btn btn-default'])[1]")).click();
		String Login =  driver.findElement(By.xpath("//b[contains(text(),'Yuvraj Chavale')]")).getText();
		System.out.println(Login);
		
		
		WebElement Dress = driver.findElement(By.xpath("//img[@src= '/get_product_picture/15']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView()", Dress);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href= '/product_details/15']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-default cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@href='/view_cart'])[2]")).click();
		
		WebElement table = driver.findElement(By.id("cart_info"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (WebElement tbRow : rows) {
			List<WebElement> cells = tbRow.findElements(By.tagName("td"));
			
			for (WebElement tbCell : cells) {
				System.out.println(tbCell.getText() + " ");
			}
			System.out.println();
		}
		
		
		driver.close();
	}
}