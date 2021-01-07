package Pages;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.relevantcodes.extentreports.LogStatus;

import PageFactory.LoginPage;
import PageFactory.UserMenuPage;

public class UserMenuTestCases extends TestBase {
	UserMenuPage objUserMenu;
	LoginPage objLoginPage;
	LoginTestCase objLoginTestCase;
	public void userMenuElementsValidate() {
		String[] actualUsermenuElements = objUserMenu.userMenuElements();
		String usermenuElements = "My Profile;My Settings;Developer Console;Switch to Lightning Experience;Logout";
		String[] expecteduserMenuList = usermenuElements.split(";");
		boolean result =CompareStringArrays(actualUsermenuElements, expecteduserMenuList);
		Assert.assertTrue(result,"Usermenu elements not displayed");
		logger.log(LogStatus.PASS, "Usermenu elements displayed");
		// Printing user menu options
		for(String s : actualUsermenuElements) {
			System.out.println(s);
		}
		
		
	}
	
	@BeforeTest
	public void setup() throws InterruptedException {
		InitializeDriver();
		CreateReport();
		objUserMenu = new UserMenuPage(driver);
		}
	/* UserMenu dropdown elements displayed or  not TestCase */
	@Test
	public void TC05() throws InterruptedException {
		logger = report.startTest("TC05");
		loginSfdc();
		objUserMenu.Validateusermenu(logger);		
		objUserMenu.click("usermenu");
		Thread.sleep(2000);
		userMenuElementsValidate();
		}
	@Test
	public void TC06() throws InterruptedException {
		logger = report.startTest("TC06");
		loginSfdc();
		objUserMenu.click("usermenu");
		userMenuElementsValidate();
		objUserMenu.click("myProfile");
		Thread.sleep(2000);
		System.out.println("userprofileName = " + props.getProperty("userprofileName") + "--");
		boolean b = objUserMenu.validateUserProfilePage(props.getProperty("userprofileName"));
		Assert.assertTrue(b==true, "Profile page is not displayed");
		logger.log(LogStatus.INFO, "User Profile page is displayed");
		objUserMenu.click("editProfile");
		SwitchFrame("contactInfoContentId");
		objUserMenu.click("about");
		objUserMenu.enterTextlastname(props.getProperty("userLastName"));
		objUserMenu.click("saveBtn");
		Thread.sleep(2000);
		boolean result = objUserMenu.validateUserProfilePage(props.getProperty("userUpdateProfileName"));
		Assert.assertTrue(result ==true, "Profile page is not displayed");
		logger.log(LogStatus.INFO, " updated User Profile page is displayed");
		objUserMenu.click("postLink");
		objUserMenu.switchPostBodyFrame();
		objUserMenu.enterTextPost(props.getProperty("postBodyText"));
		SwtitchFrame();
		objUserMenu.click("shareBtn");
		objUserMenu.validatepostBodyText(props.getProperty("postBodyText"), logger);
		objUserMenu.click("fileLink");
		objUserMenu.click("uploadFile");
		objUserMenu.chooseFile("/Users/sayanna/Downloads/Exam1.docx");
		objUserMenu.click("shareBtn");
		objUserMenu.validateuploadFile("Exam1 (1)", logger);
		logger.log(LogStatus.PASS, "testcase is pass");
		
		
		
		Thread.sleep(5000);
		
		

		
		}
	@AfterTest
		public void Close() {
		driver.quit();
		report.flush();
	}

}
