import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;


public class swipedemo extends Base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<MobileElement> androidDriver = Capabilities();
		androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		androidDriver.findElementByAndroidUIAutomator("text (\"Views\")").click();
		androidDriver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		androidDriver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		androidDriver.findElementByXPath("//*[@content-desc='9']").click();

		//long press  //on element //2 sec //move to another element and release
		
		TouchAction t = new TouchAction(androidDriver);
		WebElement first = androidDriver.findElementByXPath("//*[@content-desc='15']");
		WebElement second = androidDriver.findElementByXPath("//*[@content-desc='45']");
		
		t.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(second)).release().perform();

	}
	
	

}
