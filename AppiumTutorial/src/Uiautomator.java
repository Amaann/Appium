import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Uiautomator extends Base {

	public static void main(String[] args) throws MalformedURLException {
		
		
		AndroidDriver<MobileElement> androidDriver = Capabilities();
		androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//androidDriver.findElementByAndroidUIAutomator("attribute ("value")")
		androidDriver.findElementByAndroidUIAutomator("text (\"Views\")").click();
		androidDriver.findElementByAndroidUIAutomator("text(\"Animation\")").click();
		
		//validate clickable feature for all options
		//androidDriver.findElementsByAndroidUIAutomator("new UiSelector().property(value)").size();
		System.out.println(androidDriver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
		
		
	}
	

}
