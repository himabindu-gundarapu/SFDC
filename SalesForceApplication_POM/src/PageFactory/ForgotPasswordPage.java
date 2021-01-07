/**
 * 
 */
package PageFactory;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/**
 * @author sayanna
 *
 */
public class ForgotPasswordPage {
	WebDriver driver;
	@FindBy(id="forgot_password_link")
	WebElement forgotPwdLink;
	@FindBy(id="un")
	WebElement Email;
	@FindBy(id="continue")
	WebElement continueBtn;
	@FindBy(xpath="//*[@id=\"forgotPassForm\"]/div[1]/a")
	WebElement cancelBtn;
	@FindBy(id="video-link")
	WebElement needHelpLink;
	@FindBy(id="header")
	WebElement ForgotpwdPageTitle;
	public ForgotPasswordPage(WebDriver driver) {
		this.driver = driver;
		 PageFactory.initElements(driver, this);
	}
	public void ClickForgotPasswordLink() {
		Assert.assertTrue((forgotPwdLink!=null)&&(forgotPwdLink.isDisplayed()),"forgotpassword link not found");
		forgotPwdLink.click();
	}
	public String validateForgotPageTitle() {
		return ForgotpwdPageTitle.getText();
	}
	public String validateCheckyourMailPageTitle() {
		return driver.getTitle();
	}
	public void enterEmail(String strEmail) {
		Assert.assertTrue((Email!=null)&&(Email.isDisplayed()),"Tesxt box not found");
		Email.sendKeys(strEmail);
	}
	public void ClickContinue() {
		Assert.assertTrue((continueBtn!=null)&&(continueBtn.isDisplayed()),"Continue button not found");
		continueBtn.click();
	}
}
