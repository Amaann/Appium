import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class Multiply extends Calculator {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		AndroidDriver<WebElement> androidDriver = Capability();
		
		WebElement four = androidDriver.findElementById("com.android.calculator2:id/digit_4");
		for(int a=1; a<=2; a++) {
		four.click();}
		
		WebElement multiply = androidDriver.findElementById("com.android.calculator2:id/op_mul");
		multiply.click();
		WebElement six = androidDriver.findElementById("com.android.calculator2:id/digit_6");
		six.click();
		WebElement equal = androidDriver.findElementById("com.android.calculator2:id/eq");
		equal.click();
		
		String result = androidDriver.findElementById("com.android.calculator2:id/result").getText();
		
		if(result.equals("24")) {
			System.out.println("Test is passed...");
		}else {
			System.out.println("Test is failed....");
		}
		
	

	}

}
