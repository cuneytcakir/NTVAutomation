package dogus.ntv.page.android;

import dogus.ntv.base.PageFactory;
import dogus.ntv.page.NtvLiveStreamPage;
import dogus.ntv.util.android.NtvAndroidConstantsLiveStream;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class NTVAndroidLiveStreamPage extends NtvAndroidConstantsLiveStream implements NtvLiveStreamPage{
	
	public NTVAndroidLiveStreamPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public NtvLiveStreamPage clickLiveStream() {
		waitSeconds(3);
        clickAndWaitForElement(livestream_button);
		waitSeconds(3);
		return PageFactory.getInstance().createPage(NtvLiveStreamPage.class);
	}
	
	@Override
	public boolean isLiveStreamCheck() {
		waitSeconds(3);
		return isExist(3, live_stream);
	}

}
