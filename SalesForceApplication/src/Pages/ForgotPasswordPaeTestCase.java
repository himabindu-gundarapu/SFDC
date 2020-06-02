package Pages;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.relevantcodes.extentreports.LogStatus;

import PageFactory.ForgotPasswordPage;

public class ForgotPasswordPaeTestCase extends TestBase{
	ForgotPasswordPage objForgotPasswordPage;
	@BeforeTest
	public void setup() {
		InitializeDriver();
		CreateReport();
	}
	@Test
	public void ForgotPassword() {
		logger = report.startTest("ForgotPassword");
		objForgotPasswordPage = new ForgotPasswordPage(driver);
		
		objForgotPasswordPage.ClickForgotPasswordLink();
		String actual = objForgotPasswordPage.validateForgotPageTitle();
		String expected ="Forgot Your Password";
		Assert.assertEquals(actual,expected ,"Forgot your password page is not displayed");
		logger.log(LogStatus.INFO, "Forgot your password page is displayed");
		objForgotPasswordPage.enterEmail(props.getProperty("username"));
		objForgotPasswordPage.ClickContinue();
		String actualTitle = objForgotPasswordPage.validateCheckyourMailPageTitle();
		String expectedTitle = "Check Your Email | Salesforce";
		Assert.assertEquals(actualTitle, expectedTitle,"Checkyour mail page is not displayed");
		logger.log(LogStatus.PASS, "Check your mail page is displayed");
		}

	@AfterTest
	public void Close() {
	driver.quit();
	report.flush();
	}
}
