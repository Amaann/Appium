package iosautomationpackage;


import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.ios.IOSDriver;

public class PickerView extends IosAppIstallation{

	public static  void main(String[] args) throws Throwable{
		
		IOSDriver<WebElement> iosDriver = IosDriver();
		iosDriver.findElementByAccessibilityId("Picker View").click();
		
		List<WebElement> values = iosDriver.findElementsByXPath("//XCUIElementTypePickerWheel");
		
		String val1 = values.get(0).getAttribute("value");
		String val2	= values.get(1).getAttribute("value");
		String val3	= values.get(2).getAttribute("value");
		
		System.out.println(val1 + " "+val2+" "+val3);
		
		values.get(0).sendKeys("120");
		values.get(1).sendKeys("50");
		values.get(2).sendKeys("180");

		
		
		

		
		

	}

}
