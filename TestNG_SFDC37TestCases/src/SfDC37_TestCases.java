
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SfDC37_TestCases extends ReusableMethodsTestNG {
	
	@BeforeTest
	public  void Intializer() {
		System.out.println("Initializer");
		//WebDriverManager.chromedriver().setup();
		InitializeDriver();
	}
	
	@Test
	public void TC1_LoginErrorMessage() throws InterruptedException {
		// CreateReport();
		//logger = report.startTest("TC1_LoginErrorMessage");
		OpenUrl("https://login.salesforce.com/");
		//logger.log(LogStatus.INFO, "URL opened sucessfully");
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
		Assert.assertEquals(errormessage,msg);
//		if (msg.equals(errormessage)) {
//			logger.log(LogStatus.INFO, "Error message displayed");
//			// System.out.println(" error message displayed");
//		} else {
//			logger.log(LogStatus.INFO, "Error message not displayed");
//			// System.out.println(" error msg not displayed");
//		}
	}

	
}
