package iosautomationpackage;

import java.net.URL;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ExampleInstalliosApp {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"XCUITest" );
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"iOS");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12.4" );
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone 8" );
		desiredCapabilities.setCapability(MobileCapabilityType.APP,"/Users/ZOP3722/Library/Developer/Xcode/DerivedData/UICatalog-avcvufdodiogxpcktsnixybnqzdw/Build/Products/Debug-iphonesimulator/UICatalog.app" );

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		IOSDriver<WebElement> iosDriver = new IOSDriver<WebElement>(url,desiredCapabilities);
		
		List<WebElement> list = iosDriver.findElementsByXPath("//XCUIElementTypeStaticText");
		Thread.sleep(5000);
		System.out.println(list.size());
		
		for(WebElement li : list) {
			
			System.out.println(li.getText());
		}
		
		iosDriver.findElementByAccessibilityId("Alert Views").click();
		
		Thread.sleep(9000);
		iosDriver.quit();
	}

}
