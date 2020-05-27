import java.io.File;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CheckboxRadioButton {
	
	public static void main(String[] args) throws Throwable {
		
		File appDir = new File("src");
		File file = new File(appDir, "src/ApiDemos-debug.apk");
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		capabilities.setCapability("dataReset",false);
		capabilities.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());
		
		 URL url = new URL("http://127.0.0.1:4723/wd/hub");
		 AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,capabilities);
		 
		
		 String appId="io.appium.android.apis";
		 System.out.println("app install status : " +driver.isAppInstalled(appId));
		 //Views
		 driver.findElementsById("android:id/text1").get(10).click(); //click on views // using findElementsById
		 System.out.println("clicked on Views");
		 
		 driver.findElementByXPath("//android.widget.TextView[@text='Controls']").click(); //using x-path for click on Controls option
		 System.out.println("clicked on Controls");

		 driver.findElementByAccessibilityId("2. Dark Theme").click(); // click in Dark theme by using findElementByAccessibilityId
		 System.out.println("clicked on Dark theme");

		 driver.findElementById("io.appium.android.apis:id/edit").sendKeys("AmAn"); // findElementById and sendKeys for sending text in textBox
		 System.out.println("send key = AmAn");
		 
		 WebElement checkButton = driver.findElementById("io.appium.android.apis:id/check1");
		 checkButton.click();
		 System.out.println("clicked on checkbox");

		 driver.findElementById("io.appium.android.apis:id/radio1").click();;
		 System.out.println("clicked on Radiobutton");
		 
		 String time = driver.getDeviceTime();
		 
		 System.out.println(time);
		 
		 driver.quit();
		 System.out.println("App quited");
		 
		
		
			
		}

		
	}


