import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;
public class LoginSFDC extends ReusableMethodsSFDC {
	
	@BeforeTest
	@Parameters("browser")
	public void Initializer(String browser) {
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		CreateReport();
		//InitializeDriver();
		
	}
	@Test
	@Parameters("browser")
	public  void TC1_LoginErrorMessage() throws InterruptedException {
	// CreateReport();
	logger = report.startTest("TC1_LoginErrorMessage");
	OpenUrl("https://login.salesforce.com/");
	logger.log(LogStatus.INFO, "URL opened sucessfully");
	WebElement Uname = driver.findElement(By.id("username"));
	// Uname.sendKeys("himabindu@sbn.com");
	EnterText(Uname, "himabindu@sbn.com", "username");
	WebElement pwd = driver.findElement(By.id("password"));
	pwd.clear();
	WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"Login\"]"));
	Click(loginBtn, "loginbutton");
	Thread.sleep(2000);
	String errormessage = driver.findElement(By.id("error")).getText();
	String msg = "Please enter your password.";
	//Assert.assertEquals(errormessage,msg);
	if (msg.equals(errormessage)) {
	logger.log(LogStatus.INFO, "Error message displayed");
	// System.out.println(" error message displayed");
	} else {
	logger.log(LogStatus.INFO, "Error message not displayed");
	// System.out.println(" error msg not displayed");
	}
	}
	@Test
	public  void TC2_LoginToSalesForce() throws InterruptedException{
	logger = report.startTest("TC2_LoginToSalesForce");
	// logger = report.startTest("TC2_LoginToSalesForce");
	OpenUrl("https://login.salesforce.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	logger.log(LogStatus.INFO, "URL opened successfully");
	WebElement Uname = driver.findElement(By.id("username"));
	EnterText(Uname, "himabindu@sbn.com", "username");
	WebElement pwd = driver.findElement(By.id("password"));
	EnterText(pwd, "nishu123@123", "password");
	WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"Login\"]"));
	Click(loginBtn, "loginbutton");
	Thread.sleep(2000);
	String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
	String actualTitle = driver.getTitle();
	if (actualTitle.equalsIgnoreCase(expectedTitle)) {
	logger.log(LogStatus.PASS, "User is on home page");
	// System.out.println("User is on home page");
	} else {
	logger.log(LogStatus.FAIL, "home page is not Lunched");
	// System.out.println("home page is not Lunched");
	}

	}
	@AfterTest
	public void quitBrowser() {
	CloseBrowser();
	CloseReport();
	}

}
