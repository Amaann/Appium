import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;

public class Add extends Calculator {
	
	public static void main(String[] args) throws Throwable {

		AndroidDriver<WebElement> androidDriver = Capability();
		
		WebElement seven = androidDriver.findElementById("com.android.calculator2:id/digit_7"); // 7
		seven.click();
		WebElement plus =  androidDriver.findElementById("com.android.calculator2:id/op_add");
		plus.click();
		WebElement five =  androidDriver.findElementById("com.android.calculator2:id/digit_5");
		five.click();
		WebElement equal = androidDriver.findElementById("com.android.calculator2:id/eq");
		equal.click();
		
		Thread.sleep(5000);
		String result = androidDriver.findElementById("com.android.calculator2:id/result").getText();
		
		if(result.equals("12")) {
			System.out.println("Test is passed....");
		}else {
			System.out.println("Test is failed....");
		}
	   Thread.sleep(5000);
	   androidDriver.quit();
		
	}

}