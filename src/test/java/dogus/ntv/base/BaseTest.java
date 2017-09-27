package dogus.ntv.base;

import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class BaseTest {
	
	public static String currentPhone="LG_G4";
	public static String APPPACKAGE = "com.dogus.ntv";
	public static String APPACTIVITY = "com.dogus.ntv.MainActivity";
	public static String BROWSER_NAME = "";
	protected AppiumDriver<MobileElement> driver;
	
	boolean localAndroid = true;
	
	@Before
	public void setUp() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		if(StringUtils.isEmpty(System.getProperty("key"))){
			if(localAndroid){
				capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
				capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator");
				capabilities.setCapability("appPackage", APPPACKAGE);
				capabilities.setCapability("appActivity",APPACTIVITY);
				driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
				

			}
			else{				
				capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
				capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.3.5");
				capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "TA-iP6");
				capabilities.setCapability(MobileCapabilityType.APP, "/Users/cuneytcakir/Desktop/NTV.ipa");
				capabilities.setCapability("udid", "ebc49490abe70badcebe0a3409e42959b017cd2d");
				capabilities.setCapability("automationName", "XCUITest");
				capabilities.setCapability("xcodeOrgId", "N4JW969H2K");
				capabilities.setCapability("xcodeSigningId", "iPhone Developer");
				capabilities.setCapability("noReset", true);
				driver = new IOSDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		} 
			}
		else {
			String hubURL = "http://localhost:4444";

			if (System.getProperty("platform").equals("ANDROID")) {
				capabilities.setCapability(CapabilityType.PLATFORM,Platform.ANDROID);
				capabilities.setCapability("key", System.getProperty("key"));

				driver = new AndroidDriver<MobileElement>(new URL(hubURL), capabilities);
			} else {
				capabilities.setCapability("waitForAppScript", "$.delay(3000);");
				driver = new IOSDriver<MobileElement>(new URL(hubURL), capabilities);
			}
			
		}
		PageFactory.getInstance().setDriver(driver);
	}
	
		private void setCurrentPhone() {
			Map<String, Object> obj = (Map<String, Object>) driver.getCapabilities().getCapability("desired");
			for (Entry s : obj.entrySet()) {
				System.out.println("'" + s.getKey() + "' - '" + s.getValue() + "'");
				if (s.getKey().equals("deviceName")) {
					currentPhone = String.valueOf(s.getValue());
					break;
				}
			}
		}
		
}
