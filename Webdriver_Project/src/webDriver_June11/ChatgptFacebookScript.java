/*
 * package webDriver_June_11;
 * 
 * import java.util.List; import org.openqa.selenium.By; import
 * org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.support.ui.ExpectedConditions; import
 * org.openqa.selenium.support.ui.Select; import
 * org.openqa.selenium.support.ui.WebDriverWait;
 * 
 * public class ChatgptFacebookScript {
 * 
 * public static void main(String[] args) { WebDriver Fcbk = new ChromeDriver();
 * try { Fcbk.manage().window().maximize(); Fcbk.manage().deleteAllCookies();
 * Fcbk.navigate().to("https://www.facebook.com/");
 * 
 * WebDriverWait wait = new WebDriverWait(Fcbk, 10);
 * 
 * // Wait and click on Create new account
 * wait.until(ExpectedConditions.elementToBeClickable(By.
 * linkText("Create new account"))).click();
 * 
 * // Fill the form
 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")
 * )).sendKeys("Yuvraj");
 * Fcbk.findElement(By.name("lastname")).sendKeys("Chavale");
 * Fcbk.findElement(By.name("reg_email__")).sendKeys("7585948862");
 * Fcbk.findElement(By.name("reg_passwd__")).sendKeys("TR87;af_nnBc9PK");
 * 
 * // Select date of birth Select daylist = new
 * Select(Fcbk.findElement(By.cssSelector("#day")));
 * daylist.selectByVisibleText("18"); Select monthlist = new
 * Select(Fcbk.findElement(By.cssSelector("#month")));
 * monthlist.selectByVisibleText("Aug"); Select yearlist = new
 * Select(Fcbk.findElement(By.cssSelector("#year")));
 * yearlist.selectByVisibleText("1997");
 * 
 * // Count items in dropdowns printDropdownItemCount(daylist, "Day");
 * printDropdownItemCount(monthlist, "Month"); printDropdownItemCount(yearlist,
 * "Year");
 * 
 * // Select gender and submit
 * Fcbk.findElement(By.xpath("//label[normalize-space()='Male']")).click();
 * Fcbk.findElement(By.name("websubmit")).click();
 * 
 * // Wait for the next page to load
 * wait.until(ExpectedConditions.urlContains("expected-url-part-after-signup"));
 * System.out.println("Current URL: " + Fcbk.getCurrentUrl());
 * 
 * } catch (Exception e) { e.printStackTrace(); } finally { Fcbk.quit(); } }
 * 
 * private static void printDropdownItemCount(Select select, String name) {
 * List<WebElement> options = select.getOptions();
 * System.out.println("No of Items in " + name + ": " + options.size()); for
 * (WebElement option : options) { System.out.println(name + " Listbox Items: "
 * + option.getText()); } } }
 */
package webDriver_June11;

