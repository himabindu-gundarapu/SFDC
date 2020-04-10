
import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCases extends ReusableMethods {

	@BeforeTest
	public void Initializer() {
		InitializeDriver();
		CreateReport();
	}

	@Test
	public void LoginToTekArch() throws InterruptedException {
		logger = report.startTest("LoginToTekArch");
		OpenUrl("https://qa01-tekarch-accmanager.web.app/");
		LogIn();
		logger.log(LogStatus.INFO, "TekArch Home page is displayed");

	}

	@Test
	public void LoginError() throws InterruptedException {
		logger = report.startTest("LoginToTekArch");
		OpenUrl("https://qa01-tekarch-accmanager.web.app/");
		LogIn();
		logger.log(LogStatus.INFO, "TekArch Home page is displayed");

		Thread.sleep(10000);
	}

	@Test
	public void AddUser() throws InterruptedException {
		logger = report.startTest("LoginToTekArch");
		OpenUrl("https://qa01-tekarch-accmanager.web.app/");
		logger.log(LogStatus.INFO, "login page is opened");
		LogIn();
		logger.log(LogStatus.INFO, "TekArch Home page is displayed");
		Thread.sleep(10000);

		WebElement addUser = driver.findElement(By.xpath("//span[contains(text(),'addUsers')]"));
		Click(addUser, "AddUser");
		Thread.sleep(2000);
		WebElement Account_No = driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-dashboard/p-dialog[1]/div/div/div[2]/form/div/div[1]/div[2]/input"));
		Account_No.clear();
		EnterText(Account_No, "test1234", "Account_No");
		WebElement Department_no = driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-dashboard/p-dialog[1]/div/div/div[2]/form/div/div[2]/div[2]/input"));
		EnterText(Department_no, "1", "Department no");
		WebElement salary = driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-dashboard/p-dialog[1]/div/div/div[2]/form/div/div[3]/div[2]/input"));
		EnterText(salary, "23456", "Salary");
		WebElement pincode = driver.findElement(By.xpath("//input[@placeholder='Required 6 characters']"));
		EnterText(pincode, "123456", "pincode");
		WebElement SubmitBtn = driver.findElement(By.xpath("//span[contains(text(),'Submit')]"));
		Click(SubmitBtn, "Submit");
		WebElement table = driver.findElement(
				By.xpath("/html/body/app-root/div/div[2]/app-dashboard/div/div[2]/p-table/div/div[2]/table/tbody"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		// System.out.println(rows.get(1).getText());
		boolean FoundIt = false;
		for (int i = 0; i < rows.size(); ++i) {
			List<WebElement> data = rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < data.size(); ++j) {
				System.out.println(data.get(j).getText());
				if (data.get(j).getText().equalsIgnoreCase("test1234")) {
					FoundIt = true;
					System.out.println("Acoount no is found");
					break;
				}
				if (FoundIt) {
					break;
				}
				Assert.assertTrue(!FoundIt);
				System.out.println("Account no is not found");
			}
		}
		Thread.sleep(2000);
	}

	@Test
	public void EditUser() throws InterruptedException {
//		logger = report.startTest("LoginToTekArch");
//		OpenUrl("https://qa01-tekarch-accmanager.web.app/");
//		logger.log(LogStatus.INFO, "login page is opened");
//		LogIn();
//		Thread.sleep(2000);
//		int pagenum = FindPage("test123456");
//		System.out.println("page number = " +pagenum);
//		GotoPage(pagenum);
		 //addUsersList();		
		
		
		

	}

	@AfterClass
	public void quitBrowser() {
		CloseBrowser();
		CloseReport();
	}

}
