package PageFactory;

import java.util.List;
import com.qa.Base.TestBase;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class UserMenuPage {
	WebDriver driver;
	@FindBy(id="userNav")
	WebElement usermenu;
	@FindBy(id = "userNav-menuItems")
	WebElement usermenuItems;
	@FindBy(xpath="//*[@id=\"userNav-menuItems\"]/a[1]")
	WebElement myProfile;
	@FindBy(xpath="//*[@id=\"userNav-menuItems\"]/a[2]")
	WebElement mySettings;
	@FindBy(xpath="//*[@id=\"userNav-menuItems\"]/a[3]")
	WebElement devConsole;
	@FindBy(xpath="//*[@id=\"userNav-menuItems\"]/a[4]")
	WebElement switchLightening;
	@FindBy(xpath="//*[@id=\"userNav-menuItems\"]/a[4]")
	WebElement logout;
	@FindBy(xpath="//a[@class='contactInfoLaunch editLink']//img")
	WebElement editProfile;
	@FindBy(id="aboutTab")
	WebElement about;
	@FindBy(id = "firstName")
	WebElement userFirstname;
	@FindBy(id="lastName")
	WebElement userLastname;
	@FindBy(xpath="//*[@id=\"TabPanel\"]/div/div[2]/form/div/input[1]")
	WebElement saveBtn;
	@FindBy(id="tailBreadcrumbNode")
	WebElement userprofileName;
	@FindBy(id="publisherAttachTextPost")
	WebElement postLink;
	@FindBy(xpath = "//*[@id=\"cke_39_contents\"]/iframe")
	WebElement postBodyframe;
	@FindBy(xpath="/html/body")
	WebElement postBody;
	@FindBy(id="publishersharebutton")
	WebElement shareBtn;
	@FindBy(css="body.hasMotif.userTab.UserProfilePage.ext-webkit.ext-chrome.ext-mac.sfdcBody.brandQuaternaryBgr:nth-child(2) div.bodyDiv.brdPalette.brandPrimaryBrd:nth-child(2) table.outerNoSidebar td.noSidebarCell div.profilePage.userProfilePage:nth-child(3) div.mainContent div.centerContent div.profileTabSetContainer.zen div.zen-box.zen-tabs.zen-simpleTabs.profileTabs div.zen-inner div.zen-body.profileTabBody ul.zen-tabBody:nth-child(2) li.profileTabContent.zen-current:nth-child(1) div.profileFeed div.profileSection div.cxfeedinnerwrapper:nth-child(4) div.feedcontainer.cxfeedcontainer.zen.actionsOnHoverEnabled:nth-child(1) div.cxfeeditem.feeditem:nth-child(7) div.feeditemcontent.cxfeeditemcontent:nth-child(2) div.feeditembodyandfooter div.feeditembody div.cxfeeditemtextwrapper div.cxfeeditemtextadditional > span.feeditemtext.cxfeeditemtext")
	WebElement postText;
	@FindBy(id="publisherAttachContentPost")
	WebElement fileLink;
	@FindBy(id="chatterUploadFileAction")
	WebElement uploadFile;
	@FindBy(id ="chatterFile")
	WebElement chooseFile;
	@FindBy(css="body.hasMotif.userTab.UserProfilePage.ext-webkit.ext-chrome.ext-mac.sfdcBody.brandQuaternaryBgr:nth-child(2) div.bodyDiv.brdPalette.brandPrimaryBrd:nth-child(2) table.outerNoSidebar td.noSidebarCell div.profilePage.userProfilePage:nth-child(3) div.mainContent div.centerContent div.profileTabSetContainer.zen div.zen-box.zen-tabs.zen-simpleTabs.profileTabs div.zen-inner div.zen-body.profileTabBody ul.zen-tabBody:nth-child(2) li.profileTabContent.zen-current:nth-child(1) div.profileFeed div.profileSection div.cxfeedinnerwrapper:nth-child(4) div.feedcontainer.cxfeedcontainer.zen.actionsOnHoverEnabled:nth-child(1) div.cxfeeditem.feeditem:nth-child(7) div.feeditemcontent.cxfeeditemcontent:nth-child(2) div.feeditembodyandfooter div.feeditembody div.feeditemattachments.cxfeeditemattachments div.feeditemaux.cxfeeditemaux.FilesCapabilityAuxBody span.EachFileAUxBodyWrapper div.feeditemaux.EachFileAuxBody table.contentPost td.rightSideCell table.contentdetails tbody:nth-child(1) tr:nth-child(1) td:nth-child(1) div.contentFileTitle > a.contentActionLink")
	WebElement fileUpload;
	
	public UserMenuPage(WebDriver driver) {
		this.driver = driver;
		 PageFactory.initElements(driver, this);
	}
	
	public void Validateusermenu(ExtentTest logger) {
		boolean b = (usermenu!=null)&&(usermenu.isDisplayed());
		if(b == true) {
			logger.log(LogStatus.INFO, "usermenu dropdown  displayed on home page");
		}
		else {
			logger.log(LogStatus.INFO, "usermenu dropdown not  displayed on home page");	
		}
		
		Assert.assertTrue(b,"usermenu not found");
	}
	
	public String[] userMenuElements() {
		String str = usermenuItems.getText();
		String[] actual =str.split("\n");
		return actual;
	}
	public boolean validateUserProfilePage(String str) {
		String actual= userprofileName.getText();
		String expected = str;
		Assert.assertEquals(actual, expected);
		return true;
	}
	
	public void click(String str) {
		if (str.equals("editProfile")) {
			Assert.assertTrue((editProfile!=null)&&(editProfile.isDisplayed()),"EditProfile not found");
			editProfile.click();
		} else if (str.equals("usermenu")) {
			Assert.assertTrue((usermenu!=null)&&(usermenu.isDisplayed()),"usermenu not found");
			usermenu.click();
		}
		else if(str.equals("myProfile")) {
			Assert.assertTrue((myProfile!=null)&&(myProfile.isDisplayed()),"Myprofile not found");
			myProfile.click();
		}
		else if(str.equals("about")) {
			Assert.assertTrue((about!=null)&&(about.isDisplayed()),"About tab is  not found");	
			about.click();
		}
		else if(str.equals("saveBtn")) {
			Assert.assertTrue((saveBtn!=null)&&(saveBtn.isDisplayed())," Save button is  not found");	
			saveBtn.click();
		}
		else if(str.equals("postLink")) {
			Assert.assertTrue((postLink!=null)&&(postLink.isDisplayed())," postLink button  is  not found");	
			postLink.click();
		}
		else if(str.equals("shareBtn")) {
			Assert.assertTrue((shareBtn!=null)&&(shareBtn.isDisplayed())," shareBtn button  is  not found");	
			shareBtn.click();
		}
		else if(str.equals("fileLink")) {
			Assert.assertTrue((fileLink!=null)&&(fileLink.isDisplayed())," file button  is  not found");	
			fileLink.click();
		}
		else if(str.equals("uploadFile")) {
			Assert.assertTrue((uploadFile!=null)&&(uploadFile.isDisplayed())," uploadFile is  not found");	
			uploadFile.click();
		}
	}
	public void enterText(String userFName ) {
		Assert.assertTrue((userFirstname!=null)&&(userFirstname.isDisplayed()),"First name text box not found");
		userFirstname.sendKeys(userFName);
	}
	public void enterTextlastname(String uLname) {
		Assert.assertTrue((userLastname!=null)&&(userLastname.isDisplayed())," Lastname text box not found");
		userLastname.clear();
		userLastname.sendKeys(uLname);
		System.out.println("This is the lastname="+uLname + "end");
	}
	public void enterTextPost(String text) {
		Assert.assertTrue((postBody!=null)&&(postBody.isDisplayed())," post body text box not found");
		postBody.click();
		postBody.sendKeys(text);
		
	}
	public void chooseFile(String path) {
		Assert.assertTrue((chooseFile!=null)&&(chooseFile.isDisplayed())," chooseFile not found");
		chooseFile.sendKeys(path);
	}
	
	public void switchPostBodyFrame() {
		driver.switchTo().frame(postBodyframe);
	
	}
	public void validatepostBodyText(String str,ExtentTest logger) 
	{
		String actualText = postText.getText();
		boolean result = actualText.equals(str);
		if(result == true) {
			logger.log(LogStatus.INFO, "Entered text is displayed");
			}
		else
		{
			logger.log(LogStatus.INFO, "Entered text is not displayed");
		}
		Assert.assertTrue(result);
	}
	
	public void validateuploadFile(String str,ExtentTest logger) 
	{
		String actualText =fileUpload.getText();
		boolean result = actualText.equals(str);
		if(result == true) {
			logger.log(LogStatus.INFO, "uploaded file name is  displayed");
			}
		else
		{
			logger.log(LogStatus.INFO, "uploaded file name is not displayed");
		}
		Assert.assertTrue(result);
	}
		
	
//
	

}
