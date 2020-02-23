import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import io.github.bonigarcia.wdm.WebDriverManager;
//import org.testing.annotations.Test;
public class SaleForceTestCases {
	WebDriver driver;
	
	@Test
	public void _1LoginErrorMessage() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver.get("https://login.salesforce.com/");
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("himabindu@sbn.com");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.clear();
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		loginBtn.click();
		Thread.sleep(2000);
		String errormessage = driver.findElement(By.xpath("//*[@id=\"error\"]")).getText();
		String msg = "Please enter your password";
		if( msg.equals(errormessage)) {
			System.out.println(" error message displayed");
		}
		else {
			System.out.println(" error msg not displayed");
		}
	Thread.sleep(2000);
//		driver.quit();
		
	}
	@Test
	public void LoginToSalesForce() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver.get("https://login.salesforce.com/");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("himabindu@sbn.com");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("nishu123@123");
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		loginBtn.click();
		Thread.sleep(2000);
		}
	@Test
	public void CheckRememberMe() {
		WebDriverManager.chromedriver().setup();
		driver.get("https://login.salesforce.com/");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("himabindu@sbn.com");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("nishu123@123");
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		loginBtn.click();
		WebElement RememberCheck = driver.findElement(By.className("fl pr db tn3"));
		RememberCheck.click();
		WebElement menuBtn = driver.findElement(By.id("userNav"));
		menuBtn.click();
		WebElement logout = driver.findElement(By.className("menuButtonMenuLink"));
		logout.click();
		
		
	}
	
}
