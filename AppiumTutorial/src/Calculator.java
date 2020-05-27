import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator {

	public static AndroidDriver<WebElement> Capability() throws Throwable {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		
//	    dc.setCapability(MobileCapabilityType.DEVICE_NAME, "f189554b");     
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		dc.setCapability("appPackage", "com.android.calculator2");
		dc.setCapability("appActivity", "com.android.calculator2.Calculator");

//		dc.setCapability("appPackage", "com.oneplus.calculator");    <---- this is for real device (onePlus) ---->
//		dc.setCapability("appActivity", "com.oneplus.calculator.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<WebElement> androidDriver = new AndroidDriver<WebElement>(url, dc);
		return androidDriver;
		
//		Thread.sleep(5000);
//		
//		WebElement seven = androidDriver.findElementById("com.android.calculator2:id/digit_7"); // 7
//		seven.click();
//		WebElement plus =  androidDriver.findElementById("com.android.calculator2:id/op_add");
//		plus.click();
//		WebElement five =  androidDriver.findElementById("com.android.calculator2:id/digit_5");
//		five.click();
//		WebElement equal = androidDriver.findElementById("com.android.calculator2:id/eq");
//		equal.click();
//		
//		Thread.sleep(5000);
//		String result = androidDriver.findElementById("com.android.calculator2:id/result").getText();
//		
//		if(result.equals("12")) {
//			System.out.println("Test is passed....");
//		}else {
//			System.out.println("Test is failed....");
//		}
//	   Thread.sleep(5000);
//	   androidDriver.quit();
		
	}

	
}
