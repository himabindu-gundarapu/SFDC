import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","/Users/vinod/Downloads/chromedriver");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://qa-tekarch.firebaseapp.com/");
		Thread.sleep(2000);
		WebElement un = driver.findElement(By.id("email_field"));
		un.sendKeys("admin123@gmail.com");
		WebElement pwd = driver.findElement(By.id("password_field"));
		pwd.sendKeys("admin123");
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"login_div\"]/button"));
		loginBtn.click();
		Thread.sleep(3000);
//		driver.quit();
//		
	}

}
