package iosautomationpackage;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.ios.IOSDriver;

public class DatePicker extends IosAppIstallation {

	public static void main(String[] args) throws Throwable {
		
		IOSDriver<WebElement> iosDriver = IosDriver();
		
		iosDriver.findElementByAccessibilityId("Date Picker").click();
		

		List<WebElement>values= iosDriver.findElementsByXPath("//XCUIElementTypePickerWheel");

		
		for(int i=0; i<values.size(); i++) {
			System.out.print(values.get(i).getText());
		}
		
		values.get(0).sendKeys("May 3");

		
		
		Thread.sleep(5000);
		iosDriver.quit();
	}

}
