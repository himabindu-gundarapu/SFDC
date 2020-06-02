import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefination {
	WebDriver driver;

	@Given("^open browser and launch xero application$")
	public void open_browser_and_launch_xero_application() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://login.xero.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@When("^login into xeroapplication$")
	public void login_into_xeroapplication() throws Throwable {
		WebElement unameTextBox = driver.findElement(By.id("email"));
		unameTextBox.sendKeys("testQA2020mar@gmail.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("abc123@123");
		WebElement loginBtn = driver.findElement(By.id("submitButton"));
		loginBtn.click();
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^Homescreen displayed or not$")
	public void homescreen_displayed_or_not() throws Throwable {
		String actual = driver.getTitle();
		Assert.assertEquals(actual, "My Xero | Add your organisation");
		System.out.println("login to app");
		driver.close();

	}

}
