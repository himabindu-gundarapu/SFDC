/**
 * 
 */
package com.qa.Base;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import PageFactory.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author sayanna
 *
 */
public class TestBase {
	protected WebDriver driver;
	protected Properties props;
	protected ExtentTest logger;
	protected ExtentReports report;
	 LoginPage objLoginPage;

	public void readProps() {
		props = new Properties();
		String propertiesFilePath = "/Users/sayanna/work/SFDC/SalesForceApplication/src/com/qa/Config/testdata.properties";
		try {
			FileInputStream fileIn = new FileInputStream(propertiesFilePath);
			props.load(fileIn);
			System.getProperties().putAll(props);
			props.list(System.out);
		} catch (Exception e) {
			System.out.println("filenot found");
		}
	}

	public  void InitializeDriver() {
		readProps();
		
		String browserName = props.getProperty("browser");
		WebDriverManager.chromedriver().setup();
		
		System.out.println("browser = " + browserName);
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(props.getProperty("url"));
	}

	public  void CreateReport() {
		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
		String path = "/Users/sayanna/eclipse-workspace/SalesForceReportPOM/Report \n" + "" + fileName;
		report = new ExtentReports(path);

	}
	public void loginSfdc() throws InterruptedException {
		objLoginPage = new LoginPage(driver);
		objLoginPage = new LoginPage(driver);
		objLoginPage.login(props.getProperty("username"),props.getProperty("password"));
		Thread.sleep(2000);
		String actualtitle = driver.getTitle();
		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		Assert.assertEquals(actualtitle, expectedTitle,"home page is not displayed");
		logger.log(LogStatus.PASS, "Home page is diaplayed");
		Thread.sleep(2000);
	}
	public boolean CompareStringArrays(String[] expectedArray,String[] actualArray ) {
		
		HashSet<String> h = new HashSet<String>(Arrays.asList(actualArray));
		
		boolean result=true;
		for (String s: expectedArray ) {
			if (h.contains(s)) { 
				h.remove(s); continue; 
				}
			result = false; 
			break;
		}
		
		Assert.assertTrue(result);
		Assert.assertTrue(h.isEmpty());
		return result && h.isEmpty();
	}
	public void SwitchFrame( String id) {
		driver.switchTo().frame(id);
		logger.log(LogStatus.INFO, "Driver switched to iframe");
		System.out.println("switched to frame");
	}
	public  void SwitchFrame(WebElement element) {
		driver.switchTo().frame(element);
		logger.log(LogStatus.INFO, "Driver switched to iframe");
	}
	public  void SwtitchFrame() {
		driver.switchTo().defaultContent();
		logger.log(LogStatus.INFO, "Driver switched to iframe");
	}

}
