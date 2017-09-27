package dogus.ntv.page.ios;

import dogus.ntv.page.IOSMainPage;
import dogus.ntv.util.ios.IOSConstantsMainPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class NTVIOSMainPage extends IOSConstantsMainPage implements IOSMainPage{
	
	public NTVIOSMainPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IOSMainPage isDeneme() {
		waitSeconds(3);
		clickAndWaitForElement(deneme);
		return this;
	}

}
