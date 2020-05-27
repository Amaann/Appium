import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import static io.appium.java_client.touch.offset.ElementOption.element;


public class Gesture extends Base {

	public static void main(String[] args) throws MalformedURLException {
		
		
		
		AndroidDriver<MobileElement> androidDriver = Capabilities();
		androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		androidDriver.findElementByXPath("//android.widget.TextView[@text='Views']").click();

//		Tap
		TouchAction touchAction = new TouchAction(androidDriver);
		WebElement expandList = androidDriver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		
		touchAction.tap(tapOptions().withElement(element(expandList))).perform();
		
		androidDriver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
	    WebElement peopleName =	androidDriver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		touchAction.longPress(longPressOptions().withElement(element(peopleName)).withDuration(ofSeconds(2))).release().perform();
		
		//Thread.sleep(200);
			
		System.out.println(androidDriver.findElementById("android:id/title").isDisplayed());
		
		
	    
		

	}

}
