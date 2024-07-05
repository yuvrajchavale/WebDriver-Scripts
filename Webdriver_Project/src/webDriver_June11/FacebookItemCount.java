package webDriver_June11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookItemCount {

	public static void main(String[] args) throws Throwable {
		WebDriver Fcbk = new ChromeDriver();
		Fcbk.manage().window().maximize();
		Fcbk.manage().deleteAllCookies();
		Fcbk.navigate().to("https://www.facebook.com/");
		Thread.sleep(700);
		Fcbk.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		Fcbk.findElement(By.name("firstname")).sendKeys("Yuvraj");
		Fcbk.findElement(By.name("lastname")).sendKeys("Chavale");
		Fcbk.findElement(By.name("reg_email__")).sendKeys("7585948862");
		Fcbk.findElement(By.name("reg_passwd__")).sendKeys("TR87;af_nnBc9PK");
		
		Select daylist = new Select(Fcbk.findElement(By.cssSelector("#day")));
		daylist.selectByVisibleText("18");
		Select monthlist = new Select(Fcbk.findElement(By.cssSelector("#month")));
		monthlist.selectByVisibleText("Aug");
		Select yearlist = new Select(Fcbk.findElement(By.cssSelector("#year")));
		yearlist.selectByVisibleText("1997");
		
		Select daylistbox = new Select(Fcbk.findElement(By.cssSelector("#day")));
		Select monthlistbox = new Select(Fcbk.findElement(By.cssSelector("#month")));
		Select yearlistbox = new Select(Fcbk.findElement(By.cssSelector("#month")));
		
		List<WebElement> DItems_Count = daylistbox.getOptions();
		System.out.println("No of Items in Day: " + DItems_Count.size());
        int D = DItems_Count.size(); 
		
        List<WebElement> MItems_Count = monthlistbox.getOptions();
		System.out.println("No of Items in Month: " + MItems_Count.size());
		int M = MItems_Count.size();
		
		List<WebElement> YItems_Count = yearlistbox.getOptions();
		System.out.println("No of Items in Year: " +  YItems_Count.size());
		int Y = YItems_Count.size();
		
	    //System.out.println("Total No of Items in Day, Month, Year, ListBox: " + DItems_Count.size() + MItems_Count.size() + YItems_Count.size() );
	    
		int TDMY =  D + M + Y;
	    System.out.println("Total Items Count of Day, Month, Year = " + TDMY );
		
		//iteration all Items 
		
		for (WebElement Day : DItems_Count) {
			
			System.out.println("Day Listbox Items: " + Day.getText());
			
		}
		
		for (WebElement Month : MItems_Count) {
			
			System.out.println("Month Listbox Items: " + Month.getText());
		}
		
		for (WebElement Year : YItems_Count) {
			
			System.out.println("Year Listbox Items: " + Year.getText());
		}
		
		Fcbk.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		Fcbk.findElement(By.name("websubmit")).click();
		

	}

}
