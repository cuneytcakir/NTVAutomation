package dogus.ntv.util.android;
import org.openqa.selenium.By;

import dogus.ntv.base.BasePage;
import dogus.ntv.base.BasePageAndroidPhones;
import dogus.ntv.util.PhoneProperties;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class NTVAndroidConstants extends BasePageAndroidPhones{
	public NTVAndroidConstants(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	// BASE ID
	public String baseId = "com.gittigidiyormobil:id/";
	
	//GENERAL ID
	public By BTTNTAMAM = By.name("Tamam");
	public By BTTNHAYIR = By.name("Hayır");
	public By BTTNEVET = By.name("Evet");
	
	
	// PHONES ID
	// BU CONSTANTLAR TELEFON BAZLI DEĞİŞKEN OLUP phoneConstants.properties 
	// Dosyasında tanımlanmaktadırlar. Eksik olan her telefon için tanımlanması
	// gerekmektedir.
	
	public By WIFI = By.name(PhoneProperties.wifi());
	public By DATA = By.name(PhoneProperties.data());
	public By CAMERA = By.name(PhoneProperties.camera());
}
