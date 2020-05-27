import java.io.File;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;

public class DragDemo {

	public static void main(String[] args) throws Throwable {
		
		
		File appDir = new File("src");
		File file =  new File (appDir,"Drag.apk");
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		dc.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<AndroidElement> androidDriver =  new AndroidDriver<AndroidElement>(url,dc);
		
		androidDriver.findElementById("android:id/button1").click();
		Thread.sleep(3000);
		androidDriver.findElementById("com.mobeta.android.demodslv:id/activity_desc").click();
		
		WebElement scroll = androidDriver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector()).scrollIntoView(text(\"Mark Turner\"));");

		
		WebElement source = androidDriver.findElementsById("com.mobeta.android.demodslv:id/drag_handle").get(0);
		
		WebElement destination = androidDriver.findElementsById("com.mobeta.android.demodslv:id/drag_handle").get(13);
		
		TouchAction touchAction = new TouchAction ((MobileDriver)androidDriver);
	
		touchAction.longPress(ElementOption.element(source)).moveTo(ElementOption.element(destination)).release().perform();
		
		
		//Vertical Scrolling
		androidDriver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector()).scrollIntoView(text(\"Mark Turner\"));").click();;

		
		

		
		
		
		
		
		
		
		}

	private static void scroll() {
		// TODO Auto-generated method stub
		
	}
}
