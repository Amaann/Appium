package iosautomationpackage;
import java.io.File;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class IosAppIstallation {

	public static IOSDriver<WebElement> IosDriver() throws Throwable{
		
		File src = new File("src/apps");
		File file = new File(src,"UICatalog.app");
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"XCUITest" );
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"iOS");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12.4" );
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone 8" );
		desiredCapabilities.setCapability(MobileCapabilityType.APP,file.getAbsolutePath());

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		IOSDriver<WebElement> iosDriver = new IOSDriver<WebElement>(url,desiredCapabilities);
		return iosDriver;
		// TODO Auto-generated method stub
		
		
		

	}

}
