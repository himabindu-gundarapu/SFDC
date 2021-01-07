/**
 * 
 */
package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import freemarker.log.Logger;

/**
 * @author
 *
 */
public class LoginPage {
	WebDriver driver;
	@FindBy(id ="username")
	WebElement uname;
	@FindBy(id="password")
	WebElement pwd;
	@FindBy(id="Login")
	WebElement loginBtn;
	@FindBy(id="rememberUn")
	WebElement RemeberMeCheckBox;
	@FindBy(id="mydomainLink")
	WebElement useCustmDomainLink;
	@FindBy(id="logo")
	WebElement loginPageTitle;
	@FindBy(id="logo")
	WebElement salesforceLogo;
	@FindBy(id="error")
	WebElement clearpwdErrMsg;
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		 PageFactory.initElements(driver, this);
	}
	public void enterUname(String un) {
		uname.sendKeys(un);
	}
	public void enterPwrd(String pw) {
		pwd.sendKeys(pw);
	}
	public void loginClick() {
		loginBtn.click();
	}
	public void login(String strUserName,String strPassword) {
		uname.sendKeys(strUserName);
		pwd.sendKeys(strPassword);
		loginBtn.click();
	}
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	public boolean validateSalesForceLogo() {
		return salesforceLogo.isDisplayed();
	}
	public String pwdclear_errorMsg() {
		return clearpwdErrMsg.getText();
		
	}
	public void rememberCheckbox() {
		
		Assert.assertTrue((RemeberMeCheckBox!=null)&&(RemeberMeCheckBox.isSelected()),"Checkbox not found");
			RemeberMeCheckBox.click();
		
	}

}
