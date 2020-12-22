import java.net.MalformedURLException;

import io.appium.java_client.ios.IOSDriver;

public class AppiumClickTest extends BaseIOSTest{

	public static void main(String[] args) throws MalformedURLException {
		
		IOSDriver driver=DesiredCapabilities();
		driver.findElementsByAccessibilityId("Alart views");
		
		

	}

}
   