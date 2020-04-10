
import java.net.URL;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AmazonAddToCart {

	public static void main(String[] args) throws Throwable {
		AndroidDriver<MobileElement> driverMob;
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "0249eb7ef3801663");
		cap.setCapability("appPackage","com.amazon.mShop.android.shopping");
		cap.setCapability("automationName","uiautomator2");
		//cap.setCapability("appActivity","com.amazon.mShop.home.web.MShopWebGatewayActivity");
		cap.setCapability("appActivity","com.amazon.mShop.splashscreen.StartupActivity");
		cap.setCapability(MobileCapabilityType.NO_RESET,true);
		
//		Wait<WebDriver> gWait = new FluentWait<WebDriver>(pDriver).withTimeout(Duration.ofSeconds(100))
//		        .pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);
		
				
		driverMob = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		Thread.sleep(4000);
		driverMob.findElement(By.id("com.amazon.mShop.android.shopping:id/sign_in_button")).click();
		Thread.sleep(5000);
//		driverMob.findElement(By.id("ap_email_login")).click();
		
		Wait<AndroidDriver<MobileElement>> wait = new FluentWait<AndroidDriver<MobileElement>>(driverMob)							
				.withTimeout(Duration.ofSeconds(100)) 			
				.pollingEvery(Duration.ofMillis(600)) 			
				.ignoring(NoSuchElementException.class);
		

		MobileElement emailLink = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_email_login")));
		Thread.sleep(3000);
		emailLink.click();
//
//		driverMob.findElementByAndroidUIAutomator(
//				"UiSelector().className(\"android.view.view\").text(\"ap_ra_email_or_phone\")").click();
//driverMob.pressKeyCode(AndroidKeyCode.BACK);
		}

}
