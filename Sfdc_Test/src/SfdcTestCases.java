import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class SfdcTestCases extends ReusableMethods {
	@BeforeTest
	public void Initializer() {
		CreateReport();
		InitializeDriver();	
	}
	@Test
	public  void TC3_CheckRememberMe() throws InterruptedException {
		logger = report.startTest("TC3_CheckRememberMe()");
		OpenUrl("https://login.salesforce.com/");
		logger.log(LogStatus.INFO, "URL opened successfully");
		WebElement Uname = driver.findElement(By.id("username"));
		EnterText(Uname, "himabindu@sbn.com", "username");
		WebElement pwd = driver.findElement(By.id("password"));
		EnterText(pwd, "nishu123@123", "password");

		WebElement Checkbox = driver.findElement(By.xpath("//input[@class='r4 fl mr8']"));
		Click(Checkbox, "Checkbox");
		logger.log(LogStatus.INFO, "Remembercheck box checked");
		Thread.sleep(3000);
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		Click(loginBtn, "loginbutton");
		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		String actualTitle = driver.getTitle();
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			logger.log(LogStatus.PASS, "User is on home page");
			// System.out.println("User is on home page");
		} else {
			logger.log(LogStatus.FAIL, "home page is not Lunched");
			// System.out.println("home page is not Lunched");
		}
		Thread.sleep(2000);
		 UserMenu();
		 LogOut();
		String userNameText = driver.findElement(By.id("username")).getAttribute("value");
		String str = "himabindu@sbn.com";
		if(userNameText.equalsIgnoreCase(str)) {
			logger.log(LogStatus.PASS, "Username populated in username text box");
		}
		else {
			logger.log(LogStatus.FAIL, "Username  not populated in username text box");
		}
		
	}
	@Test
	public  void Forgotpasword_A() throws InterruptedException {
		logger = report.startTest("TC_ForgotPassword_A");
		OpenUrl("https://login.salesforce.com/");

		WebElement forgot_pwd = driver.findElement(By.xpath("//*[@id=\"forgot_password_link\"]"));
		Click(forgot_pwd, "forgot_pwd");
		Thread.sleep(2000);
		String actualTitle = "Forgot Your Password | Salesforce";
		String expectedTitle=driver.getTitle();
		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
		logger.log(LogStatus.PASS, "forgotpassword checked");
		}
		else {
			logger.log(LogStatus.PASS, "forgotpassword not checked");
		}
		Thread.sleep(2000);
		WebElement Uname = driver.findElement(By.xpath("//*[@id=\"un\"]"));
		EnterText(Uname, "himabindu@sbn.com", "username");
		WebElement ContinueBtn = driver.findElement(By.xpath("//*[@id=\"continue\"]"));
		Click(ContinueBtn, "continue");
		Thread.sleep(2000);
		String actualmsg = "Check Your Email";
		String expected = driver.findElement(By.id("header")).getText();
		if(actualmsg.equalsIgnoreCase(expected)) {
			logger.log(LogStatus.PASS, "Email has sent ");
			}
			else {
				logger.log(LogStatus.PASS, "Email hasn't sent");
			}

	}
	@AfterTest
	public void quitBrowser() {
	CloseBrowser();
	CloseReport();
	}
}
