
import io.appium.java_client.android.nativekey.KeyEvent;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.remote.MobileCapabilityType;



public class TestCases {


	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		 AndroidDriver<MobileElement> driverMob;
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "0249eb7ef3801663");
		cap.setCapability("appPackage","com.amazon.mShop.android.shopping");
		cap.setCapability("automationName","uiautomator2");
		//cap.setCapability("appActivity","com.amazon.mShop.home.web.MShopWebGatewayActivity");
		cap.setCapability("appActivity","com.amazon.mShop.splashscreen.StartupActivity");
		cap.setCapability(MobileCapabilityType.NO_RESET,false);
		driverMob = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		Thread.sleep(2000);		
//		driverMob.findElement(By.id("com.amazon.mShop.android.shopping:id/sign_in_button")).click();
//		Thread.sleep(2000);
		//driverMob.findElement(By.xpath("//android.widget.EditText[@resource-id='ap_email_login'and @index='1']")).click();
		
	driverMob.findElement(By.id("com.amazon.mShop.android.shopping:id/skip_sign_in_button")).click();
	Thread.sleep(2000);
	MobileElement search = driverMob.findElement(By.id("com.amazon.mShop.android.shopping:id/rs_search_src_text"));
	search.click();
	Thread.sleep(1000);
//	search.sendKeys("keyboard");
	
	KeyEvent key = new KeyEvent(AndroidKey.K);
	driverMob.pressKey(key);
	Thread.sleep(1000);
	
	key.withKey(AndroidKey.E);
	driverMob.pressKey(key);
	Thread.sleep(1000);

	key.withKey(AndroidKey.Y);
	driverMob.pressKey(key);
	Thread.sleep(1000);

	key.withKey(AndroidKey.B);
	driverMob.pressKey(key);
	Thread.sleep(1000);
	
	key.withKey(AndroidKey.O);
	driverMob.pressKey(key);
	Thread.sleep(1000);
	
	key.withKey(AndroidKey.A);
	driverMob.pressKey(key);
	Thread.sleep(1000);
	
	key.withKey(AndroidKey.R);
	driverMob.pressKey(key);
	Thread.sleep(1000);
	
	key.withKey(AndroidKey.D);
	driverMob.pressKey(key);
	Thread.sleep(1000);
	
	key.withKey(AndroidKey.ENTER);
	driverMob.pressKey(key);
	Thread.sleep(1000);
	
//	search.sendKeys(Keys.ENTER);
//	search.sendKeys(Keys.valueOf("k"));
//	search.sendKeys(Keys.valueOf("k"));
	
	Thread.sleep(2000);
	
	
//		
//		List<MobileElement> elList = driverMob.findElementsByClassName("android.view.View");
//		
//        System.out.println("found number of elements: " + elList.size());
//        if (!elList.isEmpty()) { //we got some elements
//            // try first one
//            elList.get(1).sendKeys("8129497946");
//            try {Thread.sleep(10000);} catch (Exception e) {}
//            // check if we had effect
//            
//            // now other way
//           // elList.get(1).setValue("8129497946");
//
//        }
		
	}

}
