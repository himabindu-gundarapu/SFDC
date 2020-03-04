import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReusableMethods {
	WebDriver driver;
	ExtentTest logger;
	ExtentReports report;

	public void InitializeDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public void OpenUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void CreateReport() {
		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
		String path = "/Users/sayanna/eclipse-workspace/SFDC37/Report/" + fileName;
		report = new ExtentReports(path);
	}
	public void CloseReport() {
		report.flush();
	
	}

	public void CloseBrowser() {
		driver.quit();
	}

	public void EnterText(WebElement element, String text, String objName) {
		if (element == null || !element.isDisplayed()) {
			System.out.println("Textbox is not found ");
			logger.log(LogStatus.ERROR, objName + " Textbox is not found.");
		} else {
			System.out.println("Textbox is found ");
			logger.log(LogStatus.INFO, objName + " Textbox is found");
			element.sendKeys(text);
		}
	}

	public void Click(WebElement element, String objName) {
		if (element == null || !element.isDisplayed()) {
			logger.log(LogStatus.ERROR, objName + " Element is not found.");
			System.out.println("element is not found ");
		} else {
			System.out.println("element is  found ");
			logger.log(LogStatus.INFO, objName + " Element is found");
			element.click();
		}

	}

	public void UserMenu() {
		WebElement usermenuBtn = driver.findElement(By.xpath("//*[@id=\"userNav\"]"));
		// *[@id="userNav"]
		Click(usermenuBtn, "usermenubutton");
	}

	public void LogOut() throws InterruptedException {
		WebElement logOutBtn = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
		Click(logOutBtn, "logout");
		logger.log(LogStatus.INFO, "the page is log out and salesforce login page displayed");
		Thread.sleep(3000);

	}

}
