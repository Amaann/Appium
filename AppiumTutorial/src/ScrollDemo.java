import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ScrollDemo extends Base{
	
	public static void main(String[] args) throws Throwable {
		
		AndroidDriver<MobileElement> androidDriver = Capabilities();
		androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		androidDriver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		androidDriver.findElementByAndroidUIAutomator("new UiScrollable (new UiSelector()).scrollIntoView(text(\"Tabs\"));").click();;
		
		
	}


}
