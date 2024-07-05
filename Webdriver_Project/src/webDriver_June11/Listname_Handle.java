package webDriver_June11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listname_Handle {

	public static void main(String[] args) throws Throwable{
		WebDriver itemSelect = new ChromeDriver();
		itemSelect.manage().window().maximize();
		itemSelect.manage().deleteAllCookies();
		itemSelect.navigate().to("http://facebook.com");
		itemSelect.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		//Store day,Month,year listbox into select class
		Select daylist = new Select(itemSelect.findElement(By.cssSelector("#day")));
		Select monthlist = new Select(itemSelect.findElement(By.cssSelector("#month")));
		Select yearlist = new Select(itemSelect.findElement(By.cssSelector("#year")));
		
		//Verify day listbox is multiple or single selection
		boolean value1 = daylist.isMultiple();
		boolean value2 = monthlist.isMultiple();
		boolean value3 = yearlist.isMultiple();
		
		System.out.println("Day List is Multiple Selection: " + value1 + 
				           "\nMonth List is Multiple Selection: " + value2 + 
				           "\nYear List is Multiple Selection: " + value3);
		
		//Select items in three listbox
		
		daylist.selectByIndex(17);
		System.out.println(daylist.getFirstSelectedOption().getText());
		daylist.selectByVisibleText("18");
		System.out.println(daylist.getFirstSelectedOption().getText());
		monthlist.selectByIndex(7);
		System.out.println(monthlist.getFirstSelectedOption().getText());
		monthlist.selectByVisibleText("Aug");
		System.out.println(monthlist.getFirstSelectedOption().getText());
		yearlist.selectByVisibleText("1997");
		System.out.println(yearlist.getFirstSelectedOption().getText());
		
		
		System.out.println("Birth Date of Yuvraj: " + 
		                    daylist.getFirstSelectedOption().getText() + "/" + 
				            monthlist.getFirstSelectedOption().getText() + "/" +
		                    yearlist.getFirstSelectedOption().getText());

	}

}
