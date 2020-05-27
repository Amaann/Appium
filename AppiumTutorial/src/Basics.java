import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Basics extends Base{

	public static void main(String[] args) throws MalformedURLException {
	
		AndroidDriver<MobileElement> androidDriver = Capabilities();
		androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		androidDriver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		androidDriver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		androidDriver.findElementById("android:id/checkbox").click();
		androidDriver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		androidDriver.findElementById("android:id/edit").sendKeys("aman");
		androidDriver.findElementByXPath("//android.widget.Button[@text='OK']").click();

		
	
	}
	

}