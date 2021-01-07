/**
 * 
 */
package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.relevantcodes.extentreports.LogStatus;

import PageFactory.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author hima
 * login page testcases
 *
 */

public class LoginTestCase extends TestBase {
	LoginPage objLogin;

	@BeforeTest
	public void setup() {
		InitializeDriver();
		CreateReport();
	}
	
	@Test
	public  void Login() throws InterruptedException {
		logger = report.startTest("LoginToSalesForceApplication");
		
		String actual = driver.getTitle();
		
		System.out.println(actual);
		String expected = "Login | Salesforce";
		Assert.assertEquals(actual, expected, "login page is not displayed");
		logger.log(LogStatus.INFO, "Login page is dispalyed");
		objLogin = new LoginPage(driver);
		objLogin.login(props.getProperty("username"),props.getProperty("password"));
	
		Thread.sleep(2000);
		String actualtitle = driver.getTitle();
		Thread.sleep(2000);
		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		Assert.assertEquals(actualtitle, expectedTitle,"home page is not displayed");
		logger.log(LogStatus.PASS, "Home page is diaplayed");
	}
	
	@Test
	public void loginErrorMessage() throws InterruptedException{
		logger = report.startTest("LoginErrorMessage");
		objLogin = new LoginPage(driver);
		//objLogin.clearPwd();
		objLogin.login(props.getProperty("username"),"");
		Thread.sleep(2000);
		String actualMsg = objLogin.pwdclear_errorMsg();	
		Assert.assertEquals(actualMsg, "Please enter your password.");
		logger.log(LogStatus.PASS, "Error Message Displayed");
		}
	@Test
	public void TC3_CheckRememberMe() {
		logger = report.startTest("TC3_CheckRememberMe");
		objLogin = new LoginPage(driver);
		objLogin.enterUname(props.getProperty("username"));
		objLogin.enterPwrd(props.getProperty("password"));
		objLogin.rememberCheckbox();
		objLogin.loginClick();
		String actualtitle = driver.getTitle();
		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		Assert.assertEquals(actualtitle, expectedTitle,"home page is not displayed");
		logger.log(LogStatus.PASS, "Home page is diaplayed");
		}
	@Test
	public void WrongUsername() {
		logger = report.startTest("wrongUserName");
		objLogin = new LoginPage(driver);
		objLogin.login(props.getProperty("wrongUsername"),props.getProperty("wrongPassword"));
		String actual = objLogin.pwdclear_errorMsg();
		String expected ="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		Assert.assertEquals(actual, expected,"Error message not displayed");
		logger.log(LogStatus.INFO, "Errormessage displayed");
		
		
	}
	@AfterTest
	public void Close() {
		driver.quit();
		report.flush();
	}
}
