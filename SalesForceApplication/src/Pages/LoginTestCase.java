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
	//WebDriver driver;
	LoginPage objLogin;
//	TestBase objTestBase = new TestBase();
	@BeforeTest
	public void setup() {
		loadData();
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
		//EnterText(WebElement element, String text, String objName)
		objLogin.enterUserName("himabindu@sbn.com");
		objLogin.enterPassWord("nishu123@123");
		objLogin.clickLogin();
		Thread.sleep(2000);
		String actualtitle = driver.getTitle();
		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		Assert.assertEquals(actualtitle, expectedTitle,"home page is not displayed");
		logger.log(LogStatus.PASS, "Home page is diaplayed");
		
		
	}
	@AfterTest
	public void Close() {
		driver.quit();
		report.flush();
		
		
	}
}
