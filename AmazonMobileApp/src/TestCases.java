
import io.appium.java_client.android.nativekey.KeyEvent;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestCases {
	static AndroidDriver<MobileElement> driverMob;
	DesiredCapabilities cap = new DesiredCapabilities();
	public static void Scroll(String scrollStartItem, String scrollEndItem) {
		
		MobileElement scroll = (MobileElement) driverMob.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"" +scrollStartItem + "\"))"
				+ ".scrollIntoView(new UiSelector().text(\"" +scrollEndItem+ "\"))");
		scroll.click();
		
	}

	public static void setDesiredCapabilities(DesiredCapabilities cap) {

		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "0249eb7ef3801663");
		cap.setCapability("appPackage", "com.amazon.mShop.android.shopping");
		cap.setCapability("automationName", "uiautomator2");
		cap.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
	}

	public static void loginToAmazon() {
		driverMob.findElementByAndroidUIAutomator("UiSelector().text(\"Sign in\")").click();
		MobileElement username = driverMob
				.findElementByAndroidUIAutomator("UiSelector().resourceId(\"ap_email_login\")");
		username.click();
		username.sendKeys("testqa2020mar@gmail.com" + "\n");
		driverMob.pressKey(new KeyEvent(AndroidKey.ENTER));
		MobileElement password = driverMob.findElementByAndroidUIAutomator("UiSelector().resourceId(\"ap_password\")");
		password.click();
		password.sendKeys("tekarch123");
		driverMob.findElementByAndroidUIAutomator("UiSelector().resourceId(\"signInSubmit\")").click();

	}
	public static void addItemsToCart() throws InterruptedException {
		MobileElement search = driverMob.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.amazon.mShop.android.shopping:id/rs_search_src_text\")");
		search.click();
		search.sendKeys("keyboard");
		driverMob.pressKey(new KeyEvent(AndroidKey.ENTER));
		MobileElement keyboardItem=driverMob.findElement(By.xpath("//*[@class='android.view.View' and @index='7']"));
		//keyboardItem.click();
		System.out.println(keyboardItem.getText());
		Thread.sleep(2000);
//		String scrollStart ="Amazon.com";
//		String scrollEnd = "add-to-cart-button";
//		MobileElement scroll = (MobileElement) driverMob.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().textContains(\"" +scrollStart + "\"))"
//				+ ".scrollIntoView(new UiSelector().resourceId(\"" +scrollEnd+ "\"))");
//		scroll.click();
//		//driverMob .findElementByAndroidUIAutomator("UiSelector().text(\"No Thanks\")").click();
//		MobileElement searchImgBtn=driverMob.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.amazon.mShop.android.shopping:id/chrome_action_bar_search_icon\")");
//		searchImgBtn.click();
//		search.clear();
//		search.sendKeys("mouse");
//		driverMob.pressKey(new KeyEvent(AndroidKey.ENTER));
//		driverMob.findElement(By.xpath("//*[@class='android.view.View' and @index='7']")).click();
//		String scrollStart1 ="Amazon.com";
//		String scrollEnd1 = "add-to-cart-button";
//		MobileElement scroll1 = (MobileElement) driverMob.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().textContains(\"" +scrollStart1 + "\"))"
//				+ ".scrollIntoView(new UiSelector().resourceId(\"" +scrollEnd1+ "\"))");
//		scroll.click();
//		driverMob.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.amazon.mShop.android.shopping:id/chrome_action_bar_cart_image\")").click();
//		Thread.sleep(5000);
//		String str =
		
		
		
	}
	public static void logoutAmazon() throws InterruptedException {
		driverMob.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.amazon.mShop.android.shopping:id/chrome_action_bar_burger_icon\")").click();
		
		String scrollStartItem = "com.amazon.mShop.android.shopping:id/subnav_scrollable_container";
		String scrollEndItem ="Settings";
		Scroll(scrollStartItem ,scrollEndItem);
		
		driverMob.findElementByAndroidUIAutomator("UiSelector().text(\"Sign Out\")").click();
		driverMob.findElementByAndroidUIAutomator("UiSelector().resourceId(\"android:id/button2\")").click();
		Thread.sleep(2000);
	}
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap = new DesiredCapabilities();
		setDesiredCapabilities(cap);
		driverMob = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driverMob.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//loginToAmazon();
		addItemsToCart();
		//logoutAmazon();
		driverMob.quit();
		Thread.sleep(2000);
//	MobileElement search = driverMob.findElement(By.id("com.amazon.mShop.android.shopping:id/rs_search_src_text"));
//	search.click();
//	Thread.sleep(1000);
////	search.sendKeys("keyboard");
//	
//	KeyEvent key = new KeyEvent(AndroidKey.K);
//	driverMob.pressKey(key);
//	Thread.sleep(1000);
//	
//	key.withKey(AndroidKey.E);
//	driverMob.pressKey(key);
//	Thread.sleep(1000);
//
//	key.withKey(AndroidKey.Y);
//	driverMob.pressKey(key);
//	Thread.sleep(1000);
//
//	key.withKey(AndroidKey.B);
//	driverMob.pressKey(key);
//	Thread.sleep(1000);
//	
//	key.withKey(AndroidKey.O);
//	driverMob.pressKey(key);
//	Thread.sleep(1000);
//	
//	key.withKey(AndroidKey.A);
//	driverMob.pressKey(key);
//	Thread.sleep(1000);
//	
//	key.withKey(AndroidKey.R);
//	driverMob.pressKey(key);
//	Thread.sleep(1000);
//	
//	key.withKey(AndroidKey.D);
//	driverMob.pressKey(key);
//	Thread.sleep(1000);
//	
//	key.withKey(AndroidKey.ENTER);
//	driverMob.pressKey(key);
//	Thread.sleep(1000);
//	
//	
//	Thread.sleep(2000);
//	

	}

}
