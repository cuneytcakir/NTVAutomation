package dogus.ntv.base;
import dogus.ntv.page.IOSMainPage;
import dogus.ntv.page.NtvFinancePage;
import dogus.ntv.page.NtvLiveRadioPage;
import dogus.ntv.page.NtvLiveStreamPage;
import dogus.ntv.page.NtvMainPage;
import dogus.ntv.page.NtvNewsDetailPage;
import dogus.ntv.page.NtvNewsPage;
import dogus.ntv.page.NtvPhotoGalleryPage;
import dogus.ntv.page.NtvProgrammePage;
import dogus.ntv.page.NtvVideoGalleryPage;
import dogus.ntv.page.NtvWeatherPage;
import dogus.ntv.page.android.NTVAndroidFinancePage;
import dogus.ntv.page.android.NTVAndroidLiveRadioPage;
import dogus.ntv.page.android.NTVAndroidLiveStreamPage;
import dogus.ntv.page.android.NTVAndroidMainPage;
import dogus.ntv.page.android.NTVAndroidNewsDetailPage;
import dogus.ntv.page.android.NTVAndroidNewsPage;
import dogus.ntv.page.android.NTVAndroidPhotoGalleryPage;
import dogus.ntv.page.android.NTVAndroidProgrammePage;
import dogus.ntv.page.android.NTVAndroidVideoGalleryPage;
import dogus.ntv.page.android.NTVAndroidWeatherPage;
import dogus.ntv.page.ios.NTVIOSMainPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;


public class PageFactory {

	private static PageFactory instance = null;

	ThreadLocal<AppiumDriver<MobileElement>> driver = new ThreadLocal<AppiumDriver<MobileElement>>();
	private PageFactory() {

	}

	public <T> T createPage(Class<T> pageType) {
		AppiumDriver<MobileElement> appiumDriver = driver.get();
		if (appiumDriver instanceof AndroidDriver) {
			AndroidDriver<MobileElement> androidDriver = (AndroidDriver<MobileElement>)appiumDriver;
			if(pageType.isAssignableFrom(NtvMainPage.class)){
				return (T) new NTVAndroidMainPage(androidDriver);
			}else if(pageType.isAssignableFrom(NtvNewsPage.class)){
				return (T) new NTVAndroidNewsPage(androidDriver);
			}else if(pageType.isAssignableFrom(NtvNewsDetailPage.class)){
				return (T) new NTVAndroidNewsDetailPage(androidDriver);
			}else if(pageType.isAssignableFrom(NtvVideoGalleryPage.class)){
				return (T) new NTVAndroidVideoGalleryPage(androidDriver);
			}else if(pageType.isAssignableFrom(NtvPhotoGalleryPage.class)){
				return (T) new NTVAndroidPhotoGalleryPage(androidDriver);
			}else if(pageType.isAssignableFrom(NtvFinancePage.class)){
				return (T) new NTVAndroidFinancePage(androidDriver);
			}else if(pageType.isAssignableFrom(NtvWeatherPage.class)){
				return (T) new NTVAndroidWeatherPage(androidDriver);
			}else if(pageType.isAssignableFrom(NtvProgrammePage.class)){
				return (T) new NTVAndroidProgrammePage(androidDriver);
			}else if(pageType.isAssignableFrom(NtvLiveStreamPage.class)){
				return (T) new NTVAndroidLiveStreamPage(androidDriver);
			}else if(pageType.isAssignableFrom(NtvLiveRadioPage.class)){
				return (T) new NTVAndroidLiveRadioPage(androidDriver);
			}
			
			
		} else if (appiumDriver instanceof IOSDriver) {
			IOSDriver<MobileElement> iosDriver = (IOSDriver<MobileElement>)appiumDriver;
			if(pageType.isAssignableFrom(IOSMainPage.class)){
				return (T) new NTVIOSMainPage(iosDriver);
			}
		}
		return null;
		}
	
	public void setDriver(AppiumDriver<MobileElement> driver) {
		this.driver.set(driver);
	}

	public static PageFactory getInstance() {
		if (instance == null) {
			instance = new PageFactory();
		}
		return instance;
	}

}
