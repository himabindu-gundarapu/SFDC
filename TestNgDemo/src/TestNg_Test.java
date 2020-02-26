import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class TestNg_Test extends ReusableMethodsTestNg {
	@BeforeTest
	public void Initializer() {
		InitializeDriver();
		CreateReport();
	}
	@Test
	public void TC2_LoginToSalesForce() throws InterruptedException {
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

	
	

}
