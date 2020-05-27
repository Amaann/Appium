import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseChrome {

	public static  AndroidDriver<AndroidElement>  Capabilities() throws MalformedURLException {
		
		AndroidDriver<AndroidElement> androidDriver;
		/**File appDir =new File("src");
		File file = new File(appDir,"ApiDemos-debug.apk");**/
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Device");
		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
//		desiredCapabilities.setCapability(MobileCapabilityType.APP,file.getAbsolutePath() );
	
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		androidDriver = new AndroidDriver<AndroidElement>(url,desiredCapabilities);
		return androidDriver;
		
		
	}
			
		}
	


