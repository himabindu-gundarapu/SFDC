/**
 * 
 */
package com.qa.Base;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author sayanna
 *
 */
public class TestBase {
	
	protected WebDriver driver;
	protected Properties props = new Properties();
	protected ExtentTest logger;
	protected ExtentReports report;
	
	public ExtentReports getReport() {
		return report;
	}
	
	public void startTest(String str) {
		report.startTest(str);
	}

	public void loadData() {
		// Properties props = new Properties();
		String propertiesFilePath = "/Users/sayanna/work/SFDC/SalesForceApplication/src/com/qa/Config/testdata.properties ";
		try {
			FileInputStream fileIn = new FileInputStream(propertiesFilePath);
			props.load(fileIn);
			System.getProperties().putAll(props);
		} catch (Exception e) {
			System.out.println("filenot found");
		}
	}

	public  void InitializeDriver() {
		String browserName = props.getProperty("browser");
		WebDriverManager.chromedriver().setup();
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(props.getProperty("url"));
	}

	public  void CreateReport() {
		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
		String path = "/Users/sayanna/eclipse-workspace/SalesForceReportPOM/Report \n" + "" + fileName;
		report = new ExtentReports(path);

	}

}
