import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

public class TestCase extends ReusableMethods {
public static void main(String[] args) throws Exception {
	
	CreateReport();
	InitializeDriver();
	
	TC1_LoginErrorMessage();
//	TC2_LoginToSalesForce();
//	TC3_CheckRememberMe();
//	Forgotpasword_A();
//	Forgotpassword_B();
	CloseBrowser();
	CloseReport();
}

	public static void TC1_LoginErrorMessage() throws Exception {
		// CreateReport();
		logger = report.startTest("TC1_LoginErrorMessage");
		OpenUrl("https://login.salesforce.com/");
		logger.log(LogStatus.INFO, "URL opened sucessfully");
		WebElement Uname = driver.findElement(By.id("username"));
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
			logger.log(LogStatus.PASS, logger.addScreenCapture(getScreenshot()));
			// System.out.println(" error message displayed");
		} else {
			logger.log(LogStatus.INFO, "Error message not displayed");
			// System.out.println(" error msg not displayed");
		}
	}

	public static void TC2_LoginToSalesForce() throws InterruptedException {
		
		logger = report.startTest("TC2_LoginToSalesForce");
		
		OpenUrl("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		logger.log(LogStatus.INFO, "URL opened successfully");
		WebElement Uname = driver.findElement(By.id("username"));
		EnterText(Uname, "himabindu@sbn.com", "username");
		WebElement pwd = driver.findElement(By.id("password"));
		EnterText(pwd, "nishu123@123", "password");
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		Click(loginBtn, "loginbutton");
		//Thread.sleep(2000);
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

	public static void TC3_CheckRememberMe() throws InterruptedException {
		// CreateReport();
		//logger = report.startTest("TC3_CheckRememberMe()");
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

	public static void Forgotpasword_A() throws InterruptedException {
		// CreateReport();
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
		//Thread.sleep(2000);
		WebElement Uname = driver.findElement(By.xpath("//*[@id=\"un\"]"));
		EnterText(Uname, "himabindu@sbn.com", "username");
		WebElement ContinueBtn = driver.findElement(By.xpath("//*[@id=\"continue\"]"));
		Click(ContinueBtn, "continue");
		//Thread.sleep(2000);
		String actualmsg = "Check Your Email";
		String expected = driver.findElement(By.id("header")).getText();
		if(actualmsg.equalsIgnoreCase(expected)) {
			logger.log(LogStatus.PASS, "Email has sent ");
			}
			else {
				logger.log(LogStatus.PASS, "Email hasn't sent");
			}

	}

	public static void Forgotpassword_B() throws InterruptedException {
		// CreateReport();
		logger = report.startTest("TC_ForgotPassword");
		OpenUrl("https://login.salesforce.com/");
		WebElement Uname = driver.findElement(By.id("username"));
		EnterText(Uname, "abc@dfg", "username");
		logger.log(LogStatus.PASS, "wrong user name entered");
		WebElement pwd = driver.findElement(By.id("password"));
		EnterText(pwd, "123", "password");
		logger.log(LogStatus.PASS, "wrong password entered");
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		Click(loginBtn, "loginbutton");
		String ActualError = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		String expectedError =driver.findElement(By.id("error")).getText();
		if(ActualError.equalsIgnoreCase(expectedError)){
			logger.log(LogStatus.PASS, "\"Username and password incorrect\");");
		}
		else {
			logger.log(LogStatus.FAIL, "\"Username and password correct\");");
		}
		//Thread.sleep(2000);

	}

}

