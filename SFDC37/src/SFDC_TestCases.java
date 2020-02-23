
//import java.util.List;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;

import com.relevantcodes.extentreports.LogStatus;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

public class SFDC_TestCases extends ReusableMethods {

	public static void main(String[] args) throws InterruptedException, AWTException {
		InitializeDriver();
		CreateReport();

		// TC1_LoginErrorMessage();
		// TC2_LoginToSalesForce();
		// testCookies();
//		TC3_CheckRememberMe();
		// Forgotpasword_A();
//		 Forgotpassword_B();
		// TC_05();
		// TC_06();
		// TC_07();
		// TC_08();
		// TC_09();
		// TC_10();
		// TC_11CreateNewView();
		// TC_12EditView();
		// TC_13MergeAccounts();
		// TC_14();
		// TC_15();
		// TC_16();
		// TC_17();
		// TC_18();
		// TC_19();
		// TC_20LeadTab();
		// TC_21LeadsSelectView();
		// TC_22DefaultView();
		// TC_23();
		// TC_24();
		// TC_25();
		// TC_26();
		// TC_27();
		// TC_28();
		// TC_29();
		// TC_30();
		// TC_31();
		// TC_32();
		// TC_33();
		// TC_34();
		 // TC_35();
		 TC_37();
		CloseBrowser();
		CloseReport();

	}

	public static void TC1_LoginErrorMessage() throws InterruptedException {
		// CreateReport();
		logger = report.startTest("TC1_LoginErrorMessage");
		OpenUrl("https://login.salesforce.com/");
		logger.log(LogStatus.INFO, "URL opened sucessfully");
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
		//Assert.assertEquals(errormessage,msg);
		if (msg.equals(errormessage)) {
			logger.log(LogStatus.INFO, "Error message displayed");
			// System.out.println(" error message displayed");
		} else {
			logger.log(LogStatus.INFO, "Error message not displayed");
			// System.out.println(" error msg not displayed");
		}
	}

	public static void TC2_LoginToSalesForce() throws InterruptedException {
		// CreateReport();
		logger = report.startTest("TC2_LoginToSalesForce");
		// logger = report.startTest("TC2_LoginToSalesForce");
		OpenUrl("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		logger.log(LogStatus.INFO, "URL opened successfully");
		WebElement Uname = driver.findElement(By.id("username"));
		EnterText(Uname, "himabindu@sbn.com", "username");
		WebElement pwd = driver.findElement(By.id("password"));
		EnterText(pwd, "nishu123@123", "password");
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		Click(loginBtn, "loginbutton");
		Thread.sleep(2000);
		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		String actualTitle = driver.getTitle();
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			logger.log(LogStatus.PASS, "User is on home page");
			// System.out.println("User is on home page");
		} else {
			logger.log(LogStatus.FAIL, "home page is not Lunched");
			// System.out.println("home page is not Lunched");
		}

	}

