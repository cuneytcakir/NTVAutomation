package dogus.ntv.page.android;


import dogus.ntv.base.PageFactory;
import dogus.ntv.page.NtvNewsDetailPage;
import dogus.ntv.util.android.NtvAndroidConstantsMainPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class NTVAndroidNewsDetailPage extends NtvAndroidConstantsMainPage implements NtvNewsDetailPage{
	
	public NTVAndroidNewsDetailPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean isNTVtitiliumCheck() {
		waitSeconds(3);
		return isExist(3, kaynak_txt);
	}
	
	@Override
	public boolean isNTVAdsCheck() {
		waitSeconds(3);
		return isExist(3, news_detail_ads);
	}
	
	@Override
	public boolean isNTVEngageyaCheck() {
		waitSeconds(3);
		return isExist(3, engageya_news);
	}
	
	@Override
	public NTVAndroidNewsDetailPage swipeNewsDetail() {
		swipeLeftAccordingToPhoneSize();
		return PageFactory.getInstance().createPage(NTVAndroidNewsDetailPage.class);
	}
	
	@Override
	public NTVAndroidNewsDetailPage getNewsDetailtitle() {
		waitSeconds(2);
		getNewsTitle(haber_baslik);
		waitSeconds(2);
		return PageFactory.getInstance().createPage(NTVAndroidNewsDetailPage.class);
	}

}
