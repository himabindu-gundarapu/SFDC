import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver"," /usr/bin/safaridriver");
		WebDriver driver = new SafariDriver();
		driver.get("https://www.google.com/");
		

	}

}
