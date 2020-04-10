import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ContactsAppTesting {

	public static void main(String[] args) throws Throwable {
		AndroidDriver<MobileElement> driverMob;
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "0249eb7ef3801663");
	cap.setCapability("appPackage", "com.google.android.contacts");
	cap.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");
	driverMob = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
	String sList = "android:id/list";
	String sContContains = "Prince";
	MobileElement scroll = (MobileElement) driverMob.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"" +sList + "\"))"
			+ ".scrollIntoView(new UiSelector().text(\"" +sContContains+ "\"))");
	//scroll.click();
	
	//driverMob.close();
	//swipe out
	TouchAction swipe = new TouchAction(driverMob);
	swipe.press(PointOption.point(16,970)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(1000)))
	.moveTo(PointOption.point(970,970)).release().perform();
	Thread.sleep(2000);
	//swipe in
	//TouchAction swipeIn = new TouchAction(driverMob);
	swipe.press(PointOption.point(1096,520)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(1000)))
	.moveTo(PointOption.point(60,960)).release().perform();


}
}
