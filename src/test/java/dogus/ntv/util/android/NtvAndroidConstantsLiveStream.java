package dogus.ntv.util.android;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class NtvAndroidConstantsLiveStream extends NTVAndroidConstants{
	
	public NtvAndroidConstantsLiveStream(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	String baseId= "com.dogus.ntv:id/";
	
	public By livestream_button = By.id( baseId + "buttonSlidingLiveStream");
	public By live_stream = By.id( baseId + "video_frame");

}
