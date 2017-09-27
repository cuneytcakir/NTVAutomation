package dogus.ntv.util.android;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class NtvAndroidConstantsProgramme extends NTVAndroidConstants{
	
	public NtvAndroidConstantsProgramme(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	String baseId= "com.dogus.ntv:id/";
	
	public By programme_button = By.id( baseId + "buttonProgramme");
	public By programme_list = By.id( baseId + "listViewProgrammeGuide");
	public By yayin_akisi = By.id( baseId + "textViewProgrammeGuideListHeaderItem");
}
