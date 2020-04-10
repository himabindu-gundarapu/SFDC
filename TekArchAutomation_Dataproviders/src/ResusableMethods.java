import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ResusableMethods {
	static WebDriver driver;
	static ExtentTest logger;
	static ExtentReports report;
	
	public static void InitializeDriver() 
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
	}
	public static void OpenUrl (String url) 
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void CreateReport() {
		String fileName = new SimpleDateFormat("'TekArchReport_'YYYYMMddHHmm'.html'").format(new Date());
		String path = "/Users/sayanna/work/TekArchAutomationReports/Reports \n" + 
				""+ fileName;
		report = new ExtentReports(path);
		
	}
	public static void CloseReport() {
		report.flush();
	}
	public static void CloseBrowser()
	{
		driver.quit();
	}
	
	public static void EnterText(WebElement element, String text, String objName) 
	{
		if (element == null || !element.isDisplayed())
		{
			System.out.println("Textbox is not found ");
		logger.log(LogStatus.ERROR, objName + " Textbox is not found.");
		} else 
		{
			System.out.println("Textbox is found ");
		logger.log(LogStatus.INFO, objName + " Textbox is found");
			element.sendKeys(text);
		}
	}
	public static void Click(WebElement element, String objName) 
	{
		if (element == null || !element.isDisplayed()) 
		{
			logger.log(LogStatus.ERROR, objName + " Element is not found.");
			System.out.println("element is not found ");
		} else
		{
			System.out.println("element is  found ");
			logger.log(LogStatus.INFO, objName + " Element is found");
			element.click(); 
		}
	

}
}
