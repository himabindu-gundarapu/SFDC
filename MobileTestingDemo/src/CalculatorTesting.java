import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CalculatorTesting {

	public static void main(String[] args) throws Throwable {
		
		AppiumDriver<WebElement> drivermob;
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"0249eb7ef3801663");
		//App package and activity.
		cap.setCapability("appPackage","com.google.android.calculator");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		drivermob = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		drivermob.findElement(By.id("digit_5")).click();
		drivermob.findElement(By.id("digit_4")).click();
		drivermob.findElement(By.id("op_mul")).click();
		drivermob.findElement(By.id("digit_3")).click();
		drivermob.findElement(By.id("eq")).click();
		Thread.sleep(2000);
		String str = drivermob.findElement(By.id("result_final")).getText();
		System.out.println(str);
		drivermob.findElement(By.id("digit_6")).click();
		drivermob.findElement(By.id("digit_4")).click();
		drivermob.findElement(By.id("op_add")).click();
		drivermob.findElement(By.id("digit_3")).click();
		drivermob.findElement(By.id("eq")).click();
		Thread.sleep(2000);
		String str1 = drivermob.findElement(By.id("result_final")).getText();
		System.out.println(str1);
		drivermob.findElement(By.id("digit_6")).click();
		drivermob.findElement(By.id("digit_4")).click();
		drivermob.findElement(By.id("op_div")).click();
		drivermob.findElement(By.id("digit_8")).click();
		drivermob.findElement(By.id("eq")).click();
		Thread.sleep(2000);
		String str2= drivermob.findElement(By.id("result_final")).getText();
		System.out.println(str2);
		
	}

}
