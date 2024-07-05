package webDriverJune_24;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;

import org.apache.commons.io.output.FileWriterWithEncoding;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebpageText {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com");
		Thread.sleep(3000);
		File F = new File("D:/Primus.txt");
		FileWriter fw = new FileWriter(F);
		BufferedWriter bw  = new BufferedWriter(fw);
		String para1 = driver.findElement(By.xpath("//p[contains(text(),'1969')]")).getText();
		String para2 = driver.findElement(By.xpath("//p[contains(text(),'1975')]")).getText();
		bw.write(para1);
		bw.newLine();
		bw.newLine();
		bw.write(para2);
		bw.flush();
		bw.close();
		driver.quit();
		

	}

}
