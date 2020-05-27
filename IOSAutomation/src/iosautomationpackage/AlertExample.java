package iosautomationpackage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AlertExample {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		File src = new File("src/apps");
		File file = new File(src,"UICatalog.app");
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"XCUITest" );
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"iOS");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12.4" );
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone 8" );
		
		//PATH from system 
		//desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/ZOP3722/Library/Developer/Xcode/DerivedData/UICatalog-avcvufdodiogxpcktsnixybnqzdw/Build/Products/Debug-iphonesimulator/UICatalog.app" );
		desiredCapabilities.setCapability(MobileCapabilityType.APP,file.getAbsolutePath());
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		IOSDriver<WebElement> iosDriver = new IOSDriver<WebElement>(url,desiredCapabilities);
		
	
		iosDriver.findElementByAccessibilityId("Alert Views").click();
		
		//click on OK button
		iosDriver.findElementByAccessibilityId("Okay / Cancel").click();
		iosDriver.findElementByAccessibilityId("OK").click();
		
		Thread.sleep(5000);
		//click on Cancel button
		iosDriver.findElementByAccessibilityId("Okay / Cancel").click();
		iosDriver.findElementByAccessibilityId("Cancel").click();
		
		
		 /* String text = iosDriver.findElementByAccessibilityId("OK").getText();
		if(text.contentEquals("Ok")) {
			System.out.println("passed");
		}else {
			System.out.println("Not passed"); 
		}*/
		
		Thread.sleep(5000);
		iosDriver.quit();


	}

}
