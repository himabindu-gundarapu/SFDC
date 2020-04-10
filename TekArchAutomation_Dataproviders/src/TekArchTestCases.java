import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class TekArchTestCases extends ResusableMethods {
	@BeforeTest
	public void Intializer() {
		
		
		InitializeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		CreateReport();
	}
	@Test(dataProvider = "loginUserData")
	public static void loginToPortal(String username,String password ) throws InterruptedException {
		OpenUrl("https://qa01-tekarch-accmanager.web.app/");
		logger = report.startTest("loginToPortal");
		WebElement uname = driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid' and @type='text']"));
		uname.sendKeys(username);
		WebElement pwd = driver.findElement(By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-invalid' and @type='password']"));
		pwd.sendKeys(password);
		WebElement btn = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		btn.click();
		String actualTitle = driver.getTitle();
		String expectedTitle = "Apitesting";
		Assert.assertEquals(actualTitle, expectedTitle);
		logger.log(LogStatus.PASS, "The login page is dispalyed");
		
		}
	@DataProvider(name = "loginUserData")
	public static Object[][] login_data(){
		 return new Object[][] {
            { "himabindu@ta.com", "himabindu" },
            { "mithun@ta.com", "mithun" },
		 };
	}

	@AfterTest
	public void quitBrowser() {
		CloseBrowser();
		CloseReport();
	}

}
