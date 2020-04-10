import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppTesting {

	public static void main(String[] args) throws Throwable {
		AndroidDriver<MobileElement> driverMob;
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "0249eb7ef3801663");
		cap.setCapability("appPackage","com.macys.android");
		cap.setCapability("automationName","uiautomator2");
		//cap.setCapability("appActivity","com.amazon.mShop.home.web.MShopWebGatewayActivity");
		cap.setCapability("appActivity","com.macys.main.ui.activity.MainActivity");
		cap.setCapability(MobileCapabilityType.NO_RESET,true);
		driverMob = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driverMob.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverMob.findElement(By.id("com.macys.android:id/btnSecond")).click();
		driverMob.findElement(By.id("com.macys.android:id/btnSecond")).click();
		driverMob.findElement(By.id("com.macys.android:id/label_search")).click();
	}

}
