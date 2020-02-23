import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://qa-tekarch.firebaseapp.com");
		Thread.sleep(2000);
		WebElement uname = driver.findElement(By.id("email_field"));
		uname.sendKeys("admin123@gmail.com");
		WebElement pwd = driver.findElement(By.id("password_field"));
		pwd.sendKeys("admin123");
		WebElement btn = driver.findElement(By.xpath("//*[@id=\"login_div\"]/button"));
		btn.click();
		Thread.sleep(2000);
		WebElement homeBtn = driver.findElement(By.xpath("//*[@id=\"user_div\"]/div/a[1]"));
		homeBtn.click();
		Thread.sleep(2000);

		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("John");
		WebElement fatherName = driver.findElement(By.id("lname"));
		fatherName.sendKeys("Joseph");
		WebElement postalAdd = driver.findElement(By.id("postaladdress"));
		postalAdd.sendKeys("St.Thamaos street");
		WebElement personalAdd = driver.findElement(By.id("personaladdress"));
		personalAdd.sendKeys("India");
		WebElement radioBtn = driver.findElement(By.id("radiobut"));
		radioBtn.click();
		WebElement radioBtn2 = driver.findElement(By.id("radiobut"));
		radioBtn2.click();
		WebElement city = driver.findElement(By.id("city"));
		Select City = new Select(city);
		City.selectByVisibleText("MUMBAI");
//		WebElement firstEle = sel.getFirstSelectedOption();
//		System.out.println(" first selected option : " + firstEle.getText());
		WebElement course = driver.findElement(By.id("course"));
		Select sel1 = new Select(course);
		sel1.selectByVisibleText("MBA");
		WebElement distric = driver.findElement(By.id("district"));
		Select sel2 = new Select(distric );
		sel2.selectByVisibleText("GOA");
		WebElement State = driver.findElement(By.id("state"));
		Select sel3 = new Select(State);
		sel3.selectByVisibleText("UP");
		WebElement pincode = driver.findElement(By.id("pincode"));
		pincode.sendKeys("94404");
		WebElement email = driver.findElement(By.id("emailid"));
		email.sendKeys("abc@gmail.com");
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"user_div\"]/div[2]/div/span/button"));
		submit.click();
		Thread.sleep(5000);
		driver.quit();
	}

}
