import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.android.nativekey.KeyEvent;
public class AppTesting {
	
	static AndroidDriver<MobileElement> driverMob;
	
	public static void logoutMacys() throws InterruptedException {
		driverMob.findElement(By.id("com.macys.android:id/global_navigation_account_tab")).click();
		swipe();
//		driverMob.findElement(By.id("com.macys.android:id/button_signout")).click();
		Thread.sleep(2000);
	}	
	

	public static void setDesiredCapabilities(DesiredCapabilities cap) {
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "0249eb7ef3801663");
		cap.setCapability("appPackage","com.macys.android");
		cap.setCapability("automationName","uiautomator2");
		cap.setCapability("appActivity","com.macys.main.ui.activity.MainActivity");		
		cap.setCapability(MobileCapabilityType.NO_RESET,false);
	}
	
	public static void loginMacys() throws InterruptedException {
		driverMob.findElement(By.id("com.macys.android:id/btnSecond")).click();
		driverMob.findElement(By.id("com.macys.android:id/btnSecond")).click();
		driverMob.findElement(By.className("android.widget.TextView")).click();
		driverMob.findElement(By.id("com.macys.android:id/field_auth_email")).sendKeys("testqa2020mar@gmail.com");
		driverMob.findElement(By.id("com.macys.android:id/field_auth_password")).sendKeys("chan123@123");
		driverMob.findElement(By.id("com.macys.android:id/button_auth_sign_in")).click();
		Thread.sleep(2000);		
		String str = driverMob.findElement(By.id("com.macys.android:id/label_welcome_user_center")).getText();
		System.out.println(str);
		String expected = "Hi hima!";
		if(str.equalsIgnoreCase(expected)) {
			System.out.println("Home page is displayed");
		}
		else {
			System.out.println("Home page not displayed");
		}		
	}
	
	public static void search(String searchStr) throws InterruptedException {
		MobileElement search = driverMob.findElement(By.id("com.macys.android:id/label_search"));
		search.click();
		//search.sendKeys("keyboard");
		Thread.sleep(1000);
		
		KeyEvent key = new KeyEvent(AndroidKey.K);
		
//		for (int i=0; i<searchStr.length(); ++i) {
//			key.withKey(AndroidKey.A + (searchStr.charAt(i) - 'a'));;
//			driverMob.pressKey(key);
//			Thread.sleep(1000);			
//		}
//		
		key.withKey(AndroidKey.K);
		driverMob.pressKey(key);
		Thread.sleep(1000);
		
		key.withKey(AndroidKey.E);
		driverMob.pressKey(key);
		Thread.sleep(1000);

		key.withKey(AndroidKey.Y);
		driverMob.pressKey(key);
		
		key.withKey(AndroidKey.B);
		driverMob.pressKey(key);
		//Thread.sleep(1000);
		
		key.withKey(AndroidKey.O);
		driverMob.pressKey(key);
		//Thread.sleep(1000);
		
		key.withKey(AndroidKey.A);
		driverMob.pressKey(key);
		//Thread.sleep(1000);
		
		key.withKey(AndroidKey.R);
		driverMob.pressKey(key);
		//Thread.sleep(1000);
		
		key.withKey(AndroidKey.D);
		driverMob.pressKey(key);
		//Thread.sleep(1000);
		
		key.withKey(AndroidKey.ENTER);
		driverMob.pressKey(key);
		Thread.sleep(1000);
		
	}
	public static void scroll() {
//		Dimension dimension = driverMob.manage().window().getSize();
//		int x = dimension.getWidth()/2;
//		int startY =(int)(dimension.getHeight()*0.5);
//		int endY = (int)(dimension.getHeight()*0.2);
//		
////		int scrollStartHeight = (int)(dimension.getHeight()*0.5);
////		int scrollEndHeight = (int)(dimension.getHeight()*0.2);
//		TouchAction scroll= new TouchAction(driverMob);
//		scroll.press(PointOption.point(x,startY)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(1000)))
//		.moveTo(PointOption.point(x,endY)).release().perform();
		String sList = "com.macys.android:id/label_shopping_preferences_header";
		//String sContContains ="com.macys.android:id/label_get_help_share_feedback";
		String sContContains ="Customer Service";
		MobileElement scroll = (MobileElement) driverMob.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"" +sList + "\"))"
				+ ".scrollIntoView(new UiSelector().text(\"" +sContContains+ "\"))");
	}
	public static void swipe() throws InterruptedException {
//		Dimension dimension = driverMob.manage().window().getSize();
//		int x = dimension.getWidth()/2;
//		int startY =(int)(dimension.getHeight()*0.5);
//		int endY = (int)(dimension.getHeight()*0.2);
//		int scrollStartHeight = (int)(dimension.getHeight()*0.5);
//		int scrollEndHeight = (int)(dimension.getHeight()*0.2);
//		TouchAction scroll= new TouchAction(driverMob);
//		scroll.press(PointOption.point(x,startY)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(1000)))
//		.moveTo(PointOption.point(x,endY)).release().perform();
		TouchAction swipe = new TouchAction(driverMob);
		swipe.press(PointOption.point(555,1445)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(2000)))
		.moveTo(PointOption.point(525,325)).release().perform();
		Thread.sleep(2000);
		
	}
	
	public static void main(String[] args) throws Throwable {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		setDesiredCapabilities(cap);
		
		driverMob = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driverMob.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		loginMacys();
		//search("keyboard");	
		logoutMacys();
//		driverMob.findElement(By.id("com.macys.android:id/label_search")).click();
		
	}

}