	public static void TC3_CheckRememberMe() throws InterruptedException {
		// CreateReport();
		logger = report.startTest("TC3_CheckRememberMe()");
		OpenUrl("https://login.salesforce.com/");
		logger.log(LogStatus.INFO, "URL opened successfully");
		WebElement Uname = driver.findElement(By.id("username"));
		EnterText(Uname, "himabindu@sbn.com", "username");
		WebElement pwd = driver.findElement(By.id("password"));
		EnterText(pwd, "nishu123@123", "password");

		WebElement Checkbox = driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/label"));
		Click(Checkbox, "Checkbox");
		logger.log(LogStatus.INFO, "Remembercheck box checked");
		Thread.sleep(3000);
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		Click(loginBtn, "loginbutton");
		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		String actualTitle = driver.getTitle();
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			logger.log(LogStatus.PASS, "User is on home page");
			// System.out.println("User is on home page");
		} else {
			logger.log(LogStatus.FAIL, "home page is not Lunched");
			// System.out.println("home page is not Lunched");
		}
		Thread.sleep(2000);
	}

	public static void Forgotpasword_A() throws InterruptedException {
		// CreateReport();
		logger = report.startTest("TC_ForgotPassword_A");
		OpenUrl("https://login.salesforce.com/");

		WebElement forgot_pwd = driver.findElement(By.xpath("//*[@id=\"forgot_password_link\"]"));
		Click(forgot_pwd, "forgot_pwd");
		logger.log(LogStatus.PASS, "forgotpassword checked");
		Thread.sleep(2000);
		WebElement Uname = driver.findElement(By.xpath("//*[@id=\"un\"]"));
		EnterText(Uname, "himabindu@sbn.com", "username");
		WebElement ContinueBtn = driver.findElement(By.xpath("//*[@id=\"continue\"]"));
		Click(ContinueBtn, "continue");
		Thread.sleep(2000);

	}

	public static void Forgotpassword_B() throws InterruptedException {
		// CreateReport();
		logger = report.startTest("TC_ForgotPassword");
		OpenUrl("https://login.salesforce.com/");
		WebElement Uname = driver.findElement(By.id("username"));
		EnterText(Uname, "abc@dfg", "username");
		logger.log(LogStatus.PASS, "wrong user name entered");
		WebElement pwd = driver.findElement(By.id("password"));
		EnterText(pwd, "123", "password");
		logger.log(LogStatus.PASS, "wrong password entered");
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		Click(loginBtn, "loginbutton");
		Thread.sleep(2000);

	}

	public static void TC_05() throws InterruptedException {
		// TC2_LoginToSalesForce();
		// CreateReport();
		logger = report.startTest("TC5");
		TC2_LoginToSalesForce();
		UserMenu();
		WebElement usermenuBtn = driver.findElement(By.xpath("//*[@id=\"userNavButton\"]"));

		Select sel = new Select(usermenuBtn);
		List<WebElement> userMenuList = sel.getOptions();
		for (WebElement e : userMenuList) {
			System.out.println(e.getText());
		}
		logger.log(LogStatus.INFO, "usermenu options displayed");
		Thread.sleep(2000);
	}

	public static void TC_06() throws InterruptedException {

		TC2_LoginToSalesForce();

		// CreateReport();
		logger = report.startTest("TC6");
		UserMenu();
		Thread.sleep(2000);
		WebElement myprofileBtn = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[1]"));
		Click(myprofileBtn, "myprofile ");
		System.out.println(" user is on my profile");
		WebElement editprofile = driver
				.findElement(By.xpath("//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a/img"));
		Click(editprofile, "Edit ");
		Thread.sleep(2000);

//			WebElement editProfilePopUp = driver.findElement(By.xpath("//div[@id='contactInfo']"));
//			String myWindowHandle = driver.getWindowHandle();
//			driver.switchTo().window(myWindowHandle);

		WebElement AboutTab = driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		Click(AboutTab, "AboutTab ");

		Thread.sleep(2000);
	}

	public static void TC_07() throws InterruptedException {

		TC2_LoginToSalesForce();
//			CreateReport();
		logger = report.startTest("TC7");

		UserMenu();
		Thread.sleep(2000);
		WebElement mySettings = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[2]"));
		Click(mySettings, "MySettings");
		WebElement Personal = driver.findElement(By.xpath("//*[@id=\"PersonalInfo\"]/a"));
		Click(Personal, "Personal");
		Thread.sleep(2000);
		WebElement logoutHistory = driver.findElement(By.id("LoginHistory_font"));
		Click(logoutHistory, "LogoutHistory");
		Thread.sleep(2000);
		WebElement display = driver.findElement(By.id("DisplayAndLayout_font"));
		Click(display, "display");
		WebElement customize = driver.findElement(By.xpath("//*[@id=\"CustomizeTabs_font\"]"));
		Click(customize, "customize");
		Thread.sleep(3000);
		WebElement customApp = driver.findElement(By.xpath("//*[@id=\"p4\"]"));
		Select element = new Select(customApp);
		element.selectByVisibleText("Salesforce Chatter");
		Thread.sleep(2000);
		WebElement availableTabs = driver.findElement(By.xpath("//*[@id=\"duel_select_0\"]"));
		Select sel = new Select(availableTabs);
		sel.selectByVisibleText("Reports");
		WebElement add = driver.findElement(By.xpath("//*[@id=\"duel_select_0_right\"]/img"));
		Click(add, "Add");
		Thread.sleep(2000);
//			WebElement save = driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
//			Click(save,"save");
		Thread.sleep(2000);
		logger.log(LogStatus.INFO, "Report field is added and displayed on saleforce charted page");
		WebElement Email = driver.findElement(By.xpath("//*[@id=\"EmailSetup\"]/a"));
		Click(Email, "Email");
		Thread.sleep(2000);
		WebElement EmailSettings = driver.findElement(By.xpath("//*[@id=\"EmailSettings_font\"]"));
		Click(EmailSettings, "EmailSettings");
		Thread.sleep(2000);
		WebElement emailName = driver.findElement(By.id("sender_name"));
		EnterText(emailName, "Salesforce", "EmailName");
		WebElement emailAddress = driver.findElement(By.id("sender_name"));
		EnterText(emailAddress, "Salesforce@123.com", " emailAddress");
		WebElement automatic = driver.findElement(By.id("auto_bcc1"));
		Click(automatic, "automatic");
		Thread.sleep(2000);
		WebElement save2 = driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
		Click(save2, " save2");
		Thread.sleep(2000);
		logger.log(LogStatus.INFO, "Given details are saved as default emailoptions and mysetting page is displayed  ");
		WebElement CalenderReminders = driver.findElement(By.id("CalendarAndReminders_font"));
		Click(CalenderReminders, " Calender&Reminders");
		Thread.sleep(2000);
		WebElement ActivityReminder = driver.findElement(By.id("Reminders_font"));
		Click(ActivityReminder, " ActivityReminder");
		Thread.sleep(2000);
		WebElement OpenTestReminder = driver.findElement(By.xpath("//*[@id=\"testbtn\"]"));
		Click(OpenTestReminder, " OpenTestReminder");
		Thread.sleep(2000);
		logger.log(LogStatus.INFO, "pop up window displayed");
	}

	public static void TC_08() throws InterruptedException {
		TC2_LoginToSalesForce();
//			CreateReport();
		logger = report.startTest("TC8");
		UserMenu();
		Thread.sleep(2000);
		WebElement devConsole = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[3]"));
		Click(devConsole, "DevloperConsole");
		logger.log(LogStatus.INFO, "devloper console window displayed");
		String oldwindow = driver.getWindowHandle();
		Set<String> getAllWindows = driver.getWindowHandles();
		String[] getWindow = getAllWindows.toArray(new String[getAllWindows.size()]);
		// System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(getWindow[1]);
		System.out.println(driver.getCurrentUrl());
		driver.get("https://na174.salesforce.com/setup/forcecomHomepage.apexp?setupid=ForceCom");
		driver.manage().window().maximize();

		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(oldwindow);

		driver.close();
		logger.log(LogStatus.INFO, "The DeveloperConsole window is closed");
		Thread.sleep(3000);
	}

	public static void TC_09() throws InterruptedException {
		TC2_LoginToSalesForce();
		UserMenu();
		logger = report.startTest("TC9");
		logger.log(LogStatus.INFO, "usermenu displayed with all options");
		Thread.sleep(2000);
		WebElement logOutBtn = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
		Click(logOutBtn, "logout");
		logger.log(LogStatus.INFO, "the page is log out and salesforce login page displayed");
		Thread.sleep(3000);

	}

	public static void TC_10() throws InterruptedException, AWTException {
		TC2_LoginToSalesForce();
		logger = report.startTest("TC_10");
		Thread.sleep(2000);
		WebElement addTabs = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		Click(addTabs, "AddTab");
		Thread.sleep(2000);
		WebElement Accounts = driver.findElement(By.xpath("//a[@class='listRelatedObject accountBlock title']"));
		Accounts.click();
		Thread.sleep(2000);
		WebElement newBtn = driver.findElement(By.xpath("//input[@name='new']"));
		Click(newBtn, "New");
		Thread.sleep(3000);
		WebElement accntName = driver.findElement(By.id("acc2"));
		EnterText(accntName, "tecArch", "Accountname");
		Thread.sleep(2000);
		WebElement typeDropDown = driver.findElement(By.xpath("//select[contains(@name,'acc6')]"));
		Select sel = new Select(typeDropDown);
		sel.selectByVisibleText("Technology Partner");
		WebElement cstmrPriority = driver.findElement(By.id("00N6g00000MR0ue"));
		Select sel1 = new Select(cstmrPriority);
		sel1.selectByVisibleText("High");
		WebElement save = driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
		Click(save, "Save");
		Thread.sleep(5000);
		String actualstrng = driver.findElement(By.xpath("//h2[@class='topName']")).getText();
		String str = "tecArch";
		if (actualstrng.equals(str)) {
			logger.log(LogStatus.PASS, "New account page is dispalyed");
		} else {
			logger.log(LogStatus.FAIL, "NewAccount page is not displayed");
		}

		driver.close();
	}

	public static void TC_11CreateNewView() throws InterruptedException {
		TC2_LoginToSalesForce();
		logger = report.startTest("TC_11CreateNewView");
		WebElement addTabs = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		Click(addTabs, "AddTab");
		Thread.sleep(2000);
		WebElement Accounts = driver.findElement(By.xpath("//a[@class='listRelatedObject accountBlock title']"));
		Accounts.click();
		logger.log(LogStatus.INFO, "Accounts home page is dispalyed with username");
		WebElement createNewViewBtn = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		createNewViewBtn.click();
		WebElement viewName = driver.findElement(By.id("fname"));
		EnterText(viewName, "latest", "viewname");
		WebElement viewUniqueName = driver.findElement(By.id("fname"));
		EnterText(viewUniqueName, "latest1", "viewUniqueName");
		WebElement saveBtn = driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[3]/table/tbody/tr/td[2]/input[1]"));
		Click(saveBtn, "Save");
		WebElement viewlist = driver.findElement(By.xpath("//select[@name='fcf']"));
		Select viewelement = new Select(viewlist);
		List<WebElement> listOfViews = viewelement.getOptions();
		for (WebElement e : listOfViews) {
			if (e.getText().contains("latest")) {
				logger.log(LogStatus.PASS, "Newly added View displayed");
			}
		}
		logger.log(LogStatus.INFO, "New page displayed with ");

		Thread.sleep(2000);
	}

	public static void TC_12EditView() throws InterruptedException {
		TC2_LoginToSalesForce();
		logger = report.startTest("TC_112EditView");
		WebElement addTabs = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		Click(addTabs, "AddTab");
		Thread.sleep(2000);
		WebElement Accounts = driver.findElement(By.xpath("//a[@class='listRelatedObject accountBlock title']"));
		Accounts.click();
		logger.log(LogStatus.INFO, "Accounts home page is dispalyed with username");
		WebElement viewmenu = driver.findElement(By.xpath("//select[@id='fcf']"));
		Select sel = new Select(viewmenu);
		sel.selectByVisibleText("My Accounts");
		// logger.log(LogStatus.INFO,"view selected");
		WebElement editBtn = driver.findElement(By.xpath("//span[@class='fFooter']//a[contains(text(),'Edit')]"));
		Click(editBtn, "Edit");
		Thread.sleep(2000);
		WebElement viewName = driver.findElement(By.xpath("//input[@id='fname']"));
		EnterText(viewName, "mostvisited", "viewname");
		WebElement viewUniqueName = driver.findElement(By.xpath("//input[@id='devname']"));
		EnterText(viewUniqueName, "mostvisited", "viewUniqueName");

		WebElement field = driver.findElement(By.xpath("//*[@id=\"fcol1\"]"));
		Select sel2 = new Select(field);
		sel2.selectByVisibleText("Account Name");
		Select sel3 = new Select(driver.findElement(By.id("fop1")));
		sel3.selectByVisibleText("contains");
		WebElement value = driver.findElement(By.id("fval1"));
		EnterText(value, "a", "Value");
		WebElement saveBtn = driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[3]/table/tbody/tr/td[2]/input[1]"));
		Click(saveBtn, "save");
		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		String actualTitle = driver.getTitle();
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			logger.log(LogStatus.PASS, "User is on home page");
			// System.out.println("User is on home page");
		} else {
			logger.log(LogStatus.FAIL, "home page is not Lunched");
			// System.out.println("home page is not Lunched");
		}
		Thread.sleep(2000);
	}

	public static void TC_13MergeAccounts() throws InterruptedException {
		TC2_LoginToSalesForce();
		logger = report.startTest("TC_13MergeAccounts");
		WebElement addTabs = driver.findElement(By.id("AllTab_Tab"));
		Click(addTabs, "AddTab");
		Thread.sleep(2000);
		WebElement Accounts = driver
				.findElement(By.xpath("//*[@id=\"bodyCell\"]/div[3]/div[2]/table/tbody/tr[1]/td[1]/a"));
		Accounts.click();
		WebElement tools = driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[2]/div/div/h3"));
		Click(tools, "Tools");
		Thread.sleep(2000);
		WebElement mergeAccnts = driver
				.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[2]/div/div/div/ul/li[4]/span/a"));
		Click(mergeAccnts, "MergeAccounts");
		WebElement textBox = driver.findElement(By.id("srch"));
		EnterText(textBox, "tecArch", "TextBox");
		WebElement find = driver.findElement(By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[4]/input[2]"));
		Click(find, "FindAccounts");
		// String str = driver.findElement(By.xpath("//div[@class='bPageBlock
		// brandSecondaryBrd secondaryPalette']//div[@class='pbBody']")).getText();
//			WebElement element = driver.findElement(By.xpath("//table[@class='list']"));
//			
//			//Select selElement = new Select(element);
//			List<WebElement> list =
//			for ( WebElement e : list) {
//				if( textBox.getText().equals(e.getText())) {
//					logger.log(LogStatus.INFO, "The given account name is present in list");
//					System.out.println("The given account name is present in list");
//				}
//				else {
//					logger.log(LogStatus.INFO, "The given account name is not  present in list");
//				}
//			}
		Thread.sleep(2000);

	}

	public static void TC_14() throws InterruptedException {
		TC2_LoginToSalesForce();
		logger = report.startTest("TC_14");
		WebElement addTabs = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		Click(addTabs, "AddTab");
		Thread.sleep(2000);
		WebElement Accounts = driver.findElement(By.xpath("//a[@class='listRelatedObject accountBlock title']"));
		Accounts.click();
		logger.log(LogStatus.INFO, "Accounts home page is dispalyed with username");
		WebElement activity = driver
				.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]"));
		Click(activity, "accountactivity<30days");
		Thread.sleep(2000);
		WebElement DateField = driver.findElement(By.xpath("//input[@id='ext-gen20']"));
		DateField.click();
		WebElement CreatedDate = driver.findElement(By.xpath("//div[contains(text(),'Created Date')]"));
		CreatedDate.click();
//			Select sel = new Select(DateField);
//			sel.selectByVisibleText("Created Date");
		WebElement todaysDateFrom = driver.findElement(By.xpath("//img[@id='ext-gen152']"));
		Click(todaysDateFrom, "From");
		WebElement todayDate = driver.findElement(By.xpath("//button[contains(text(),'Today')]"));
		todayDate.click();
		Thread.sleep(2000);
		WebElement to = driver.findElement(By.xpath("//img[@id='ext-gen154']"));
		to.click();
		Thread.sleep(2000);
		WebElement todayFromTo = driver.findElement(By.xpath("//div[20]//tr[3]//button[1]"));
		todayFromTo.click();
		WebElement saveBtn = driver.findElement(By.xpath("//*[@id=\"ext-gen49\"]']"));
		saveBtn.click();
		Thread.sleep(2000);
//			 Alert alert = driver.switchTo().alert();
//			
//			 alert.sendKeys("");
//			
	}

	public static void TC_15() throws InterruptedException {
		TC2_LoginToSalesForce();
		logger = report.startTest("TC_15");
		WebElement addTabs = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		Click(addTabs, "AddTab");
		Thread.sleep(2000);
		// WebElement opportunities =
		// driver.findElement(By.xpath("//a[@class='listRelatedObject opportunityBlock
		// title']"));
		WebElement opportunities = driver
				.findElement(By.xpath("//a[@class='listRelatedObject opportunityBlock title']"));
		Click(opportunities, "opportunities");
		WebElement homeOpprt = driver.findElement(By.id("fcf"));
		if ((homeOpprt == null) || (!homeOpprt.isDisplayed())) {
			logger.log(LogStatus.ERROR, "opportunities dropdown not displayed");
		} else {
			logger.log(LogStatus.PASS, "opportunities dropdown displayed");
		}
		Select dropDownElements = new Select(homeOpprt);
		List<WebElement> listofElements = dropDownElements.getOptions();
		for (WebElement e : listofElements) {
			System.out.println(e.getText());
		}
		logger.log(LogStatus.INFO, "all options are displayed");
		Thread.sleep(3000);
		driver.close();
	}

	public static void TC_16() throws InterruptedException {
		TC2_LoginToSalesForce();
		logger = report.startTest("TC_16");
		WebElement addTabs = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		Click(addTabs, "AddTab");
		Thread.sleep(2000);
		WebElement opportunities = driver
				.findElement(By.xpath("//a[@class='listRelatedObject opportunityBlock title']"));
		Click(opportunities, "opportunities");
		Thread.sleep(3000);

		logger.log(LogStatus.INFO, "Opportunities Home page displayed");
		WebElement newBtn = driver.findElement(By.xpath("//input[@name='new']"));
		Click(newBtn, "New");
		Thread.sleep(2000);
		System.out.println("NEW BUTTON CLICKED");
		WebElement opportunityName = driver.findElement(By.xpath("//input[@name='opp3']"));
		EnterText(opportunityName, "tecArch2020", "opportunityName");
		WebElement accName = driver.findElement(By.xpath("//input[@name='opp4']"));
		EnterText(accName, "tecArch", "AccountName");
		WebElement closeDate = driver.findElement(By.xpath("//input[@name='opp9']"));
		EnterText(closeDate, "2/19/2020", "closeDate");
		// Click(closeDate,"closeDate");
		WebElement stage = driver.findElement(By.xpath("//select[@name='opp11']"));
		Select sel = new Select(stage);
		sel.selectByVisibleText("Closed Won");
		List<WebElement> list = sel.getOptions();
		for (WebElement e : list) {
			System.out.println(e.getText());
		}
//			WebElement probability = driver.findElement(By.xpath("//input[@name='opp12']"));
//			EnterText( probability, "60", " probability");
		WebElement lead = driver.findElement(By.xpath("//select[@name='opp6']"));
		Select leadElement = new Select(lead);
		leadElement.selectByVisibleText("Web");
		WebElement primaryCampaign = driver.findElement(By.xpath("//input[@name='opp17']"));
		EnterText(primaryCampaign, "marketing", " primaryCampaign");
		WebElement save = driver.findElement(By.xpath("//td[@class='pbButtonb']//input[@name='save']"));
		Click(save, "save");
		String str = driver.findElement(By.xpath("//h2[@class='pageDescription']")).getText();

		if (str.contains("tecArch2020")) {
			logger.log(LogStatus.PASS, "New opportunities page displayed with opportunity details");
		} else {
			logger.log(LogStatus.FAIL, "New opportunities page not displayed with opportunity details");
		}

		driver.close();

	}

	public static void TC_17() throws InterruptedException {
		TC2_LoginToSalesForce();
		logger = report.startTest("TC_17");
		WebElement addTabs = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		Click(addTabs, "AddTab");
		Thread.sleep(2000);
		WebElement opportunities = driver
				.findElement(By.xpath("//a[@class='listRelatedObject opportunityBlock title']"));
		Click(opportunities, "opportunities");
		Thread.sleep(3000);
		logger.log(LogStatus.INFO, "Opportunities home page dispalyed");
		WebElement optyPipeline = driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]"));
		Click(optyPipeline, "optyPipeline");
		Thread.sleep(2000);
		String str = driver.findElement(By.xpath("//h1[@class='noSecondHeader pageType']")).getText();
		if (str.contains("Opportunity Pipeline")) {
			logger.log(LogStatus.PASS, "Report page with the Opportunities that are pipelined will be displayed");
		} else {
			logger.log(LogStatus.FAIL, "Report page with the Opportunities that are pipelined not displayed");
		}
		driver.close();
	}

	public static void TC_18() throws InterruptedException {
		TC2_LoginToSalesForce();
		logger = report.startTest("TC_18");
		WebElement addTabs = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		Click(addTabs, "AddTab");
		Thread.sleep(2000);
		WebElement opportunities = driver
				.findElement(By.xpath("//a[@class='listRelatedObject opportunityBlock title']"));
		Click(opportunities, "opportunities");
		Thread.sleep(3000);
		logger.log(LogStatus.INFO, "Opportunities home page dispalyed");
		WebElement stuckOpty = driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]"));
		Click(stuckOpty, "StuckOpportunities");
		Thread.sleep(2000);
		String str = driver.findElement(By.xpath("//h1[@class='noSecondHeader pageType']")).getText();
		if (str.contains("Stuck Opportunities")) {
			logger.log(LogStatus.PASS, "Report page with the Opportunities that are stuck will be displayed");
		} else {
			logger.log(LogStatus.FAIL, "Report page with the Opportunities that are stuck not displayed");
		}
		driver.close();
	}

	public static void TC_19() throws InterruptedException {
		TC2_LoginToSalesForce();
		logger = report.startTest("TC_19");
		WebElement addTabs = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		Click(addTabs, "AddTab");
		Thread.sleep(2000);
		WebElement opportunities = driver
				.findElement(By.xpath("//a[@class='listRelatedObject opportunityBlock title']"));
		Click(opportunities, "opportunities");
		Thread.sleep(3000);
		WebElement QtrSummeryInterval = driver.findElement(By.xpath("//select[@id='quarter_q']"));
		Select listOfIntervals = new Select(QtrSummeryInterval);
		List<WebElement> DropDownList = listOfIntervals.getOptions();
//			String[] array = {"Current FQ","Next FQ","Previous FQ","Current and Next 3 FQ","Current FY","Current and Next FY","Current and Previous FY","Previous FY","Next Fy"};
//			for(int i =0;i<DropDownList.size();i++) {
//				
//			}
//			
		for (WebElement e : DropDownList) {
			System.out.println(e.getText());
		}
	}

	public static void TC_20LeadTab() throws InterruptedException {
		TC2_LoginToSalesForce();
		logger = report.startTest("TC_20LeadTab");
		WebElement addTabs = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		Click(addTabs, "AddTab");
		Thread.sleep(2000);
		WebElement Lead = driver.findElement(By.xpath("//a[@class='listRelatedObject leadBlock title']"));
		Click(Lead, " Lead");
		Thread.sleep(2000);
		String actualTitle = driver.findElement(By.xpath("//h1[@class='pageType']")).getText();
		if (actualTitle.contains("Leads")) {
			logger.log(LogStatus.PASS, "Leads home page displayed");
		} else {
			logger.log(LogStatus.PASS, "Leads home page not  displayed");
		}
	}

	public static void TC_21LeadsSelectView() throws InterruptedException {
		TC2_LoginToSalesForce();
		logger = report.startTest("TC_21LeadsSelectView");
		WebElement addTabs = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		Click(addTabs, "AddTab");
		Thread.sleep(2000);
		WebElement Lead = driver.findElement(By.xpath("//a[@class='listRelatedObject leadBlock title']"));
		Click(Lead, " Lead");
		Thread.sleep(2000);
		WebElement LeadList = driver.findElement(By.xpath("//select[@id='fcf']"));
		Select DropDownList = new Select(LeadList);
		List<WebElement> DDList = DropDownList.getOptions();
//			String str = "My Unread Leads,Recently Viewed, Leads,Today's Lead";
//			ArrayList<String>strList = new ArrayList<>();
		for (WebElement e : DDList) {
			System.out.println(e.getText());
		}
		logger.log(LogStatus.INFO, "Leads list dropdown displayed");

	}

	public static void TC_22DefaultView() throws InterruptedException {
		TC2_LoginToSalesForce();
		logger = report.startTest("TC_22DefaultView");
		WebElement addTabs = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		Click(addTabs, "AddTab");
		Thread.sleep(2000);
		WebElement Lead = driver.findElement(By.xpath("//a[@class='listRelatedObject leadBlock title']"));
		Click(Lead, " Lead");
		Thread.sleep(2000);
		WebElement LeadList = driver.findElement(By.xpath("//select[@id='fcf']"));
		Select DropDownList = new Select(LeadList);
		DropDownList.selectByVisibleText("Today's Leads");
		UserMenu();
		WebElement LogOut = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		Click(LogOut, "LogOut");
		logger.log(LogStatus.INFO, "logged out");
		login();
		WebElement addTabs1 = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		Click(addTabs1, "AddTab");
		Thread.sleep(2000);
		WebElement Lead1 = driver.findElement(By.xpath("//a[@class='listRelatedObject leadBlock title']"));
		Click(Lead1, " Lead");
		Thread.sleep(2000);
		WebElement GoBtn = driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']"));
		Click(GoBtn, "GoBtn");
		// WebElement LeadList1 = driver.findElement(By.xpath("//select[@id='fcf']"));
//			
		Select DropDownList1 = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));

		String str = DropDownList1.getFirstSelectedOption().getText();
		Thread.sleep(2000);
		if (str.equals("Today's Leads")) {
			logger.log(LogStatus.INFO, "The lead view displayed with the selcted view from last session");
		} else {
			logger.log(LogStatus.INFO, "The lead view didnot display selcted view from last session");
		}
		String LeadUrl = "https://na174.salesforce.com/00Q?fcf=00B6g00000B5JV2";

		if (driver.getCurrentUrl().equalsIgnoreCase(LeadUrl)) {
			logger.log(LogStatus.PASS, "Todays Lead page is displayed");
			System.out.println("Todays Lead page is displayed");
		} else {
			logger.log(LogStatus.PASS, "Todays Lead page is not displayed");
			System.out.println("Todays Lead page is not displayed");
		}

		Thread.sleep(2000);

	}

	public static void TC_23() throws InterruptedException {
		logger = report.startTest("TC_23");
		login();
		WebElement addTabs = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		Click(addTabs, "AddTab");
		Thread.sleep(2000);
		WebElement Lead = driver.findElement(By.xpath("//a[@class='listRelatedObject leadBlock title']"));
		Click(Lead, " Lead");
		WebElement LeadList = driver.findElement(By.xpath("//select[@id='fcf']"));
		Select DropDownList = new Select(LeadList);
		DropDownList.selectByVisibleText("Today's Leads");
		WebElement GoBtn = driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']"));
		Click(GoBtn, "GoBtn");
		String LeadUrl = "https://na174.salesforce.com/00Q?fcf=00B6g00000B5JV2";

		if (driver.getCurrentUrl().equalsIgnoreCase(LeadUrl)) {
			logger.log(LogStatus.PASS, "Todays Lead page is displayed");
			System.out.println("Todays Lead page is displayed");
		} else {
			logger.log(LogStatus.PASS, "Todays Lead page is not displayed");
			System.out.println("Todays Lead page is not displayed");
		}
		Thread.sleep(2000);
	}

	public static void TC_24() throws InterruptedException {
		logger = report.startTest("TC_24");
		login();
		WebElement addTabs = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		Click(addTabs, "AddTab");
		Thread.sleep(2000);
		WebElement Lead = driver.findElement(By.xpath("//a[@class='listRelatedObject leadBlock title']"));
		Click(Lead, " Lead");
		WebElement newBtn = driver.findElement(By.xpath("//input[@name='new']"));
		Click(newBtn, "New");
		Thread.sleep(2000);
		WebElement lastName = driver.findElement(By.xpath("//input[@id='name_lastlea2']"));
		EnterText(lastName, "ABCD", "lastname");
		WebElement companyName = driver.findElement(By.xpath("//input[@id='lea3']"));
		EnterText(companyName, "ABCD", "companyName");
		WebElement save = driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save']"));
		Click(save, "save");
		String str = "https://na174.salesforce.com/00Q/e?retURL=%2F00Q%2Fo";
		if (driver.getCurrentUrl().equalsIgnoreCase(str)) {
			logger.log(LogStatus.PASS, "Created Lead view page opened");
		} else {
			logger.log(LogStatus.PASS, "Created Lead view page not opened");
		}
		Thread.sleep(2000);

	}

	public static void TC_25() throws InterruptedException {
		logger = report.startTest("TC_24");
		login();
		WebElement addTabs = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		Click(addTabs, "AddTab");
		Thread.sleep(2000);
		WebElement contacts = driver.findElement(By.xpath("//a[@class='listRelatedObject contactBlock title']"));
		Click(contacts, "contacts");
		Thread.sleep(2000);
		logger.log(LogStatus.INFO, "Contact home page displayed");
		WebElement newBtn = driver.findElement(By.xpath("//input[@name='new']"));
		Click(newBtn, "New");
		WebElement lastname = driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
		EnterText(lastname, "macheal", "lastname");
		WebElement AccountName = driver.findElement(By.xpath("//input[@id='con4']"));
		EnterText(AccountName, "Foster123", " AccountName");
		WebElement searchImage = driver.findElement(By.xpath("//a[@id='con4_lkwgt']//img[@class='lookupIcon']"));
		Click(searchImage, "searchImage");
		String oldwindow = driver.getWindowHandle();
		Set<String> getAllWindows = driver.getWindowHandles();
		String[] getWindow = getAllWindows.toArray(new String[getAllWindows.size()]);
		// System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(getWindow[1]);
		System.out.println(driver.getCurrentUrl());
		driver.get("https://na174.salesforce.com/_ui/common/data/LookupPage?lkfm=editPage&lknm=con4&lktp=001&lksrch");
		driver.manage().window().maximize();

		WebElement searchtext = driver.findElement(By.xpath("//input[@id='lksrch']"));
		EnterText(searchtext, "Foster123", " searchtext");

		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(oldwindow);

	}

	public static void TC_26() throws InterruptedException {
		logger = report.startTest("TC_26");
		login();
		WebElement addTabs = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		Click(addTabs, "AddTab");
		Thread.sleep(2000);
		WebElement contacts = driver.findElement(By.xpath("//a[@class='listRelatedObject contactBlock title']"));
		Click(contacts, "contacts");
		Thread.sleep(2000);
		WebElement newView = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		Click(newView, " CreateNewView");
		logger.log(LogStatus.INFO, "New view page displayed");
		WebElement viewName = driver.findElement(By.xpath("//input[@id='fname']"));
		EnterText(viewName, "visual3456", "viewName");
		WebElement viewUniqueName = driver.findElement(By.xpath("//input[@id='devname']"));
		Click(viewUniqueName, " viewUniqueName");
//			EnterText( viewUniqueName, "moderen", " viewUniqueName") ;
		WebElement saveBtn = driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[1]"));
		Click(saveBtn, "saveBtn");
		Thread.sleep(10000);
		String actualTitle = "Contacts ~ Salesforce - Developer Edition";
		String expectedTitle = driver.getTitle();
		WebElement Dropdown = driver.findElement(By.xpath("//select[@name='fcf']"));
		String str = Dropdown.getText();
		System.out.println(str);
		// Select sel = new Select(Dropdown);

		if (actualTitle.equalsIgnoreCase(expectedTitle) && (str.contains("visualArts"))) {

			logger.log(LogStatus.PASS, "Contacts home page displayed");
			System.out.println("pass");
		} else {
			logger.log(LogStatus.PASS, "My Contacts page not displayed");
		}

	}

	public static void TC_27() throws InterruptedException {
		logger = report.startTest("TC_24");
		login();
		WebElement addTabs = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		Click(addTabs, "AddTab");
		Thread.sleep(2000);
		WebElement contacts = driver.findElement(By.xpath("//a[@class='listRelatedObject contactBlock title']"));
		Click(contacts, "contacts");
		WebElement recent = driver.findElement(By.xpath("//select[@name='hotlist_mode']"));
		Select RecentDropDown = new Select(recent);

		RecentDropDown.selectByVisibleText("Recently Created");
		String actualTitle = "Contacts: Home ~ Salesforce - Developer Edition";
		String expectedTitle = driver.getTitle();
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {

			logger.log(LogStatus.PASS, "Recently created contacts list displayed");
		} else {
			logger.log(LogStatus.FAIL, "Recently created contacts list not displayed");
		}
		Thread.sleep(2000);

	}

	public static void TC_28() throws InterruptedException {
		logger = report.startTest("TC_28");
		login();
		WebElement addTabs = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		Click(addTabs, "AddTab");
		Thread.sleep(2000);
		WebElement contacts = driver.findElement(By.xpath("//a[@class='listRelatedObject contactBlock title']"));
		Click(contacts, "contacts");
		Thread.sleep(2000);
		WebElement recently = driver.findElement(By.xpath("//select[@name='fcf']"));
		Select mycontactList = new Select(recently);
		mycontactList.selectByVisibleText("My Contacts");
		String actualTitle = "Contacts: Home ~ Salesforce - Developer Edition";
		String expectedTitle = driver.getTitle();
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {

			logger.log(LogStatus.PASS, "My Contacts page displayed");
		} else {
			logger.log(LogStatus.PASS, "My Contacts page not displayed");
		}
	}

	public static void TC_29() throws InterruptedException {
		logger = report.startTest("TC_29");
		login();
		WebElement addTabs = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		Click(addTabs, "AddTab");
		Thread.sleep(2000);
		WebElement contacts = driver.findElement(By.xpath("//a[@class='listRelatedObject contactBlock title']"));
		Click(contacts, "contacts");
		Thread.sleep(2000);
		WebElement table = driver.findElement(By.xpath("//div[@class='pbBody']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (int i = 0; i < rows.size(); i++) {
			List<WebElement> tableheader = rows.get(i).findElements(By.tagName("th"));

		}

	}

	public static void TC_30() throws InterruptedException {
		logger = report.startTest("TC_30");
		login();
		WebElement addTabs = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		Click(addTabs, "AddTab");
		Thread.sleep(2000);
		WebElement contacts = driver.findElement(By.xpath("//a[@class='listRelatedObject contactBlock title']"));
		Click(contacts, "contacts");
		Thread.sleep(2000);
		logger.log(LogStatus.INFO, "Contacts page is opened");
		WebElement createNewView = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		Click(createNewView, "createNewView ");
		Thread.sleep(2000);
		WebElement ViewUniqueName = driver.findElement(By.id("devname"));
		EnterText(ViewUniqueName, "EFGH", "ViewUniqueName");
		WebElement saveBtn = driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']"));
		Click(saveBtn, "Save ");
		String errorMessage = driver.findElement(By.xpath("//div[contains(text(),'You must enter a value')]"))
				.getText();
		String text = "Error: You must enter a value";
		if (text.contains(errorMessage)) {
			logger.log(LogStatus.PASS, "Error messagfe appears as Error: You must enter a value");
		} else {
			logger.log(LogStatus.FAIL, "Error messagfe appears as Error: You must enter a value");
		}

	}

	public static void TC_31() throws InterruptedException {
		logger = report.startTest("TC_30");
		login();
		WebElement addTabs = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		Click(addTabs, "AddTab");
		Thread.sleep(2000);
		WebElement contacts = driver.findElement(By.xpath("//a[@class='listRelatedObject contactBlock title']"));
		Click(contacts, "contacts");
		Thread.sleep(2000);
		logger.log(LogStatus.INFO, "Contacts page is opened");
		WebElement createNewView = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		Click(createNewView, "createNewView ");
		Thread.sleep(2000);
		WebElement viewName = driver.findElement(By.id("fname"));
		EnterText(viewName, "ABCD", "ViewName");
		WebElement ViewUniqueName = driver.findElement(By.id("devname"));
		EnterText(ViewUniqueName, "EFGH", "ViewUniqueName");
		WebElement CancelBtn = driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='cancel']"));
		Click(CancelBtn, "Cancel");
		Thread.sleep(2000);
		String expectedTitle = "Contacts: Home ~ Salesforce - Developer Edition";
		String actualTitle = driver.getTitle();
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			logger.log(LogStatus.INFO, "Contact home page displayed");
		} else {
			logger.log(LogStatus.INFO, "Contact home page not displayed");
		}
		WebElement ViewDropDown = driver.findElement(By.id("fcf"));
		Select listofDropDown = new Select(ViewDropDown);
		List<WebElement> list = listofDropDown.getOptions();
		boolean b = false;
		for (WebElement e : list) {
			if (!e.getText().contains("ABCD")) {
				b = true;
			}
		}
		if (b == true) {
			logger.log(LogStatus.PASS, "View ABCD not created");
		} else {
			logger.log(LogStatus.FAIL, "View ABCD  created");
		}

	}

	public static void TC_32() throws InterruptedException {
		logger = report.startTest("TC_32");
		login();
		WebElement addTabs = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		Click(addTabs, "AddTab");
		Thread.sleep(2000);
		WebElement contacts = driver.findElement(By.xpath("//a[@class='listRelatedObject contactBlock title']"));
		Click(contacts, "contacts");
		Thread.sleep(2000);
		logger.log(LogStatus.INFO, "Contacts page is opened");
		WebElement newBtn = driver.findElement(By.xpath("//input[@name='new']"));
		Click(newBtn, "New");
		Thread.sleep(2000);
		WebElement lastname = driver.findElement(By.id("name_lastcon2"));
		EnterText(lastname, "Indian", "lastname");
		WebElement accountName = driver.findElement(By.id("con4"));
		EnterText(accountName, "Global Media", "AccountName");
		WebElement saveBtn = driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']"));
		Click(saveBtn, "Save ");
		WebElement SaveandNewBtn = driver.findElement(By.xpath("//td[@class='pbButton']//input[@name='save_new']"));
		Click(SaveandNewBtn, "Save&New");
		String str = driver.findElement(By.xpath("//div[@class='pbError']")).getText();
		if (str == null) {
			logger.log(LogStatus.FAIL, "Contact not saved");
		} else {
			logger.log(LogStatus.FAIL, "Contact saved ");
		}
	}

	public static void TC_33() throws InterruptedException {
		logger = report.startTest("TC_33");
		login();
		WebElement home = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		Click(home, "Home");
		Thread.sleep(2000);
		WebElement firstnameLastname = driver.findElement(By.xpath("//a[contains(text(),'himabindu gundarapu')]"));
		Click(firstnameLastname, "firstnameLastname");
		Thread.sleep(2000);
		String str = driver.getTitle();
		String MyprofileTitle = "User: himabindu gundarapu ~ Salesforce - Developer Edition";
		if (str.equalsIgnoreCase(MyprofileTitle)) {
			logger.log(LogStatus.PASS, "The displayed page is same as Myprofile page");
		} else {
			logger.log(LogStatus.PASS, "The displayed page is same as Myprofile page");
		}
	}

	public static void TC_34() throws InterruptedException {
		logger = report.startTest("TC_34");
		login();
		WebElement home = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		Click(home, "Home");
		Thread.sleep(2000);
		WebElement firstnameLastname = driver.findElement(By.xpath("//h1[@class='currentStatusUserName']"));
		Click(firstnameLastname, "firstnameLastname");
		Thread.sleep(2000);
		logger.log(LogStatus.INFO, "First name Last name page is displayed");
		WebElement edit = driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img"));
		Click(edit, " edit");
		SwitchFrame("contactInfoContentId");
		WebElement about = driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		Click(about, " About");
		Thread.sleep(2000);
		WebElement lastname = driver.findElement(By.id("lastName"));
		EnterText(lastname, "chandula", "LastName");
		WebElement SaveAll = driver.findElement(By.xpath("//input[contains(@class,'zen-btn zen-primaryBtn zen-pas')]"));
		Click(SaveAll, "SaveAll");
		Thread.sleep(2000);
//			String str = driver.findElement(By.id("//h1[@class='currentStatusUserName']")).getText();
//			if( str.contains("chandula")) {
//				logger.log(LogStatus.INFO, "updated last name present in user name");
//			}
//			else {
//				logger.log(LogStatus.INFO, "updated last name present in user name");
//			}
		String user = driver.findElement(By.id("userNavLabel")).getText();
		// user.isDisplayed()
		if (user.contains("chandula")) {
			logger.log(LogStatus.INFO, "updated last name present in user name");
		} else {
			logger.log(LogStatus.INFO, "updated last name present in user name");
		}
	}

	public static void TC_35() throws InterruptedException {
		logger = report.startTest("TC_35");
		login();
		WebElement addTabs = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		Click(addTabs, "AddTab");
		Thread.sleep(2000);
		WebElement customizeTabs = driver.findElement(By.xpath("//input[@name='customize']"));
		Click(customizeTabs, "customizeTabs");

		WebElement SelectedTab = driver.findElement(By.id("duel_select_1"));
		Select elements = new Select(SelectedTab);
		List<WebElement> selectTabList = elements.getOptions();

		int sz = selectTabList.size();
		Random r = new Random();
		int x = r.nextInt(sz - 1) + 1;

		System.out.println("sz = " + sz + " x = " + x);
		String str = selectTabList.get(x).getText();
		System.out.println(str);
		elements.deselectAll();
		elements.selectByVisibleText(str);
		Thread.sleep(1000);

		WebElement remove = driver.findElement(By.xpath("//img[contains(@class,'leftArrowIcon')]"));
		Click(remove, "remove");

		WebElement AllTab = driver.findElement(By.id("duel_select_0"));
		Select Allelements = new Select(AllTab);
		List<WebElement> AllTabList = Allelements.getOptions();
		for (WebElement e : AllTabList) {
			if (e.getText().equals(str)) {
				logger.log(LogStatus.INFO, "The removed Tab from Selected Tab displayed in AllTabs");

			} else {
				logger.log(LogStatus.INFO, "The removed Tab from Selected Tab displayed in AllTabs");
			}
		}

		WebElement save = driver.findElement(By.xpath("//input[@name='save']"));
		Click(save, "save");

		WebElement tabBar = driver.findElement(By.xpath("//ul[@class='zen-inlineList zen-tabMenu']"));
		System.out.println(tabBar.getText());

		boolean foundIt = tabBar.getText().contains(str);
		if (!foundIt) {
			logger.log(LogStatus.INFO, " The selected tab removed from TabBar");
			// System.out.println("Success");
		} else {
			logger.log(LogStatus.INFO, " The selected tab  not removed from TabBar");
			// System.out.println("Fail");
		}
		UserMenu();
		LogOut();
		login();

//		WebElement AllTab = driver.findElement(By.xpath("//*[@id=\"bodyCell\"]/div[3]/div[2]/table"));
//		List<WebElement> rows = AllTab.findElements(By.tagName("tr"));
//
//		boolean foundIt = false;
//		for (int i=0; i<rows.size(); ++i) {
//			List<WebElement> data = rows.get(i).findElements(By.tagName("td"));
//			
//			for (int j=0; j<data.size(); ++j) {
//				if (data.get(j).getText().equalsIgnoreCase(str)) {
//					foundIt = true;
//					break;
//				}
//			}
//			if (foundIt) { break; }
//		}
//		

		WebElement tabBar1 = driver.findElement(By.xpath("//ul[@class='zen-inlineList zen-tabMenu']"));
		System.out.println(tabBar1.getText());

		boolean foundIt1 = tabBar1.getText().contains(str);
		if (!foundIt1) {
			logger.log(LogStatus.PASS, "");
			System.out.println("Success");
		} else {
			System.out.println("Fail");
		}

//			elements.selectByVisibleText("Chatter");
		Thread.sleep(2000);

	}

	public static void TC_37() throws InterruptedException {
		logger = report.startTest("TC_37");
		login();
		WebElement home = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		Click(home, "Home");
//		String str = //a[contains(text(),'Friday February 21, 2020')].getText();
//		String actualStr = 
		WebElement dateLink = driver.findElement(By.xpath("//a[contains(text(),'Friday February 21, 2020')]"));
		Click(dateLink, "dateLink");
		String actualPage = "Salesforce - Developer Edition";
		String expectedPage = driver.getTitle();
		if (actualPage.equals(expectedPage)) 
		{
			logger.log(LogStatus.INFO, "Calender for FirstName LastName Displayed");
		} 
		else 
		{
			logger.log(LogStatus.INFO, "Calender for FirstName LastName Displayed");
		}
		WebElement Link_4PM = driver.findElement(By.xpath("//a[contains(text(),'4:00 PM')]"));
		Click(Link_4PM, "Link_4PM");
		String actualPage1 = "Calendar: New Event ~ Salesforce - Developer Edition";
		String expectedPage1 = driver.getTitle();
		if (actualPage1.equals(expectedPage1)) 
		{
			logger.log(LogStatus.INFO, "Calender NewEvent page is  Displayed");
		}
		else 
		{
			logger.log(LogStatus.INFO, "Calender NewEvent page is not  Displayed");
		}
		WebElement subjectText = driver.findElement(By.id("evt5"));
		if (subjectText.equals(driver.switchTo().activeElement())) 
		{
			logger.log(LogStatus.INFO, "cursor at subjectfield textbox");
			System.out.println("cursor is present");
		}
		else 
		{
			logger.log(LogStatus.INFO, "cursor not at subjectfield textbox");
			System.out.println("cursor is not present");
		}
		WebElement SubjectCombo = driver.findElement(By.xpath("//img[@class='comboboxIcon']"));
		Click(SubjectCombo, "SubjectCombo");
		String PopUpUrl = "https://na174.salesforce.com/widg/combobox.jsp?form=editPage&field=evt5&display=1&cnt=5";
		
		String oldwindow = driver.getWindowHandle();
	
		Set<String> getAllWindows = driver.getWindowHandles();
		String[] getWindow = getAllWindows.toArray(new String[getAllWindows.size()]);
		// System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(getWindow[1]);
		//System.out.println(driver.getCurrentUrl());
		driver.get("https://na174.salesforce.com/widg/combobox.jsp?form=editPage&field=evt5&display=1&cnt=5");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement Others = driver.findElement(By.xpath("//a[contains(text(),'Other')]"));
		Click(Others, "Others");
		
		driver.switchTo().window(oldwindow);
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		WebElement SubjectTextBox = driver.findElement(By.id("evt5"));
		if(SubjectTextBox.equals("Others")) {
			logger.log(LogStatus.INFO, "Textbox diaplayed with text  Others");
			System.out.println("other is present");
		}
		else {
			logger.log(LogStatus.INFO, "Textbox not  diaplayed with text  Others");
			System.out.println("other is present");
		}
		
		
	}
	
}
