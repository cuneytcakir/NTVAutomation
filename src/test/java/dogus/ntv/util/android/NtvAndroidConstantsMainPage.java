package dogus.ntv.util.android;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class NtvAndroidConstantsMainPage extends NTVAndroidConstants{
	
	public NtvAndroidConstantsMainPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	String baseId= "com.dogus.ntv:id/";
	
	public By ntv_menu = By.id( baseId + "ntv_icon");
	public By news_category = By.id( baseId + "spinnerNewsCategory");
	
	public By anasayfa_image = By.xpath("//android.widget.RelativeLayout[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']");
	public By anasayfa_text = By.xpath("//android.widget.RelativeLayout[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.TextView[@text='Ana Sayfa']");
	
	public By turkiye_image = By.xpath("//android.widget.RelativeLayout[@index='1']/android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']");
	public By turkiye_text = By.xpath("//android.widget.RelativeLayout[@index='1']/android.widget.LinearLayout[@index='0']/android.widget.TextView[@text='Türkiye']");
	public By category_turkiye = By.xpath("//android.widget.TextView[@text='Türkiye']");
	
	public By dunya_image = By.xpath("//android.widget.RelativeLayout[@index='2']/android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']");
	public By dunya_text = By.xpath("//android.widget.RelativeLayout[@index='2']/android.widget.LinearLayout[@index='0']/android.widget.TextView[@text='Dünya']");
	public By category_dunya = By.xpath("//android.widget.TextView[@text='Dünya']");
	
	public By ekonomi_image = By.xpath("//android.widget.RelativeLayout[@index='3']/android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']");
	public By ekonomi_text = By.xpath("//android.widget.RelativeLayout[@index='3']/android.widget.LinearLayout[@index='0']/android.widget.TextView[@text='Ekonomi']");
	public By category_ekonomi = By.xpath("//android.widget.TextView[@text='Ekonomi']");
	
	public By spor_image = By.xpath("//android.widget.RelativeLayout[@index='4']/android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']");
	public By spor_text = By.xpath("//android.widget.RelativeLayout[@index='4']/android.widget.LinearLayout[@index='0']/android.widget.TextView[@text='Spor']");
	public By category_spor = By.xpath("//android.widget.TextView[@text='Spor']");
	
	public By yasam_image = By.xpath("//android.widget.RelativeLayout[@index='5']/android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']");
	public By yasam_text = By.xpath("//android.widget.RelativeLayout[@index='5']/android.widget.LinearLayout[@index='0']/android.widget.TextView[@text='Yaşam']");
	public By category_yasam = By.xpath("//android.widget.TextView[@text='Yaşam']");
	
	public By saglik_image = By.xpath("//android.widget.RelativeLayout[@index='6']/android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']");
	public By saglik_text = By.xpath("//android.widget.RelativeLayout[@index='6']/android.widget.LinearLayout[@index='0']/android.widget.TextView[@text='Sağlık']");
	public By category_saglik = By.xpath("//android.widget.TextView[@text='Sağlık']");
	
	public By teknoloji_image = By.xpath("//android.widget.RelativeLayout[@index='7']/android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']");
	public By teknoloji_text = By.xpath("//android.widget.RelativeLayout[@index='7']/android.widget.LinearLayout[@index='0']/android.widget.TextView[@text='Teknoloji']");
	public By category_teknoloji = By.xpath("//android.widget.TextView[@text='Teknoloji']");
	
	public By emlak_image = By.xpath("//android.widget.RelativeLayout[@index='8']/android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']");
	public By emlak_text = By.xpath("//android.widget.RelativeLayout[@index='8']/android.widget.LinearLayout[@index='0']/android.widget.TextView[@text='Emlak']");
	public By category_emlak = By.xpath("//android.widget.TextView[@text='Emlak']");
	
	public By sanat_image = By.xpath("//android.widget.RelativeLayout[@index='9']/android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']");
	public By sanat_text = By.xpath("//android.widget.RelativeLayout[@index='9']/android.widget.LinearLayout[@index='0']/android.widget.TextView[@text='Sanat']");
	public By category_sanat = By.xpath("//android.widget.TextView[@text='Sanat']");
	
	public By otomobil_image = By.xpath("//android.widget.RelativeLayout[@index='8']/android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']");
	public By otomobil_text = By.xpath("//android.widget.RelativeLayout[@index='8']/android.widget.LinearLayout[@index='0']/android.widget.TextView[@text='Otomobil']");
	public By category_otomobil = By.xpath("//android.widget.TextView[@text='Otomobil']");
	
	public By egitim_image = By.xpath("//android.widget.RelativeLayout[@index='9']/android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']");
	public By egitim_text = By.xpath("//android.widget.RelativeLayout[@index='9']/android.widget.LinearLayout[@index='0']/android.widget.TextView[@text='Eğitim']");
	public By category_egitim = By.xpath("//android.widget.TextView[@text='Eğitim']");
	
	
	public By menu_logo = By.id( baseId + "imageViewSlidingLogo");
	public By menu_info = By.id( baseId + "buttonSlidingInfo");
	public By menu_haberler = By.id( baseId + "buttonNews");
	public By menu_videogaleri = By.id( baseId + "buttonVideoGallery");
	public By menu_fotogaleri = By.id( baseId + "buttonPhotoGallery");
	public By menu_finans = By.id( baseId + "buttonFinance");
	public By menu_havadurumu = By.id( baseId + "buttonWeather");
	public By menu_yayinakisi = By.id( baseId + "buttonProgramme");
	public By menu_canliizle = By.id( baseId + "buttonSlidingLiveStream");
	public By menu_canlidinle = By.id( baseId + "buttonSlidingLiveRadio");
	public By error_message = By.id( baseId + "errorMessage");
	public By android_alert = By.id("android:id/alertTitle");
	public By news_list = By.id( baseId + "listViewNewsList");
	public By video_list = By.id( baseId + "listViewVideoList");
	public By photo_list = By.id( baseId + "listViewPhotoList");
	public By finance_ad_container = By.id( baseId + "sponsor_ad_container");
	public By weather_list = By.id( baseId + "weatherFragmentParentRelativeLayout");
	public By programme_list = By.id( baseId + "textViewProgrammeGuideListHeaderItem");
	public By canli_izle = By.id( baseId + "video_frame");
	public By first_news = By.id( baseId + "textViewNewsListHeaderItem");
	public By news_date = By.id( baseId + "titiliumTextDate");
	public By news_spot = By.id( baseId + "titiliumTextDetailSpot");
	public By kaynak_txt = By.id( baseId + "titiliumTextLabel");	
	public By haber_baslik = By.id( baseId + "titiliumTextSection");
	public By header_image = By.id( baseId + "imageViewNewsListHeaderItem");
	public By news_image = By.id( baseId + "imageViewRowNewsItem");
	public By news_detail_ads = By.id( baseId + "textLinkRelativeLayout");
	public By engageya_news = By.id( baseId + "engageyaListView");
	
}
