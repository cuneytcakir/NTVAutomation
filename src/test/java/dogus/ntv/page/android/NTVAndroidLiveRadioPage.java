package dogus.ntv.page.android;

import dogus.ntv.base.PageFactory;
import dogus.ntv.page.NtvLiveRadioPage;
import dogus.ntv.util.android.NtvAndroidConstantsLiveRadio;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class NTVAndroidLiveRadioPage extends NtvAndroidConstantsLiveRadio implements NtvLiveRadioPage{
	
	public NTVAndroidLiveRadioPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean isNTVRadyoTitle() {
		waitSeconds(5);
		return isExist(3, radio_title);
	}
	
	@Override
	public boolean isNTVRadyoText() {
		waitSeconds(5);
		return isExist(3, radio_text);
	}
	
	@Override
	public NtvLiveRadioPage clickLiveRadio() {
		waitSeconds(1);
        clickAndWaitForElement(liveradio_button);
		waitSeconds(10);
		return PageFactory.getInstance().createPage(NtvLiveRadioPage.class);
	}
	
	@Override
	public NtvLiveRadioPage openNoti() {
		waitSeconds(1);
		swipeDownandOpenNotif();
		return PageFactory.getInstance().createPage(NtvLiveRadioPage.class);
	}
	
	@Override
	public boolean isLiveRadioCheck() {
		waitSeconds(3);
		boolean x = true;
		
		 if (GetElementSelected("buttonSlidingLiveRadio")) {
		        x = true;
		    } 
		    else {
		        x = false;
		    }
		    return x;
	}

}
