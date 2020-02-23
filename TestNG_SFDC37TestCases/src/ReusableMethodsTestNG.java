//import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReusableMethodsTestNG {
	 WebDriver driver;
	//static ExtentTest logger;
	//static ExtentReports report;
	
	public  void InitializeDriver() 
	{
		WebDriverManager.chromedriver().setup();	
		driver = new ChromeDriver();
	}
	
	public void OpenUrl(String url) 
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public  void CloseBrowser()
	{
		driver.quit();
	}
	
	public  void EnterText(WebElement element, String text, String objName) 
	{
		
		Assert.assertTrue((element != null) && (element.isDisplayed()));
		Assert.assertTrue(element.isDisplayed(),"Text box is found");
		element.sendKeys(text);
//	
//		if (element == null || !element.isDisplayed())
//		{
//			System.out.println("Textbox is not found ");
//		//logger.log(LogStatus.ERROR, objName + " Textbox is not found.");
//		} else 
//		{
//			System.out.println("Textbox is found ");
//		//logger.log(LogStatus.INFO, objName + " Textbox is found");
//			element.sendKeys(text);
//		}
	}
	public void Click(WebElement element, String objName) 
	{
		Assert.assertTrue((element!=null) &&(element.isDisplayed()),"Element is found");
		element.click();
//		if (element == null || !element.isDisplayed()) 
//		{
//			//logger.log(LogStatus.ERROR, objName + " Element is not found.");
//			System.out.println("element is not found ");
//		} else
//		{
//			System.out.println("element is  found ");
//			//logger.log(LogStatus.INFO, objName + " Element is found");
//			element.click(); 
//		}
	

	}
	public  void UserMenu() {
		WebElement usermenuBtn = driver.findElement(By.xpath("//*[@id=\"userNav\"]"));
		//*[@id="userNav"]
		Click(usermenuBtn,"usermenubutton");		
	}
	public  void LogOut() throws InterruptedException {
		WebElement logOutBtn = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
		Click(logOutBtn, "logout");
		//logger.log(LogStatus.INFO, "the page is log out and salesforce login page displayed");
		Thread.sleep(3000);

	}
	
	public  void Text() throws InterruptedException {
		  //To handle unexpected alert on page load.
		  try{   
		   driver.switchTo().alert().dismiss();  
		  }catch(Exception e){ 
		   System.out.println("unexpected alert not present");   
		  }
	}
	public void SwitchFrame( String id) {
		driver.switchTo().frame(id);
		System.out.println("switched to frame");
	}
	public void SwitchFrame(WebElement element) {
		driver.switchTo().frame(element);
	}
	public  void SwtitchFrame() {
		driver.switchTo().defaultContent();
	}
	public void login() throws InterruptedException {
		OpenUrl ("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//logger.log(LogStatus.INFO, "URL opened successfully");
		WebElement Uname = driver.findElement(By.id("username"));
		EnterText(Uname, "himabindu@sbn.com", "username");
		WebElement pwd = driver.findElement(By.id("password"));
		EnterText(pwd, "nishu123@123", "password");
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		Click(loginBtn,"loginbutton");
		Thread.sleep(2000);
		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		String actualTitle = driver.getTitle();
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			//logger.log(LogStatus.PASS, "User is on home page");
			System.out.println("User is on home page");
		}
		else {
			//logger.log(LogStatus.FAIL, "home page is not Lunched");
		 System.out.println("home page is not Lunched");
		}
	}
	public  void SwitchWindow(String oldwindow ,String Url) {
		
		Set<String> getAllWindows = driver.getWindowHandles();
		String[] getWindow = getAllWindows.toArray(new String[getAllWindows.size()]);
		// System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(getWindow[1]);
		System.out.println(driver.getCurrentUrl());
		driver.get("Url");
		driver.manage().window().maximize();

		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(oldwindow);

		driver.close();
	}
}
