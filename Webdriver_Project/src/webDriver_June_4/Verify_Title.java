package webDriver_June_4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Verify_Title {

	public static void main(String[] args) throws Throwable {
		WebDriver medge = new ChromeDriver();
		medge.manage().window().maximize();
		medge.manage().deleteAllCookies();
		Thread.sleep(5000);
		
	    medge.get("https://quillbot.com");
	    String Expected_Title = "Quillbot";
	    String Actual_Title = medge.getCurrentUrl();
	    
	    if(Actual_Title.equalsIgnoreCase(Expected_Title)) {
	    	
	    	System.out.println("Title Matching :" + Expected_Title + " " + Actual_Title);
	    	
	    }
	    else {
	    	System.out.println("Title Matching :" + Expected_Title + " " + Actual_Title);
	    }
	    
	    medge.quit();

	}

}
