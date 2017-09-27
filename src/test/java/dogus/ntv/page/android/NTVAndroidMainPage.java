package dogus.ntv.page.android;

import dogus.ntv.page.NtvMainPage;
import dogus.ntv.util.android.NtvAndroidConstantsMainPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class NTVAndroidMainPage extends NtvAndroidConstantsMainPage implements NtvMainPage{
	
	public NTVAndroidMainPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean isNTVMainPage() {
		waitSeconds(5);
		return isExist(3, ntv_menu);
	}
	
	@Override
	public NtvMainPage isNTVClickMenu() {
		waitSeconds(3);
		clickAndWaitForElement(ntv_menu);
		return this;
	}
	
	@Override
	public boolean isCheckNTVLogo() {
		waitSeconds(5);
		return isExist(3, menu_logo);
	}
	
	@Override
	public boolean isCheckNTVInfo() {
		waitSeconds(5);
		return isExist(3, menu_info);
	}
	
	@Override
	public boolean isCheckMenuNews() {
		waitSeconds(5);
		return isExist(3, menu_haberler);
	}
	
	@Override
	public boolean isCheckMenuVideoGallery() {
		waitSeconds(5);
		return isExist(3, menu_videogaleri);
	}
	
	@Override
	public boolean isCheckPhotoGallery() {
		waitSeconds(5);
		return isExist(3, menu_fotogaleri);
	}
	
	@Override
	public boolean isCheckMenuFinance() {
		waitSeconds(5);
		return isExist(3, menu_finans);
	}
	
	@Override
	public boolean isCheckMenuWeather() {
		waitSeconds(5);
		return isExist(3, menu_havadurumu);
	}
	
	@Override
	public boolean isCheckMenuProgramme() {
		waitSeconds(5);
		return isExist(3, menu_yayinakisi);
	}
	
	@Override
	public boolean isCheckMenuLiveStream() {
		waitSeconds(5);
		return isExist(3, menu_canliizle);
	}
	
	@Override
	public boolean isCheckMenuLiveRadio() {
		waitSeconds(5);
		return isExist(3, menu_canlidinle);
	}

}
