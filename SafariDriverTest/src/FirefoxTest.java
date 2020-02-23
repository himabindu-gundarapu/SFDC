import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
	}

}
