import java.net.MalformedURLException;
import static io.appium.java_client.touch.offset.ElementOption.element;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

public class DragDropDemo extends Base{

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		
		AndroidDriver<MobileElement> androidDriver = Capabilities();
		androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		androidDriver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		androidDriver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		
		WebElement source = androidDriver.findElementsByClassName("android.view.View").get(0);
		WebElement destination = androidDriver.findElementsByClassName("android.view.View").get(1);

		TouchAction touchAction = new TouchAction(androidDriver);
		//longoress(source) /move /release(destination)
	
		//touchAction.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
		touchAction.longPress(element(source)).moveTo(element(destination)).release().perform();

	

	}

}
