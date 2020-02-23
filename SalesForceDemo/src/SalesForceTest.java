import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/sayanna/Downloads/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		Thread.sleep(2000);
		WebElement un = driver.findElement(By.id("username"));
		un.sendKeys("himabindu@sbn.com");
		Thread.sleep(3000);
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("nishu123@123");
		Thread.sleep(3000);
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		loginBtn.click();
//		Thread.sleep(3000);
//		driver.quit();
	}

}
