package dogus.ntv.util.android;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class NtvAndroidConstantsVideoGallery extends NTVAndroidConstants{
	
	public NtvAndroidConstantsVideoGallery(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	String baseId= "com.dogus.ntv:id/";
	
	public By ntv_menu = By.id( baseId + "ntv_icon");
	public By news_category = By.id( baseId + "spinnerNewsCategory");
	public By menu_videogaleri = By.id( baseId + "buttonVideoGallery");
	public By first_videogallery = By.id( baseId + "textViewGalleryTitle");
	public By video_frame = By.id( baseId + "video_frame");
	public By video_list = By.id( baseId + "listViewVideoList");
	
	public By anasayfa_image = By.xpath("//android.widget.RelativeLayout[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']");
	public By anasayfa_text = By.xpath("//android.widget.RelativeLayout[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.TextView[@text='Ana Sayfa']");
	
	public By turkiye_image = By.xpath("//android.widget.RelativeLayout[@index='1']/android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']");
	public By turkiye_text = By.xpath("//android.widget.RelativeLayout[@index='1']/android.widget.LinearLayout[@index='0']/android.widget.TextView[@text='Türkiye']");
	public By category_turkiye = By.xpath("//android.widget.TextView[@text='Türkiye']");
	
	public By dunya_image = By.xpath("//android.widget.RelativeLayout[@index='2']/android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']");
	public By dunya_text = By.xpath("//android.widget.RelativeLayout[@index='2']/android.widget.LinearLayout[@index='0']/android.widget.TextView[@text='Dünya']");
	public By category_dunya = By.xpath("//android.widget.TextView[@text='Dünya']");
	
	public By spor_image = By.xpath("//android.widget.RelativeLayout[@index='3']/android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']");
	public By spor_text = By.xpath("//android.widget.RelativeLayout[@index='3']/android.widget.LinearLayout[@index='0']/android.widget.TextView[@text='Spor']");
	public By category_spor = By.xpath("//android.widget.TextView[@text='Spor']");
	
	public By teknoloji_image = By.xpath("//android.widget.RelativeLayout[@index='4']/android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']");
	public By teknoloji_text = By.xpath("//android.widget.RelativeLayout[@index='4']/android.widget.LinearLayout[@index='0']/android.widget.TextView[@text='Teknoloji']");
	public By category_teknoloji = By.xpath("//android.widget.TextView[@text='Teknoloji']");
	
	public By sanat_image = By.xpath("//android.widget.RelativeLayout[@index='5']/android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']");
	public By sanat_text = By.xpath("//android.widget.RelativeLayout[@index='5']/android.widget.LinearLayout[@index='0']/android.widget.TextView[@text='Sanat']");
	public By category_sanat = By.xpath("//android.widget.TextView[@text='Sanat']");
	
	public By egitim_image = By.xpath("//android.widget.RelativeLayout[@index='6']/android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']");
	public By egitim_text = By.xpath("//android.widget.RelativeLayout[@index='6']/android.widget.LinearLayout[@index='0']/android.widget.TextView[@text='Eğitim']");
	public By category_egitim = By.xpath("//android.widget.TextView[@text='Eğitim']");
	
	public By nhayat_image = By.xpath("//android.widget.RelativeLayout[@index='7']/android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']");
	public By nhayat_text = By.xpath("//android.widget.RelativeLayout[@index='7']/android.widget.LinearLayout[@index='0']/android.widget.TextView[@text='N Hayat']");
	public By category_nhayat = By.xpath("//android.widget.TextView[@text='N Hayat']");
	

}
