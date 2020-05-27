import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static  AndroidDriver<MobileElement>  Capabilities() throws MalformedURLException {
		
		
		File appDir =new File("src");
		File file = new File(appDir,"src/ApiDemos-debug.apk");
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		desiredCapabilities.setCapability(MobileCapabilityType.APP,file.getAbsolutePath() );
		
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<MobileElement> androidDriver = new AndroidDriver<MobileElement>(url,desiredCapabilities);
		return androidDriver;
		
		
	}
			
		}
	

