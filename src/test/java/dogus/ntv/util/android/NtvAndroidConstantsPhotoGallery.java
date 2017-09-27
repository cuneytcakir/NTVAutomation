package dogus.ntv.util.android;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class NtvAndroidConstantsPhotoGallery extends NTVAndroidConstants{
	
	public NtvAndroidConstantsPhotoGallery(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	String baseId= "com.dogus.ntv:id/";
	
	public By ntv_menu = By.id( baseId + "ntv_icon");
	public By news_category = By.id( baseId + "spinnerNewsCategory");
	public By menu_logo = By.id( baseId + "imageViewSlidingLogo");
	public By menu_fotogaleri = By.id( baseId + "buttonPhotoGallery");
	public By first_photogallery = By.id( baseId + "textViewGalleryTitle");
	public By photo_description = By.id( baseId + "photoDescription");
	public By photo_pageNumber = By.id( baseId + "pageNumber");
	
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
	
	public By yasam_image = By.xpath("//android.widget.RelativeLayout[@index='4']/android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']");
	public By yasam_text = By.xpath("//android.widget.RelativeLayout[@index='4']/android.widget.LinearLayout[@index='0']/android.widget.TextView[@text='Yaşam']");
	public By category_yasam = By.xpath("//android.widget.TextView[@text='Yaşam']");
	
	public By teknoloji_image = By.xpath("//android.widget.RelativeLayout[@index='5']/android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']");
	public By teknoloji_text = By.xpath("//android.widget.RelativeLayout[@index='5']/android.widget.LinearLayout[@index='0']/android.widget.TextView[@text='Teknoloji']");
	public By category_teknoloji = By.xpath("//android.widget.TextView[@text='Teknoloji']");
	
	public By sanat_image = By.xpath("//android.widget.RelativeLayout[@index='6']/android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']");
	public By sanat_text = By.xpath("//android.widget.RelativeLayout[@index='6']/android.widget.LinearLayout[@index='0']/android.widget.TextView[@text='Sanat']");
	public By category_sanat = By.xpath("//android.widget.TextView[@text='Sanat']");
	
	public By egitim_image = By.xpath("//android.widget.RelativeLayout[@index='7']/android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']");
	public By egitim_text = By.xpath("//android.widget.RelativeLayout[@index='7']/android.widget.LinearLayout[@index='0']/android.widget.TextView[@text='Eğitim']");
	public By category_egitim = By.xpath("//android.widget.TextView[@text='Eğitim']");


}
