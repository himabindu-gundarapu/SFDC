/**
 * 
 */
package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	@FindBy(id="forgot_password_link")
	WebElement forgotPwdLink;
	@FindBy(id="rememberUn")
	WebElement RemeberMeCheckBox;
	@FindBy(id="mydomainLink")
	WebElement useCustmDomainLink;
	@FindBy(id="logo")
	WebElement loginPageTitle;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		 PageFactory.initElements(driver, this);
	}
	public void enterUserName(String strUserName) {
		uname.sendKeys(strUserName);
	}
	public void enterPassWord(String strPassword) {
		pwd.sendKeys(strPassword);
	}
	public void clickLogin() {
		loginBtn.click();
	}
	public void getTitle() {
		
	}

}
