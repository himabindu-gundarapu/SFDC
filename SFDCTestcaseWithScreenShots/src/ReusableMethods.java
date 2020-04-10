import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReusableMethods {
	static WebDriver driver;
	static ExtentTest logger;
	static ExtentReports report;

	public static void InitializeDriver() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public static void OpenUrl(String url) {
		driver.get(url);
		
	}

	public static void CreateReport() {
		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
		String path = "/Users/sayanna/work/TekArchAutomationReports/Reports" + fileName;
		report = new ExtentReports(path);

	}

	public static void CloseReport() {
		report.flush();
	}

	public static void CloseBrowser() {
		driver.quit();
	}

	public static void EnterText(WebElement element, String text, String objName) {
		if (element == null || !element.isDisplayed()) {
			System.out.println("Textbox is not found ");
			logger.log(LogStatus.ERROR, objName + " Textbox is not found.");
		} else {
			System.out.println("Textbox is found ");
			logger.log(LogStatus.INFO, objName + " Textbox is found");
			element.sendKeys(text);
		}
	}

	public static void Click(WebElement element, String objName) {
		if (element == null || !element.isDisplayed()) {
			logger.log(LogStatus.ERROR, objName + " Element is not found.");
			System.out.println("element is not found ");
		} else {
			System.out.println("element is  found ");
			logger.log(LogStatus.INFO, objName + " Element is found");
			element.click();
		}

	}

	public static void LogOut() throws InterruptedException {
		WebElement logOutBtn = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
		Click(logOutBtn, "logout");
		logger.log(LogStatus.INFO, "the page is log out and salesforce login page displayed");
		Thread.sleep(3000);

	}

	public static void UserMenu() {
		WebElement usermenuBtn = driver.findElement(By.xpath("//*[@id=\"userNav\"]"));
		// *[@id="userNav"]
		Click(usermenuBtn, "usermenubutton");
	}

	public static String getScreenshot() throws Exception {
		// below line is just to append the date format with the screenshot name to
		// avoid duplicate names
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		// after execution, you could see a folder "FailedTestsScreenshots" under src
		// folder
		String destination = System.getProperty("/Users/sayanna/work/TekArchAutomationReports/Reports")+ dateName
				+ ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(sourceFile, finalDestination);
		// Returns the captured file path
		return destination;
	}
}
