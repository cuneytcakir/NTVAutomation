package dogus.ntv.util.android;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class NtvAndroidConstantsLiveRadio extends NTVAndroidConstants{
	
	public NtvAndroidConstantsLiveRadio(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	String baseId= "com.dogus.ntv:id/";
	
	public By liveradio_button = By.id( baseId + "buttonSlidingLiveRadio");
	public By radio_title = By.id("android:id/title");
	public By radio_text = By.id("android:id/text");
	public By radio_icon = By.id("android:id/icon");
}
