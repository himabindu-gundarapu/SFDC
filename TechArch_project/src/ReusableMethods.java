import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

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

	public void LogIn() throws InterruptedException {
		WebElement userName = driver
				.findElement(By.xpath("/html/body/app-root/div/div[2]/app-login/div/form/div[1]/input"));
		EnterText(userName, "himabindu@ta.com", "UserName");
		WebElement passWord = driver
				.findElement(By.xpath("/html/body/app-root/div/div[2]/app-login/div/form/div[2]/input"));
		EnterText(passWord, "himabindu", "password");
		WebElement logOutBtn = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		Click(logOutBtn, "Login");
		Thread.sleep(3000);
		String ExpectedTitle = driver.getCurrentUrl();
		System.out.println(ExpectedTitle);
		String ActualTitle = "https://qa01-tekarch-accmanager.web.app/dashboard";
		Assert.assertEquals(ActualTitle, ExpectedTitle, "Home page is not dispalyed");
		logger.log(LogStatus.INFO, "TekArch Home page is displayed");
	}

	public int FindPage(String accountNum) throws InterruptedException {
		
		int pagenum = 1;

		while (true) {
			WebElement table = driver.findElement(
					By.xpath("/html/body/app-root/div/div[2]/app-dashboard/div/div[2]/p-table/div/div[2]/table/tbody"));
			List<WebElement> rows = table.findElements(By.tagName("tr"));
		
			boolean foundIt=false;
			
			for(int i=0; i<rows.size(); ++i)
			{
				List<WebElement> data = rows.get(i).findElements(By.tagName("td"));
				if ((data.get(1).getText().equals(accountNum)) ){
					foundIt=true;
					System.out.println("account number found at page: " + pagenum);
					
					break;
				}
			}
			if (foundIt) { break; }
			
			pagenum++;
			
			WebElement Next = driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-dashboard/div/div[2]/p-table/div/p-paginator/div/a[3]"));
			Next.click();
			Thread.sleep(2000);
		
		}
		WebElement first = driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-dashboard/div/div[2]/p-table/div/p-paginator/div/a[1]"));
		first.click();
		Thread.sleep(2000);
		return pagenum;
	}
	public void GotoPage(int pagenum) throws InterruptedException {
		for(int i=0; i< pagenum-1;i++) {
		WebElement Next = driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-dashboard/div/div[2]/p-table/div/p-paginator/div/a[3]"));
		Next.click();
		Thread.sleep(2000);
		}
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
}
